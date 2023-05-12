public class sortedMatrix {
    public static boolean searchKeyBottomLeft (int [][] matrix, int key) {
        int row = matrix.length - 1;
        int col = 0;

        while(row >= 0 && col < matrix[0].length) {
            if(matrix[row][col] == key) {
                System.out.println("(" + row + "," + col + ")");
                return true;
            } else if(matrix[row][col] < key) {
                //move right
                col++;
            } else {
                row--;
            }
        }

        System.out.println("Not Found!");
        return false;
    }

    public static boolean searchKeyTopRight (int[][] matrix, int key) {
       int row = 0;
       int col = matrix[0].length - 1;

       while(row <= matrix.length - 1 && col >= 0) {
        if(matrix[row][col] == key) {
            System.out.println("(" + row + "," + col + ")");
            return true;
        } else if(matrix[row][col] > key){
            //move left
            col--;
        } else if(matrix[row][col] < key) {
            //move bottom
            row++;
        }
       }

       System.out.println("Key Not Found");
       return false;
    }
    public static void main (String args[]) {
        int[][] matrix = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 37;

        searchKeyBottomLeft(matrix, key);
    }
}