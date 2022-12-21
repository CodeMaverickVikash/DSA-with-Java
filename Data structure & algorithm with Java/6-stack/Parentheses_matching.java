import java.util.*;

class Parentheses_matching {
	static boolean isBalanced(String str) { // O(n), O(n) for stack
		// Using ArrayDeque is faster than using Stack class
		Deque<Character> stack = new ArrayDeque<Character>();
        for (char it : str.toCharArray()) {
            if (it == '(' || it == '[' || it == '{') {
                stack.push(it);
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }
                char ch = stack.pop(); 
                if((ch == '(' && it == ')') ||  (ch == '[' && it == ']') || (ch == '{') && it == '}') {
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
	}

    public static void main(String[] args) {
        // Problem 1: Parentheses Matching Problem or Bracket Balancing Problem
		String str = "())({}";
		if (isBalanced(str))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
    }
}