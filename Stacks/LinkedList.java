public class LinkedList {
    public static class Node {
        char ch;
        Node next;

        public Node(char ch) {
            this.ch = ch;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(char ch) {
        Node newNode = new Node(ch);

        if(head == null) {
            head = tail = newNode;
        }

        newNode.next = head;

        head = newNode;
    }

    public void addLast(char ch) {
        Node newNode = new Node(ch);

        if(head == null) {
            head = tail = newNode;
        }

        tail.next = newNode;

        tail = newNode;
    }

    public static void printll() {
        Node temp = head;
        
        while(temp != null) {
            System.out.print(temp.ch + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node finfMid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        } 

        return slow;
    }

    public boolean checkPalindrome() {
        Node prev = null;
        Node curr = finfMid(head);
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while(right != null) {
            if(left.ch != right.ch) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static void main (String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst('A');
        ll.addLast('B');
        ll.addLast('C');
        ll.addLast('B');
        ll.addLast('A');

        System.out.println(ll.checkPalindrome());
    }
}