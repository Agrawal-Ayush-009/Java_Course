public class BSTQuestions {
    static class Node{
        int data;
        Node left, right;
    

        public Node(int data){
            this.data = data;
            this.left  = this.right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(9);
        root.right = new Node(2);
        root.left.left = new Node(6);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(7);
        root.right.right = new Node(3);


    }
}
