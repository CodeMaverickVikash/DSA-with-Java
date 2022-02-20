import java.util.*;

class Previous_smaller_element {
    static void printPrevSmaller(int arr[]) { // O(n), O(n) for stack
        Stack<Integer> S = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!S.empty() && S.peek() >= arr[i]) {
                S.pop();
            }

            if (S.empty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(S.peek() + " ");
            }

            S.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        // Problem 2: Previous smaller element =====> Previous greater element
        // Variant of Problem 2: Next smaller element =====> Next greater element
        int arr[] = {1, 3, 0, 2, 5};
        printPrevSmaller(arr);
    }
}