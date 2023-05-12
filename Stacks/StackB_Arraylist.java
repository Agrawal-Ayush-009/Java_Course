import java.util.ArrayList;

public class StackB_Arraylist {
    static class Stacks {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }
        
        //Push
        public static void push(int data) {
            list.add(data);
        } 

        //Pop
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        //peek
        public static int peek() {
            if(isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
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