import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;
import javax.sound.sampled.DataLine.Info;

//This Question is Dijstra's Algorithm
public class CheapestFlight_K_Stops {
    static class Edge{
        int src, dest, wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(int flight[][], ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < graph.length; i++){
            int src = flight[i][0];
            int dest = flight[i][1];
            int wt = flight[i][2];
            
            graph[src].add(new Edge(src, dest, wt));
        }
    }

    static class Info{
        int cost, v, stops;

        public Info(int v, int cost, int stops){
            this.cost = cost;
            this.v = v;
            this.stops = stops;
        }
    }

    public static int cheapestFlight(int n, int flight[][], int src, int dest, int k){
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flight, graph);

        int dist[] = new int[n];

        for(int i = 0; i < n; i++){
            if(i != src)
            dist[i] = Integer.MAX_VALUE;
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr.stops > k){
                break;
            }

            for(int i = 0; i < graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;

                if(curr.cost + wt < dist[v] && curr.stops <= k){
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }
        }

        if(dist[dest] == Integer.MAX_VALUE){
            return -1;
        }else{
            return dist[dest];
        }
    }
    public static void main(String[] args) {
        int flight[][] = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int src = 0, dest = 3, k = 1;

        System.out.println(cheapestFlight(4, flight, src, dest, k));
    }
}
