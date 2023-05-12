import java.util.Stack;

public class MaxArea_Histogram { // O(n)
    public static void findMaxArea(int[] hieght, int[] nextSmaller_Left, int[] nextSmaller_right) {
        int MaxArea = Integer.MIN_VALUE;

        for(int i = 0; i < hieght.length; i++) {
            int area = hieght[i] * (nextSmaller_right[i] - nextSmaller_Left[i] - 1);
            if(area > MaxArea) {
                MaxArea = area;
            }
        }

        System.out.println("Maximum Area in Histogram :" +  MaxArea);
    }

    public static void findRightSmaller(int[] hieght, int[] nextSmaller_right) {
        Stack<Integer> s = new Stack<>();

        for(int i = hieght.length - 1; i >= 0; i--) {
            int currHieght = hieght[i];
            while(!s.isEmpty() && currHieght <= hieght[s.peek()]) {
                s.pop();
            }

            if(s.isEmpty()) {
                nextSmaller_right[i] = hieght.length;
            } else {
                nextSmaller_right[i] = s.peek();
            }

            s.push(i);
        }
    }

    public static void findLeftSmaller(int[] hieght, int[] nextSmaller_Left) {
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < hieght.length; i++) {
            int currHieght = hieght[i];
            while(!s.isEmpty() && currHieght <= hieght[s.peek()]) {
                s.pop();
            }

            if(s.isEmpty()) {
                nextSmaller_Left[i] = -1;
            } else {
                nextSmaller_Left[i] = s.peek();
            }

            s.push(i);
        }
    }
    public static void main(String[] args) {
        int[] hieght = {2,1,5,6,2,3};
        int[] nextSmaller_Left = new int[hieght.length];
        int[] nextSmaller_right = new int[hieght.length];

        findLeftSmaller(hieght, nextSmaller_Left);
        findRightSmaller(hieght, nextSmaller_right);

        findMaxArea(hieght, nextSmaller_Left, nextSmaller_right);

    }
}