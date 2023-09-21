import java.util.*;

public class pushElementAtBottom {
    public static void pushElement(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushElement(s, data);
        s.push(top);

    }

    public static void main(String args[]) {
        Stack<Integer> S = new Stack<>();
        S.push(1);
        S.push(2);
        S.push(3);
        S.push(4);
        pushElement(S, 5);
        while (!S.isEmpty()) {
            System.out.println(S.pop());
        }
    }

}
