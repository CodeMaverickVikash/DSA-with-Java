/* Majority element problem --------> Moore’s Voting Algorithm */
/* Anyone has said to you that use space that's mean you have to use memoization(DP) or hashmap */

import java.util.*;

class Majority_element {
    static int majorityElement(int arr[]) {
        // Brute force solution - O(N*M), O(1)
        // int maxCount = 0, index = -1;
        // for(int i=0; i<arr.length; i++) {
        //     int count = 0;
        //     for(int j=0; j<arr.length; j++) {
        //         if(arr[i] == arr[j]) {
        //             count++;
        //         }
        //     }

        //     if(count>maxCount) {
        //         maxCount = count;
        //         index = i;
        //     }
        // }
        // if(maxCount>(arr.length/2))
        //     return arr[index];
        // return -1;
        // Better solution - O(N), O(N) for hashmap
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<arr.length; i++) {
        //     if(map.containsKey(arr[i])) {
        //         int count = map.get(arr[i]) + 1;
        //         if(count>(arr.length/2))
        //             return arr[i];
        //         else
        //             map.put(arr[i], count);
        //     }
        //     else {
        //         map.put(arr[i], 1);
        //     }
        // }
        // return -1;
        // Optimal solution - O(N), O(1) ----> Moore’s Voting Algorithm
        int ansIndex = 0, count = 1;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] == arr[ansIndex])
                count++;
            else
                count--;
            
            if(count == 0) {
                ansIndex = i;
                count = 1;
            }

        }
        // Check ansIndex is actual answer
        int freq = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[ansIndex] == arr[i])
                freq++;
            if(freq>(arr.length/2))
                return arr[ansIndex];
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 1, 1};
        System.out.print(majorityElement(arr));
    }
}