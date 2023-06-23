public class Question3{
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean deleteLeafNode(Node root, int x){
        if(root == null){
            return false;
        }

        if(root.left == null && root.right == null && root.data == x){
            return true;
        }

        boolean left = deleteLeafNode(root.left, x);
        boolean right = deleteLeafNode(root.right, x);

        if(left == true){
            root.left = null;
        }

        if(right == true){
            root.right = null;
        }

        return false;

    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {

        /*
        1 
       / \
      3   2
     / \ 
    3   2 
         */
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(2);

        int x = 3;

        deleteLeafNode(root, x);

        preOrder(root);
    }
}