import java.util.ArrayList;

public class QuestionsBST {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int minDiff = Integer.MAX_VALUE;
    public static Node minNode = null;

    public static void minDifferenceNode(Node root, int k){
        if(root == null){
            return;
        }

        if(root.data < k){
            if(minDiff > Math.abs(root.data - k)){
                minDiff = Math.abs(root.data - k);
                minNode = root;
            }
            minDifferenceNode(root.right, k);
        }else if(root.data > k){
            if(minDiff > Math.abs(root.data - k)){
                minDiff = Math.abs(root.data - k);
                minNode = root;
            }
            minDifferenceNode(root.left, k);
        }else{
            minNode = root;
            return;
        }
    }

    public static void inorder(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }

        inorder(root.left, path);
        path.add(root.data);
        inorder(root.right, path);
    }


    public static int KthSmallest(Node root, int k){

        ArrayList<Integer> inorder = new ArrayList<>();
        inorder(root, inorder);

        return inorder.get(k);

    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(20);

        

        // minDifferenceNode(root, 19);
        // System.out.println(minNode.data);

        System.out.println(KthSmallest(root, 5));
    }
}
