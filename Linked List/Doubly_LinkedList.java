public class Doubly_LinkedList {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
        public static Node tail;
        public static int size;

    //add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;

        head = newNode;
    }

    // add Last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;

        tail = newNode;
    }

    //print
    public void printDll() {
        Node temp = head;

        System.out.print("null<-");
        while(temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //remove First
    public int removeFirst() {
        if(size == 0) {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        }

        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;     
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //remove Last
    public int removeLast() {
        if(size == 0) {
            System.out.println("Linked List is Empty");
            return Integer.MAX_VALUE;
        }

        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = tail.data;
        
        tail = tail.prev;
        tail.next = null;
        size--; 
        return val;
    }

    // reverse Doubly Linked List
    public void reverseDll() {
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String args[]) {
        Doubly_LinkedList dll = new Doubly_LinkedList();

        dll.addFirst(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        dll.addLast(5);

        // dll.printDll();

        // System.out.println(dll.size);

        // dll.removeFirst();

        // dll.printDll();

        // System.out.println(dll.size);

        // dll.removeLast();

        // dll.printDll();

        // System.out.println(dll.size);

        dll.reverseDll();

        dll.printDll();

    }
}