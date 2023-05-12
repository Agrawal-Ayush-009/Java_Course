public class Diagonal{
    public static void sumOfDiagonal2 (int [][] matrix) { // more optimized O(n);
        int sum = 0;
        for(int i = 0; i < matrix.length; i++) {
            //pd
            sum += matrix[i][i];
            //
            if(i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 -i];
            }
        }
    }

    public static void sumOfDiagonal (int[][] matrix) { // less Optimized O(n^2);
        int sum = 0;
        int mid = (matrix.length - 1) / 2;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                if(i == j) {
                    sum += matrix[i][j];
                }
            }
        }

        if(matrix.length == matrix[0].length && matrix.length % 2 != 0) {
            sum -= matrix[mid][mid];
        }

        int j = matrix[0].length - 1;
        for(int i = 0 ; i < matrix.length && j >= 0; i++, j--) {
            sum += matrix[i][j];
        }

        System.out.println(sum);
    }
    public static void main (String args[]) {
        int matrix[][] ={{1,2,3,4}, {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        sumOfDiagonal(matrix);
    }
}