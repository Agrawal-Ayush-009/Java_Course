import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Q4_reverse_K_element { //O(k) O(n);

    public static void reverseK (int k, Deque<Integer> dq) {
        Queue<Integer> q1 = new LinkedList<>();

        for(int i = 1; i <= k; i++) {
            q1.add(dq.remove());
        }

        while(!q1.isEmpty()) {
            dq.addFirst(q1.remove());
        }
    }
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();

        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);
        dq.add(50);
        dq.add(60);
        dq.add(70);
        dq.add(80);
        dq.add(90);
        dq.add(100);

        System.out.println(dq);

        reverseK(5, dq);

        System.out.println(dq);

    }
}