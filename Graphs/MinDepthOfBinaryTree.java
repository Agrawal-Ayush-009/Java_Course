import java.util.LinkedList;
import java.util.Queue;

public class MinDepthOfBinaryTree {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class NodePair{
        Node node;
        int depth;

        public NodePair(Node node, int depth){
            this.node = node;
            this.depth = depth;
        }
    }

    public static int mindepth(Node root){
        if(root == null){
            return 0;
        }

        Queue<NodePair> q = new LinkedList<>();
        q.add(new NodePair(root, 0));

        while(!q.isEmpty()){
            NodePair curr = q.remove();
            int depth = curr.depth;
            if(curr.node.left == null && curr.node.right == null){
                return depth;
            }

            if(curr.node.left != null){
                curr.node = 
                q.add(new NodePair(curr.node.left, curr.depth + 1));
            }

            if(curr.node.right != null){
                q.add(new NodePair(curr.node.right, curr.depth + 1));
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(6);
        root.left.right = new Node(5);
        root.right.left = new Node(9);

        System.out.println(mindepth(root));
    }
}
