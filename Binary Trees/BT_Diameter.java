import java.security.NoSuchAlgorithmException;

public class BT_Diameter{
    static class Node{
        int data;
        Node left,right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    } 


    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    public static int Dia_1(Node root){// Approach 1 : Time Complexity = O(n^2).
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        int rd = Dia_1(root.right);
        int ld = Dia_1(root.left);

        int selfDia = lh + rh + 1;

        return Math.max(selfDia, Math.max(ld, rd));

    }


    static class Info{//creating a class to calculate and return diameter and height at the same time.
        int diam;
        int height;

        Info(int diam, int height){
            this.diam = diam;
            this.height = height;
        }
    }

    public static Info diam_2(Node root) { //Approach 2: Time Complexity O(n).
        if(root == null){
            return new Info(0, 0);
        }

        Info leftinfo = diam_2(root.left);
        Info rightinfo = diam_2(root.right);

        int finalDiam = Math.max(rightinfo.height + leftinfo.height + 1, (Math.min(leftinfo.diam, rightinfo.diam)));
        int finalHeight = Math.max(leftinfo.height, leftinfo.height) + 1;

        return new Info(finalDiam, finalHeight);

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
         root.right.left = new Node(6);
         root.right.right = new Node(7);

        System.out.println(diam_2(root).diam);
    }
}