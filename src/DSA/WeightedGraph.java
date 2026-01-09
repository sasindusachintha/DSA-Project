
package DSA;

import java.util.ArrayList;

class Edge {

    int dest;
    int weight;

    Edge(int d, int w) {
        dest = d;
        weight = w;
    }
}

public class WeightedGraph {

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[4];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(1, 5));
        graph[0].add(new Edge(2, 2));
        graph[1].add(new Edge(2, 1));
        graph[2].add(new Edge(3, 7));
    
        for (int i = 0; i < v; i++) {
            System.out.print(i + "->");
            for (Edge e : graph[i]) {
                System.out.print("(" + e.dest + "," + e.weight + ")");
            }
            System.out.println();
        }
    }
}
