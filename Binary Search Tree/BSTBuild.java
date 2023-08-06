import java.util.*;

public class BSTBuild{
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //[INSERT]
    public static Node insert(Node root, int val){
        if(root == null){
            Node node = new Node(val);
            return node;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
           root.right =  insert(root.right, val);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    //[SEARCH]
    public static boolean search(Node root, int k){ //O(H) -> H: Hieght of Tree
        if(root == null){
            return false;
        }

        if(root.data > k){
            return search(root.left, k);
        }else if(root.data < k){
            return search(root.right, k);
        }

        return true;
    }

    //[DELETE] [Start]
    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }else if(root.data > val){
            root.left = delete(root.left, val);
        }else{

            //Case1:
            if(root.left == null && root.right == null){
                return null;
            }

            //Case2:
            if(root.left == null){
                return root.right;
            }
            
            if(root.right == null){
                return root.left;
            }


            Node IS = findInorderSuccesor(root.right);

            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }

        return root;
    }

    public static Node findInorderSuccesor(Node root){
        if(root.left == null){
            return root;
        }

        root = findInorderSuccesor(root.left);

        return root;
    }
    //[DELETE] [END]


    //[PRINT in RANGE]
    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }


        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }


        if(root.data <= k1){
            printInRange(root.left, k1, k2);
        }

        if(root.data >= k2){
            printInRange(root.right, k1, k2);
        }
    }
    

    //[ROOF to LEAF][START]
    public static void print(ArrayList<Integer> path){
        for(int i = 0; i < path.size(); i++){
            System.out.print(path.get(i) + " -> ");
        }
        System.out.println("Null");
    }

    public static ArrayList<Integer> path = new ArrayList<>();

    public static void rootToLeaf(Node root){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            // System.out.println(path);
            print(path);
        }
        rootToLeaf(root.left);
        rootToLeaf(root.right);

        path.remove(path.size() - 1);
    }
    //[ROOF to LEAF][END]


    //[VALIDATE BST]
    public static boolean isValidBST(Node root, int min, int max){
        if(root == null){
            return true;
        }

       if(root.data <= min){
        return false;
       }else if(root.data >= max){
        return false;
       }

        boolean flagLeft = isValidBST(root.left, min, root.data);

        boolean flagRight = isValidBST(root.right, root.data, max);

        return flagLeft && flagRight;
    }

    //[SORTED ARRAY to BALANCED BST]
    public static Node arrayToBST(int[] arr, int l, int r){
        if(l > r){
            return null;
        }

        int mid = l - (l-r)/2;

        Node root = new Node(arr[mid]);

        root.left = arrayToBST(arr, l, mid - 1);
        root.right = arrayToBST(arr, mid + 1, r);

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

    //[NORMAL BST to BALANCED BST]
    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }

        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node normalBSTtoBalanced(Node root){
        ArrayList<Integer> inorder =  new ArrayList<>();

        getInorder(root, inorder);


        return arrayToBST(inorder, 0, inorder.size() - 1);

    }

    public static Node arrayToBST(ArrayList<Integer> arr, int l, int r){
        if(l > r){
            return null;
        }

        int mid = l - (l-r)/2;

        Node root = new Node(arr.get(mid));

        root.left = arrayToBST(arr, l, mid - 1);
        root.right = arrayToBST(arr, mid + 1, r);

        return root;
    }
    public static void main(String[] args) {

        int values[] = {8,5,3,6,10,11,14};
        Node root = new Node(values[0]);

        for(int i = 1; i < values.length; i++){
           root =  insert(root, values[i]);
        }

        // preorder(normalBSTtoBalanced(root));


        // inorder(root);

        // System.out.println();

        // delete(root, 5);

        // inorder(root);
        // System.out.println();


        // int k1 = 2;
        // int k2 = 9;

        // printInRange(root, k1, k2);


        // rootToLeaf(root);

        // if(isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)){
        //     System.out.println("VALID");
        // }else{
        //     System.out.println("NOT VALID");
        // }


    //     int[] arr = {-10,-3,0,5,9};

    //    Node root = arrayToBST(arr, 0, arr.length - 1);

    //    //    inorder(root);
    //    preorder(root);

    }
}