import java.util.*;

public class stackArray {
    static class stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public void push(int item) {
            list.add(item);

        }

        // pop
        public int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public int peek() {
            return list.get(list.size() - 1);
        }

    }

    public static void main(String args[]) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // System.out.println(s.peek());
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}