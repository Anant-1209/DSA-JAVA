import java.util.*;

public class reverseString {
    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char letter = s.pop();
            result.append(letter);
        }
        return result.toString();
    }

    public static void main(String args[]) {
        String str = "madam";
        String res = reverse(str);
        System.out.println(res);
    }

}
