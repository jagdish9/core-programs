package programs.shortestpath.bfs;

import java.util.*;

public class ShortestDistanceInGraph {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();

        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "C", "D"));
        graph.put("C", Arrays.asList("A", "B", "E"));
        graph.put("D", Arrays.asList("B", "E", "F"));
        graph.put("E", Arrays.asList("C", "D", "F"));
        graph.put("F", Arrays.asList("D", "E"));

        int distance = findShortestDistanceInGraph(graph, "A", "F");
        System.out.println(distance);
    }

    private static int findShortestDistanceInGraph(Map<String, List<String>> graph,
                                                String source, String destination) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Map<String, Integer> distance = new HashMap<>();

        queue.offer(source);
        visited.add(source);
        distance.put(source, 0);

        while (!queue.isEmpty()) {
            String node = queue.poll();

            if(node.equals(destination)) {
                return distance.get(node);
            }

            List<String> nodes = graph.get(node);

            for (String neighbour : nodes) {
                if(!visited.contains(neighbour)) {
                    queue.offer(neighbour);
                    visited.add(neighbour);
                    distance.put(neighbour, distance.get(node) + 1);
                }
            }
        }

        return -1;
    }
}
