public class N_Queens_Print1Soln {
    public static boolean isSafe(char[][] board, int row, int col) {
        // vertical up
        for(int i = row; i >= 0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for(int i = row, j = col; i >= 0 && j >= 0; i--,j--) {
            if(board[i][j] == 'Q') {
                return false; 
            }
        }

        // diagonal right up

        for(int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static boolean nQueens(char[][] board, int row) {
        if(row == board.length) {
            System.out.println("-------- Chess Board --------");
            // printBoard(board);
            count++;
            return true;
        }

        for(int j = 0; j < board.length; j++) {
           if(isSafe(board, row, j)) {
            board[row][j] = 'Q';
            if(nQueens(board, row + 1)) {
                return true;
            }
            board[row][j] = 'X';
           }
        }

        return false;
    }
    
    public static void printBoard (char[][] board) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int count = 0;

    public static void main (String args[]) {
        int n = 2;
        char board[][] = new char[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        if(nQueens(board,0)) {
            System.out.println("Soution is Possible & One Solution is ");
            printBoard(board);
        } else {
            System.out.println("Solution is Not Possible");
        }
        // System.out.println("Total Ways to arrange N Queens is " + count);
    }
}