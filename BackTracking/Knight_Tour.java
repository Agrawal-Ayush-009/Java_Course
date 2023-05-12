public class Knight_Tour {
    public static int n = 8;
    public static boolean isSafe(int[][] chess, int row, int col) {
        return (row >= 0 && row < n && col >= 0 && col < n && chess[row][col] == 0);
    }

    public static void printChess (int[][] chess) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean printMoves() {
        int[][] chess = new int[8][8];
        for(int i=0; i < n; i++) {
            for(int j=0; j < chess.length; j++) {
                chess[i][j] = 0;
            }
        }
        int rowMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int colMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        
        if(!printMovesutil(chess, 0, 0, 1, rowMove, colMove)) {
            System.out.println("Solution Not Exist");
            return false;
        }else {
            printChess(chess);
        }
        
        return true;
    }

    public static boolean printMovesutil(int[][] chess, int row, int col, int count, int[] rowMove, int[] colMove) {
        int k, nextCol, nextRow;
        if(count == n * n) {
            return true;
        }
        
        for(k=0; k < n; k++) {
         nextRow = row + rowMove[k]; 
         nextCol = col + colMove[k];

         if(isSafe(chess, nextRow, nextCol)) {
            chess[nextRow][nextCol] = count;
            if(printMovesutil(chess, nextRow, nextCol, count + 1, rowMove, colMove)) {
                return true;
            } else {
                chess[nextRow][nextCol] = 0;
            }
         }   

        }
        return false;
    }
    public static void main (String args[]) {
        
        printMoves();
    }
}