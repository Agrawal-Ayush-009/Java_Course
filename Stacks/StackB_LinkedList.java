public class StackB_LinkedList {
    static class Node {
        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Stacks {
        static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        //push
        public static void push(int data) {
            Node newNode = new Node(data);
            
            if(head == null) {
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        //pop
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }

            return head.data;
        }
    }
    public static void main (String args[]) {
        Stacks s = new Stacks();
        
        s.push(1);
        s.push(2);
        s.push(3);

        while(s.isEmpty() != true) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}