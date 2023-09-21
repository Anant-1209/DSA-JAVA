import java.util.*;

public class nextGreater {
    public static int[] nextGreaterElements(int arr[], int greater[])

    {
        // int top = 0;
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                greater[i] = -1;
                // top++;
            } else {
                greater[i] = arr[s.peek()];
            }
            s.push(i);
        }
        return greater;
    }

    public static void main(String args[]) {
        int[] arr = { 6, 8, 0, 1, 3 };
        int[] nextGreater = new int[arr.length];
        nextGreaterElements(arr, nextGreater);
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.println(nextGreater[i]);
        }

    }

}
