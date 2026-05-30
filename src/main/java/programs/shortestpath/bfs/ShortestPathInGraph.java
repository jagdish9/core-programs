package programs.shortestpath.bfs;

import java.util.*;

public class ShortestPathInGraph {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();

        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "C", "D"));
        graph.put("C", Arrays.asList("A", "B", "E"));
        graph.put("D", Arrays.asList("B", "E", "F"));
        graph.put("E", Arrays.asList("C", "D", "F"));
        graph.put("F", Arrays.asList("D", "E"));

        findShortestPathInGraph(graph, "A", "F");
    }

    private static void findShortestPathInGraph(Map<String, List<String>> graph,
                                                String source, String destination) {
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

            List<String> nodes = graph.get(node);

            for (String neighbour : nodes) {
                if(!visited.contains(neighbour)) {
                    queue.offer(neighbour);
                    visited.add(neighbour);
                    parent.put(neighbour, node);
                }
            }

        }

        List<String> shortestPath = new ArrayList<>();

        String current = destination;

        while (current != null) {
            shortestPath.add(current);
            current = parent.get(current);
        }

        Collections.reverse(shortestPath);

        System.out.println(shortestPath);
    }
}

/*
     A
    / \
   B---C
   |   |
   D---E
   \   /
     F

     Cycle exists so we need visited set to prevent infinite loop
     Source: A
     Destination: F
     Result: A -> B -> D -> F or A -> C -> E -> F
 */
