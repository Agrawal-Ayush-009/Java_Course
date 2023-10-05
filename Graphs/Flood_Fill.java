public interface Flood_Fill {

    public void helperFun(int[][] image, int sr, int sc, int color, boolean vis[][], int orgCol){

        if(sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != orgCol || vis[sr][sc] == true){
            return;
        }

        image[sr][sc] = color;
        
        helperFun(image, sr+1, sc, color, vis, orgCol);

        helperFun(image, sr-1, sc, color, vis, orgCol);

        helperFun(image, sr, sc+1, color, vis, orgCol);

        helperFun(image, sr, sc-1, color, vis, orgCol);



        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        boolean vis[][] = new boolean[image.length][image[0].length];

        helperFun(image, sr, sc, color, vis, image[sr][sc]);

        return image;
        
    }
    public static void main(String[] args) {
        
    }
}
