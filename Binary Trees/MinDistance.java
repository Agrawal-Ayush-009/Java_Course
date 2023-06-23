import java.util.*;

public class MinDistance{
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLCA = lca(root.left, n1, n2);
        Node rightLCA = lca(root.right, n1, n2);

        if(leftLCA == null){
            return rightLCA;
        }

        if(rightLCA == null){
            return leftLCA;
        }

        return root;
    }

    public static int lcaDist(Node root, int n) {
        if(root == null){
            return - 1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int righDist = lcaDist(root.right, n);

        if(leftDist == -1 && righDist > -1){
            return righDist + 1;
        }

        if(leftDist > -1 && righDist == -1){
            return leftDist + 1;
        }

        return -1;
    }

    public static int distace(Node root, int n1, int n2){
        Node lca = lca(root, n1, n2);

        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;
    }
    public static void main(String[] args) {
    /*
         1
        / \
       2   3
      / \ / \
     4  5 6  7

         */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.right = new Node(7);
         root.right.left = new Node(6);

         int n1 = 4, n2 = 7;
         
         System.out.println(distace(root, n1, n2));
         
    }
}