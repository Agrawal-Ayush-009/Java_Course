public class BT_Hieght{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
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

    public static int no_of_nodes(Node root){
        if(root == null){
            return 0;
        }

        int leftNode = no_of_nodes(root.left);
        int rightNode = no_of_nodes(root.right);

        return leftNode + rightNode + 1;
    }

    public static int sum_Nodes(Node root){
        if(root == null){
            return 0;
        }

        int ls = sum_Nodes(root.left);
        int rs = sum_Nodes(root.right);

        return ls + rs + root.data;

        }
    public static void main(String[] args) {
        /*
                1
               / \
              2    3
             / \  / \ 
            4   5 6  7


         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // System.out.println("Height = " + height(root));
        // System.out.println("No.of Nodes = " + no_of_nodes(root));
        System.out.println("Sum of Node = " + sum_Nodes(root));
    }
}