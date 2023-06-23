import javax.sound.midi.Synthesizer;

public class KthAncestor{
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int kthAnces(Node root, int n, int k){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int left = kthAnces(root.left, n, k);
        int right = kthAnces(root.right, n, k);

        if(left == -1 && right != -1){
            if(right + 1 == k){
                System.out.println(root.data);
            }
            return right + 1;
        }

        if(right == - 1 && left != -1){
            if(left + 1 == k){
                System.out.println(root.data);
            }
            return left + 1;
        }

        return -1;

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

         kthAnces(root, 4, 0);
    }
}