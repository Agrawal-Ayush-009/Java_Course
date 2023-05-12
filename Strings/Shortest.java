import java.util.*;

public class Shortest {
    public static void shortestPath (String path) {
        int pathHorizontal = 0;
        int pathVertical = 0;
        for(int i = 0; i < path.length(); i++) {
            if(path.charAt(i) == 'W') {
                pathVertical--;
            }
            if(path.charAt(i) == 'N') {
                pathHorizontal++;
            }
            if(path.charAt(i) == 'S') {
                pathHorizontal--;
            }
            if(path.charAt(i) == 'E') {
                pathVertical++;
            }
        }
        int a = pathHorizontal*pathHorizontal + pathVertical*pathVertical;
        double shortestPath = Math.sqrt((double)a);

        System.out.println(shortestPath);
    }

    public static void main (String args[]) {

        String path = "WNEENESENNN";
        
        shortestPath(path);
    }
}