import java.util.*;

public class NearestCars {
    static class Points implements Comparable<Points>{
        int x, y, distSq, idx;

        public Points(int x, int y, int distSq, int idx){
            this.x = x;
            this.y = y;
            this.idx = idx;
            this.distSq = distSq;
        }

        @Override
        public int compareTo(Points p2){
            return this.distSq - p2.distSq;
        }
    }
    public static void main(String[] args) {
        int pts[][] = {{3,3}, {5,-1}, {-2,4}};
        int k = 2;

        PriorityQueue<Points> pq = new PriorityQueue<>();

        for(int i = 0; i < pts.length; i++){
            int sq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Points(pts[i][0], pts[i][1], sq, i));
        }

        for(int i = 0; i < k; i++){
            System.out.println("C"+pq.peek().idx);
            pq.remove();
        }


    }
}
