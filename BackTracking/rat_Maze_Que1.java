public class rat_Maze_Que1 {
    public static boolean isSafe (int[][] maze, int x, int y) {
        return (x >= 0 && x < maze.length && y >= 0 && y < maze .length && maze[x][y] == 1);
    }

    public static boolean findPath(int[][] maze, int x, int y, int[][] sol) {
        if(x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }

        if(isSafe(maze, x, y) == true) {
            if(sol[x][y] == 1) {
                return false;
            }
            sol[x][y] = 1;

            if(findPath(maze, x+1, y, sol)) {
                return true;
            }
            if(findPath(maze, x, y+1, sol)) {
                return true;
            }
        } 

        return false;
    }

    public static void printMaze (int[][] maze) {
        for(int i = 0; i < maze.length; i++) {
            for(int j = 0; j < maze.length; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    } 

    public static void main (String args[]) {
        int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };

        int n = maze.length;

        int sol[][] = new int[n][n];

        if(findPath(maze, 0, 0,sol) == false) {
            System.out.println("Solution doesn't exists ");
            return;
        }

        printMaze(sol);
        return;

        
        
        
    }
}