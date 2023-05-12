import java.util.*;

import javax.swing.plaf.metal.MetalComboBoxUI.MetalPropertyChangeListener;

public class Stack_pushAtBottom {
    public static void pushBottom(Stack<Integer> s, int data) {
        if(s.isEmpty() == true) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }
    public static void main (String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushBottom(s, 4);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}