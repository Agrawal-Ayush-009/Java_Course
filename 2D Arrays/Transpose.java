public class Transpose {
    public static void printTranspose (int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                newMatrix[j][i] = matrix[i][j];
            }
        }

        for(int i = 0; i < newMatrix.length; i++) {
            for(int j = 0; j < newMatrix[0].length; j++) {
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main (String args[]) {
        int[][] matrix = {{1,2,3,4},{9,8,6,3}};

        printTranspose(matrix);
        
    }
}