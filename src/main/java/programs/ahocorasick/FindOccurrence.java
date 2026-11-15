package programs.ahocorasick;

import java.util.*;

public class FindOccurrence {

    static class Node {
        Map<Character, Node> children = new HashMap<>();
        Node failure;
        List<String> output = new ArrayList<>();
    }

    private final Node root = new Node();

    public static void main(String[] args) {
        FindOccurrence findOccurrence = new FindOccurrence();

        findOccurrence.addPattern("he");
        findOccurrence.addPattern("she");
        findOccurrence.addPattern("his");
        findOccurrence.addPattern("hers");

        findOccurrence.buildFailureLinks();

        String text = "ushers";

        findOccurrence.search(text);
    }

    private void search(String text) {
        Node current = root;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            while (current != root &&
            !current.children.containsKey(ch)) {
                current = current.failure;
            }

            current = current.children.getOrDefault(ch, root);

            if(!current.output.isEmpty()) {
                for(String pattern : current.output) {
                    int startIndex = i - pattern.length() + 1;

                    System.out.println(
                            "Found pattern: " + pattern +
                                    " at index " + startIndex
                    );
                }
            }
        }
    }

    private void buildFailureLinks() {
        Queue<Node> queue = new LinkedList<>();

        for(Node child : root.children.values()) {
            child.failure = root;
            queue.offer(child);
        }

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            for(Map.Entry<Character, Node> entry : current.children.entrySet()) {
                char ch = entry.getKey();
                Node child = entry.getValue();

                Node failureNode = current.failure;

                while (failureNode != null &&
                !failureNode.children.containsKey(ch)) {
                    failureNode = failureNode.failure;
                }

                if(failureNode == null) {
                    child.failure = root;
                } else {
                    child.failure = failureNode.children.get(ch);

                    child.output.addAll(child.failure.output);
                }

                queue.offer(child);
            }
        }
    }

    private void addPattern(String pattern) {
        Node current = root;

        for (char ch : pattern.toCharArray()) {
            current = current.children.computeIfAbsent(ch, k -> new Node());
        }

        current.output.add(pattern);
    }
}
