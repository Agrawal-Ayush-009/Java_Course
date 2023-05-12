public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size = 0;

    //AddFirst
    public void addFirst(int data) { // We don't need to make this method static because we make calls through class in main function,not directly;
        //Step 1 = Create New Node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        // Step 2 = newNode's next is head
        newNode.next = head;//LINK

        //Step 3 = head = newNode
        head = newNode;

        //AddLast
    } 

    public void addLast(int data) {
        //Step 1 = create a new Node;
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
        }
        
        //Step2 = lastNode tail points newNode;
        tail.next = newNode;

        //Step 3 = newNode is tail;
        tail = newNode;
    }

    //PrintLL
    public void printll() {
        if(head == null) {
            System.out.println("Linked List is Empty");
        }
        Node temp = head;
        
        while(temp != null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Add in Middle 
    public void addMiddle (int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while(i < (idx - 1)) {
            temp = temp.next;
            i++;
        }

        Node newNode = new Node(data);
        size++;

        newNode.next = temp.next;

        temp.next = newNode;

    }

    public int removeFirst() {
        if(size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MAX_VALUE;
        }

        else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
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

        
        Node prev = head;
        int i = 0;
        while(i < size - 2) {
            prev = prev.next;
            i++;
        }

        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
        
    }

    // Iterative Search

    public int search_itr(int key) { //O(n)
        if(size == 0) {
            System.out.println("Linked List is Empty");
            return -1;
        }

        if(size == 1) {
            if(head.data == key) {
                return 0;
            }
        }
        Node temp = head;
        int idx = 0;
        while(temp != null) {
            if(temp.data == key) {
                return idx;
            } else {
                temp = temp.next;
                idx++;
            }
        }

        return -1;
    }

    //Recursive Search 

    public int helper(Node head, int key) { //O(n), O(n);
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }

        if(helper(head.next, key) != -1) {
            return helper(head.next, key) + 1;
        } else {
            return -1;
        }
    }

    public int search_rec (int key) {
        return helper(head, key);
    }

    // Reverse Linked List
    public void reverseLinkedList() { // O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // Remove nth from end
    public void remove_Nth_frm_End (int n) {
        // here size is already calculated as we ahave already created a parameter
        // for contest we have to calculate the the on our own
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }
        // size(sz) calculated

        if(n == sz) {
            head = head.next;
            return;
        }
        Node prev = head;
        int i = 0;
        while(i < (sz - n - 1)) {
            prev = prev.next;
            i++;
        }

        Node dlt = prev.next;
        prev.next = dlt.next;
    }

    // Palindrome

    // Slow-Fast Technique
    public Node findmid(Node head) {
        Node slow = head;
        Node fast = head;

       
            while(fast != null && fast.next != null) {
                fast = fast.next.next; // +2
                slow = slow.next; //+1
            }

        return slow;
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }
        //Find mid
        Node midNode = findmid(head);

        //Reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half ka head
        Node left = head; // left half ka head

        // check whether left half = right half

        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    public static boolean checkCycle() {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next; 
            if(slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void removeLoop() {
        Node slow = head;
        Node fast = head;

        boolean loopExist = false;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                loopExist = true;
                break;
            }
        }

        if(loopExist == true) {
            slow = head;
            Node prev = null;
            while(slow != fast) {
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }

            prev.next = null;
        }

    }

    //Merge Sort Time Complexity = O(nlogn);

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public Node mergeSort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        //Find mid
        Node mid = getMid(head);

        // Left & Right Merge Sort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    public Node merge (Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public void zigZagLL(Node head) {
        Node mid  = getMid(head);

        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node leftH = head;
        Node rightH = prev;

        Node nextL, nextR;
        while (leftH != null && rightH != null) {
            nextL = leftH.next;
            leftH.next = rightH;
            nextR = rightH.next;
            rightH.next = nextL;

            leftH = nextL;
            rightH = nextR;
        }
    }

    // Question 1 : Intersection Point
    public Node Que1(Node head1, Node head2) {
        while(head2 != null) {
            Node temp = head1;
            while(temp != null) {
                if(temp == head2) {
                    return head2;
                }

                temp = temp.next;
            }
            head2 = head2.next;
        }

        return null;
    }

    // Question 2 : Delete N After M
    public void Que2 (Node head, int m, int n) {
        Node curr = head, t;
        int i;
        while(curr != null) {
            for(i = 1; i < m && curr != null; i++) {
                curr = curr.next;
               } 

               if(curr == null) {
                return;
               }

               t = curr.next;
        
               for(i = 1; i <= n && t != null; i++) {
                t = t.next;
               }
        
               curr.next = t;
               curr = t;
        }
    }
    
    // Question 3 : Swapping Nodes.
    public void Que3 (int x, int y) {
        if(x == y) {
            return;
        }

        Node prev_x = null, curr_x = head;
        while(curr_x != null && curr_x.data != x) {
            prev_x = curr_x;
            curr_x = curr_x.next;
        }

        Node prev_y = null, curr_y = head;
        while(curr_y != null && curr_y.data != y) {
            prev_y = curr_y;
            curr_y = curr_y.next;
        }

        if(curr_x == null || curr_y == null) {
            return;
        }

        if(prev_x != null) {
            prev_x.next = curr_y;
        } else {
            head = curr_y;
        }

        if(prev_y != null) {
            prev_y.next = curr_x;
        } else {
            head = curr_x;
        }

        Node temp = curr_x.next;
        curr_x.next = curr_y.next;
        curr_y.next = temp;
        
    }

    // Question 4: Even Before the Odds
    public void Que4() {
        Node end = head;
        Node curr = head;
        Node prev = null;

        while(end.next != null) {
            end = end.next;
        }

        Node new_end = end;

        // while(curr.data % 2 != 0 && curr != end) {
        //     new_end.next = curr;
        //     curr = curr.next;
        //     new_end.next.next = null;
        //     new_end = new_end.next;            
        // }

        if(curr.data % 2 == 0) {
            head = curr;
            while(curr != end) {
                if(curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;

                    new_end = curr;
                    curr = prev.next;
                }
            }
        }
        //  else {
        //     prev = curr;
        // }

        if(new_end != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
    } 

    // Question 5 : Merge K Lists ||Important||
    public static void printlist(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node sorted_merge(Node a, Node b) {
        Node result = null;
        if(a == null) {
            return b;   
        }

        if(b == null) {
            return a;
        }

        if(a.data < b.data) {
            result = a;
            result.next = sorted_merge(a.next, b);
        } else {
            result = b;
            result.next = sorted_merge(a, b.next);
        }

        return result;
    }
    public static Node Que5 (Node arr[], int last) {

        while(last != 0) {
            int i = 0, j = last;
            while(i < j) {
                arr[i] = sorted_merge(arr[i], arr[j]);
                i++;
                j--;
            } 

            if(i >= j) { // to make last variable equal to j where j == i and j < k-1 value;
                last = j;
            }
        }
        return arr[0];
    }
    public static void main (String args[]) {
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // // 1->2->3->2
        // System.out.println(checkCycle());

        // removeLoop();

        // System.out.println(checkCycle());

        LinkedList ll = new LinkedList();

        // ll.addFirst(10);
        // ll.addFirst(9);
        // ll.addFirst(8);
        // ll.addFirst(6);
        // ll.addFirst(1);
        // ll.addFirst(4);
        // ll.addFirst(5);
        // ll.addFirst(10);
        // ll.addFirst(12);
        // ll.addFirst(8);

        // ll.head = ll.mergeSort(ll.head);

        // ll.printll();

        // ll.zigZagLL(ll.head);

        // ll.printll();

        //|| QUESTIONS ASSIGNMENT ||
        // ll.Que2(head, 3, 2);
        // ll.Que3(2, 4);
        // ll.Que4();
        // Question 1 
        // Node head1, head2;
        // head1 = new Node(4);
        // head2 = new Node(1);

        // Node newNode = new Node(2);
        // head2.next = newNode;

        // newNode = new Node(3);
        // head2.next.next = newNode;

        // newNode = new Node(5);
        // head1.next = newNode;

        // newNode = new Node(6);
        // head1.next.next = newNode;
        // head2.next.next.next = newNode;

        // newNode = new Node(7);
        // head1.next.next.next = newNode;

        // head1.next.next.next.next = null;

        // Node IntersectionNode = ll.Que1(head1, head2);

        // if(IntersectionNode == null) {
        //     System.out.println("No Intersection");
        // } else {
        //     System.out.println("Intersection Point :" + IntersectionNode.data);
        // }

        // Question 5

        int k = 3;
        int n = 4;
        Node arr[] = new Node[k];

        arr[0] = new Node(1);
        arr[0].next = new Node(3);
        arr[0].next.next = new Node(5);
        arr[0].next.next.next = new Node(7);

        arr[1] = new Node(2);
        arr[1].next = new Node(4);
        arr[1].next.next = new Node(6);
        arr[1].next.next.next = new Node(8);

        arr[2] = new Node(0);
        arr[2].next = new Node(9);
        arr[2].next.next = new Node(10);
        arr[2].next.next.next = new Node(11);

        Node head = Que5(arr, k-1);
        printlist(head);
        



    }
}