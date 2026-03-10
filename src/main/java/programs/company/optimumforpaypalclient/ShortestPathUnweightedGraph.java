package programs.company.optimumforpaypalclient;

import java.util.*;

public class ShortestPathUnweightedGraph {
    public static void main(String[] args) {
        int v = 5;

        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(1).add(4);
        //graph.get(2).add(4);
        graph.get(4).add(2);

        shortestPath(graph, v, 0);
    }

    private static void shortestPath(List<List<Integer>> graph, int v, int source) {
        int[] distance = new int[v];
        Arrays.fill(distance, -1);

        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        distance[source] = 0;

        while (!queue.isEmpty()) {
            int vertexData = queue.poll();

            for(int neighbour : graph.get(vertexData)) {
                if(distance[neighbour] == -1) {
                    distance[neighbour] = distance[vertexData] + 1;
                    queue.add(neighbour);
                }
            }
        }

        System.out.println("Shortest distance from source:");
        for(int i = 0; i < v; i++) {
            System.out.println(source + " -> " + i + " = "+ distance[i]);
        }
    }
}
