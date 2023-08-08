import java.util.*;

public class WeakestSoldier{

    static class Row implements Comparable<Row>{
        int idx;
        int sum;

        public Row(int idx, int sum){
            this.idx = idx;
            this.sum = sum;
        }

        @Override
        public int compareTo(Row r2){
            if(this.sum - r2.sum != 0){
                return this.sum - r2.sum;
            }else{
                return this.idx - r2.idx;
            }
        }
    }

    public static void main(String[] args) {

        int mat[][] ={{1,0,0,0},
                      {1,1,1,1},
                      {1,0,0,0},
                      {1,0,0,0}};
        
        PriorityQueue<Row> pq = new PriorityQueue<>();

        for(int i = 0; i < mat.length; i++){
            int sum = 0;
            for(int j = 0; j < mat.length; j++){
                sum += mat[i][j];
            }
            pq.add(new Row(i, sum));
        }


        int k = 2;

        for(int i = 0; i < k; i++){
            System.out.println("Row-"+pq.remove().idx);
        }
                      
    }
}
