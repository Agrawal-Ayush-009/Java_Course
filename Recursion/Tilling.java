public class Tilling {
    public static int tillingProblem (int n , int m) {
        if(n < m) {
            return 1;
        }
        if(n == m) {
            return 2;
        }
        //verticle choice
       int firstVerticle = tillingProblem(n-1, m);
       //horizontal choice
       int firstHorizontal = tillingProblem(n-m, m);

       return firstHorizontal + firstVerticle;
    }
    public static void main (String args[]) {
        System.out.println(tillingProblem(3, 2)); // n -> horizontal length & m is verticle length;  tile is m * 1;  
    }
}