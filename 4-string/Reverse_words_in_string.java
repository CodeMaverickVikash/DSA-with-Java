import java.util.*;

class Reverse_words_in_string {
    static String reverseeWords(String s) {
        // Brute force solution - O(N), O(N)
        // Deque<String> stack = new ArrayDeque<>();
        // String str = "";
        // for(int i=0; i<s.length(); i++) {
        //     if(s.charAt(i) == ' ') {
        //         stack.push(str);
        //         str = "";
        //     } else {
        //         str += s.charAt(i);
        //     }
        // }
        // stack.push(str);

        // String ans = "";
        // while(stack.size() != 1) {
        //     ans += stack.peek() + " ";
        //     stack.pop();
        // }
        // ans += stack.peek();// The last word should'nt have a space after it
        // return ans;
        // Optimized Solution - O(N), O(1)
        int left = 0;
        int right = s.length() - 1;

        String temp = "";
        String ans = "";

        while (left <= right) {
            char ch = s.charAt(left);
            if (ch != ' ') {
                temp += ch;
            }
            else if (ch == ' ') {
                if (!ans.equals("")) {
                    ans = temp + " " + ans;
                }
                else {
                    ans = temp;
                }
                temp = "";
            }
            left++;
        }
        ans = temp + " " + ans;
        return ans;
    }

    public static void main(String[] args) {
        String str = "this is an amazing program";
        System.out.print(reverseeWords(str));
    }
}