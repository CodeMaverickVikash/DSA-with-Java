import java.util.*;

class CountElement {
    static int countElement(int[] arr, int x) {
        // Linear search
        // int count = 0;
        // for(int i=0; i<arr.length; i++) { // O(N)
        //     if(arr[i] == x) {
        //         count++;
        //     }
        // }
        // return count;
        // Binary search
        int ind = Arrays.binarySearch(arr, x); // O(Log(N))
        if(ind == -1) {
            return ind;
        }
        int count = 1;
        // Count elements on left side.
        int left = ind - 1;
        while (left >= 0 && arr[left] == x) { // O(Log(N))
            count++;
            left--;
        }
        // Count elements on right side.
        int right = ind + 1;
        while (right < arr.length && arr[right] == x) { // O(Log(N))    
            count++;
            right++;
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 3,};
        int x = 2;
        System.out.print(countElement(arr, x));
    }
}