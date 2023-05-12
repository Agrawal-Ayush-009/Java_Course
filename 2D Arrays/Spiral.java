import java.util.*;

public class Spiral{
    public static void printSpiral (int [][] matrix) {
        int Startrow = 0;
        int Startcol = 0;
        int endRow = matrix.length;
        int endCol = matrix[0].length;

        System.out.print("The Spiral of the Matrix : ");
        while(Startcol < endCol && Startrow < endRow) {
            for(int col = Startcol; col < endCol; col++) {
                System.out.print(matrix[Startrow][col] + " ");
            }

            Startrow++;
            for(int row = Startrow; row < endRow; row++) {
                System.out.print(matrix[row][endCol - 1] + " ");
            }

            endCol--;
            for(int col = endCol - 1; col >= Startcol; col--) {
                if(Startrow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow - 1][col] + " ");
            }

            endRow--;
            for(int row = endRow - 1; row >= Startrow; row--) {
                if(Startcol == endCol) {
                    break;
                }
                System.out.print(matrix[row][Startcol] + " ");
            }

            Startcol++;

        }
            

    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][4];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        printSpiral(matrix);  
    }
}