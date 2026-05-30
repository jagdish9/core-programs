package programs.shortestpath.dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class ShortestPathNonNegativeWeighted {
    static class Edge {
        int target;
        int weight;

        public Edge(int target, int weight) {
            this.target = target;
            this.weight = weight;
        }
    }

    static class Pair {
        int node;
        int distance;

        public Pair(int node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }

    public static void main(String[] args) {
        int vertices = 5;

        List<List<Edge>> graph = new ArrayList<>();

        for(int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        //undirected graph
        graph.get(0).add(new Edge(1, 4));
        graph.get(1).add(new Edge(0, 4));

        graph.get(0).add(new Edge(2, 1));
        graph.get(2).add(new Edge(0, 1));

        graph.get(2).add(new Edge(3, 2));
        graph.get(3).add(new Edge(2, 2));

        graph.get(3).add(new Edge(1, 5));
        graph.get(1).add(new Edge(3, 5));

        graph.get(3).add(new Edge(4, 3));
        graph.get(4).add(new Edge(3, 3));

        graph.get(4).add(new Edge(1, 10));
        graph.get(1).add(new Edge(4, 10));

        dijkastra(graph, 0);
    }

    private static void dijkastra(List<List<Edge>> graph, int source) {
        int n = graph.size();

        int[] distance = new int[n];

        Arrays.fill(distance, Integer.MAX_VALUE);

        distance[source] = 0;

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.distance - b.distance);

        pq.offer(new Pair(source, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();

            int currentNode = current.node;
            int currentDistance = current.distance;

            //skip outdated entries
            if(currentDistance > distance[currentNode]) {
                continue;
            }

            List<Edge> edgeList = graph.get(currentNode);

            for (Edge edge : edgeList) {
                int neighbour = edge.target;
                int weight = edge.weight;

                int newDistance = weight + currentDistance;

                if(newDistance < distance[neighbour]) {
                    distance[neighbour] = newDistance;

                    pq.offer(new Pair(neighbour, newDistance));
                }
            }
        }

        //print shortest distance
        for(int i = 0; i < n; i++) {
            System.out.println("Shortest distance from "+source + " to "+i +": "+distance[i]);
        }
    }
}

/*   (0)   4  (1)
      A--------B
      |        |\
    1 |       5| \ 10
      |        |  \
      C--------D---E
      (2)  2  (3) 3 (4)
 */
