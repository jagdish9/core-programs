package programs.shortestpath.bfs;

import java.util.*;

public class ShortestPathInDirectedGraph {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();

        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("C"));
        graph.put("C", Arrays.asList("D", "E"));

        getShortestPath(graph, "A", "D");
    }

    private static void getShortestPath(Map<String, List<String>> graph, String source,
                                        String destination) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Map<String, String> parent = new HashMap<>();

        queue.offer(source);
        visited.add(source);
        parent.put(source, null);

        while (!queue.isEmpty()) {
            String current = queue.poll();

            if(current.equals(destination)) {
                break;
            }

            List<String> neighbours = graph.get(current);

            for(String neighbour : neighbours) {
                if(!visited.contains(neighbour)) {
                    visited.add(neighbour);
                    queue.offer(neighbour);
                    parent.put(neighbour, current);
                }
            }
        }

        List<String> paths = new ArrayList<>();

        String current = destination;

        while (current != null) {
            paths.add(current);
            current = parent.get(current);
        }

        Collections.reverse(paths);

        System.out.println(paths);

        StringBuilder sb = new StringBuilder();

        paths.forEach(s -> sb.append(s).append(" -> "));

        System.out.println(sb);
    }
}

/*  (1)   E(4)
    B    ^
    ^\  /
    | >C (2)
    | > \
    A/   >
    (0)   D(3)

    Directed and unweighted graph
    So we will solve using BFS

 */
