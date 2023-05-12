import java.util.Stack;

public class Que4_TrappingRainwater {
    public static int trappedRainwater (int[] hieght) {
        Stack<Integer> s = new Stack<>();
        int ans = 0;
        int n = hieght.length;
        for(int i = 0; i < n; i++) {
            while(!s.isEmpty() && hieght[s.peek()] < hieght[i]) {
                int popHieght = hieght[s.peek()];
                s.pop();
            

            if(s.isEmpty()) {
                break;
            }

            int distance = i - s.peek() - 1;
            int minHieght = Math.min(hieght[s.peek()], hieght[i]) - popHieght;

            ans += distance * minHieght;
        }

        s.push(i);
    }

    return ans;    
}
    public static void main(String[] args) {
        int[] hieght = {7,0,4,2,5,0,6,4,0,5};

        System.out.println(trappedRainwater(hieght));

    }
}
    