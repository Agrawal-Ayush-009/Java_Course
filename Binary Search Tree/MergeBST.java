import java.util.*;
public class MergeBST {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> seq){
        if(root == null){
            return;
        }

        getInorder(root.left, seq);
        seq.add(root.data);
        getInorder(root.right, seq);
    }

    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b, ArrayList<Integer> ans){
        int i = 0;
        int j = 0;

        while(i < a.size() && j < b.size()){
            if(a.get(i) > b.get(j)){
                ans.add(b.get(j));
                j++;
            }else{
                ans.add(a.get(i));
                i++;
            }
        }


        while(i < a.size()){
            ans.add(a.get(i));
            i++;
        }

        while(j < b.size()){
            ans.add(b.get(j));
            j++;
        }
    }

    public static Node BalancedBST(ArrayList<Integer> arr, int l, int r){
        if(l > r){
            return null;
        }

        int mid = l - (l-r)/2;

        Node root = new Node(arr.get(mid));
        root.left = BalancedBST(arr, l, mid - 1);
        root.right = BalancedBST(arr, mid + 1, r);

        return root;
    }


    public static void preorder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static Node mergeBST(Node root1, Node root2){
        ArrayList<Integer> inorder1 = new ArrayList<>();
        getInorder(root1, inorder1);


        ArrayList<Integer> inorder2 = new ArrayList<>();
        getInorder(root2, inorder2);


        ArrayList<Integer> sorted = new ArrayList<>();

        merge(inorder1, inorder2, sorted);


        return BalancedBST(sorted, 0, sorted.size() - 1);
        

    }


    public static void main(String[] args) {
    /*
           2
          / \
         1   4   
         
     */

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

    /*       9
            / \
           3   12
    
    */  
        
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBST(root1, root2);
        
        preorder(root);


    }
}
