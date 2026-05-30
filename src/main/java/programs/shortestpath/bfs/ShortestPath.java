package programs.shortestpath.bfs;

import java.util.*;

public class ShortestPath {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();

        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("D", "E"));
        graph.put("C", Arrays.asList("F"));
        graph.put("D", new ArrayList<>());
        graph.put("E", Arrays.asList("G"));
        graph.put("F", new ArrayList<>());
        graph.put("G", new ArrayList<>());

        findShortestPath(graph, "A", "G");
    }

    private static void findShortestPath(Map<String, List<String>> graph, String source, String destination) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Map<String, String> parent = new HashMap<>();

        queue.offer(source);
        visited.add(source);
        parent.put(source, null);

        while (!queue.isEmpty()) {
            String node = queue.poll();

            if(node.equals(destination)) {
                break;
            }

            List<String> g = graph.get(node);

            for(String neighbour : graph.get(node)) {
                if(!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.offer(neighbour);
                    parent.put(neighbour, node);
                }
            }

            /*graph.get(node).stream()
                    .map(neighbour -> {
                        if(!visited.contains(neighbour)) {
                            visited.add(neighbour);
                            queue.offer(neighbour);
                            parent.put(neighbour, node);
                        }
                        return queue;
                    });*/
        }

        List<String> path = new ArrayList<>();

        String current = destination;

        while (current != null) {
            path.add(current);
            current = parent.get(current);
        }

        Collections.reverse(path);

        System.out.println("Shortest Path: "+path);
    }
}

/*
        A
       /  \
      B    C
     / \    \
    D   E    F
         \
          G

    Source: A
    Destination: G
 */
