// Subarray vs Subsequence
import java.util.*;

class Practice {
    static void printAllSubarr(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                for(int k=i; k<=j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.print("\n");
            }
        }
    }

    // brute force
    // static int maxSumSubarray(int[] arr) { // O(n^3)
    //     int maxSum = 0, currSum = 0;
    //     for(int i=0; i<arr.length; i++) {
    //         for(int j=i; j<arr.length; j++) {
    //             currSum = 0;
    //             for(int k=i; k<=j; k++) {
    //                 currSum += arr[k]; 
    //             }
    //             if(maxSum < currSum) {
    //                 maxSum = currSum;
    //             }
    //         }
    //     }
    //     return maxSum;
    // }

    // static void pairSum(int[] arr, int k) {
    //     int currSum = 0;
    //     for(int i=0; i<arr.length; i++) {
    //         for(int j=i+1; j<arr.length; j++) {
    //             currSum = arr[i] + arr[j];
    //             if(currSum == k) {
    //                 System.out.print(arr[i] + " " + arr[j]);
    //             }
    //         }
    //     }
    // }

    static void pairSum(int[] arr, int k) {
        Arrays.sort(arr);
        int si = 0;
        int ei = arr.length-1; int currSum = 0;
        for(int i=0; i<arr.length; i++) {
            currSum = arr[si] + arr[ei];
            if(currSum < k) {
                si++;
            }
            if(currSum > k) {
                ei--;
            }
            if(currSum == k) {
                System.out.print(arr[si] + " " + arr[ei]);
                break;
            }
        }
    }

    // static int countDistinct(int[] arr) { // O(n*n)
    //     int res = 1;
    //     for(int i=1; i<arr.length; i++) {
    //         int j = 0;
    //         for(j=0; j<i; j++) {
    //             if(arr[i] == arr[j]) {
    //                 break;
    //             }
    //         }
    //         if(i==j) {
    //             res++;
    //         }
    //     }
    //     return res;
    // }

    // hashing techniques: 
    static int countDistinct(int[] arr) { // O(n), O(n)
        Set<Integer> s = new HashSet<>();
        for(int element : arr) {
            s.add(element);
        }
        return s.size();
    }

    static int printUnion(int[] a, int[] b) {
        HashSet<Integer> s = new HashSet<>();
        for(int element : a) {
            s.add(element);
        }
        for(int element : b) {
            s.add(element);
        }
        return s.size();
    }

    static int printInterSection(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : a) {
            set.add(x);
        }
        int count = 0;
        for(int x : b) {
            if(set.contains(x)) {
                count++;
                set.remove(x);
            }
        }
        return count;
    }

    static void subArraySum(int[] arr, int sum) { // O(n), O(n)
        //cur_sum to keep track of cumulative sum till that point
        int cur_sum = 0, start = 0, end = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        // Map<Integer, Integer> map = new HashMap<>();
 
        for (int i = 0; i<arr.length; i++) {
            cur_sum += + arr[i];
            //check whether cur_sum - sum = 0, if 0 it means
            //the sub array is starting from index 0- so stop
            if (cur_sum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            //if hashMap already has the value, means we already have subarray with the sum - so stop
            if (map.containsKey(cur_sum - sum)) {
                start = map.get(cur_sum - sum) + 1; // get value
                end = i;
                break;
            }
            //if value is not present then add to hashmap
            map.put(cur_sum, i);
 
        }
        // if end is -1 : means we have reached end without the sum
        if (end == -1) {
            System.out.println("No subarray with given sum exists");
        } else {
            System.out.println("Sum found between indexes "
                            + start + " to " + end);
        }
 
    }

    public static void main(String args[]) {
        // int a[] = {-1, 4, 7, 2};
        // int a[] = {0, -9, 1, 3, -4, 5};

        // printAllSubarr(a);
        // System.out.print(maxSumSubarray(a));

        // pair sum problem
        // int a[] = {0, -1, 2, -3, 1}; int k = -2;
        // pairSum(a, k);

        // Count distinct elements
        // int a[] = {10, 20, 20, 10, 30, 10};
        // int a[] = { 12, 10, 9, 45, 2, 10, 10, 45 };
        // System.out.print(countDistinct(a));

        // Find Union and Intersection of two unsorted arrays
        // Find Union and Intersection of two sorted arrays
        // int[] a = {5, 10, 15, 5};
        // int[] b = {10, 15, 4};
        // System.out.print(printUnion(a, b));
        // System.out.print(printInterSection(a, b));

        // Find subarray with given sum
        // Largest subarray with equal number of 0s and 1s
        // Find the length of largest subarray with 0 sum
        // Count distinct elements in every window of size k
        int[] a = {15, -5, 15, -10, 5}; int sum = 5;
        subArraySum(a, sum);

        // int maxElement = 0;
        // for(int i=0; i<a.length; i++)
        // {
        //     if(a[i] > maxElement)
        //         maxElement = a[i];
        // }

        // System.out.print(maxElement);

        // Subarray VS subsequence
        // int[] a = {1, 2, 3, 4};
        // int n = a.length;

        // int noOfSubArrays = n*(n+1)/2; // Number of sub-arrays in array: n*(n+1)/2
        // int noOfSubSequence = (int) Math.pow(2, n); // Number of sub-sequence in array: 2^n
        // System.out.print(noOfSubSequence);

        /* Quote: Every subarray is subsequence but every subsequence is not subarray. */

        // Sum of all subarrays
        // int[] a = {1, 2};

        // int sum = 0;
        // for(int i=0; i<a.length; i++)
        // {
        //     sum = 0;
        //     for(int j=i; j<a.length; j++)
        //     {
        //         sum += a[j];
        //         System.out.print(sum+" ");
        //     }           
        // }

        // Longest arithmatic subarray
        // int a[] = {10, 7, 4, 6, 8, 10, 11};

        // int i=0, count=1, newCount=0, newPd=0;
        // int pd = a[i+1] - a[i];

        // while(i>a.length)
        // {
        //     newPd = a[i+1] - a[i];
        //     if(pd == newPd)
        //     {
        //         pd = newPd;
        //         count++;
        //         if(newCount)
        //     }
        //     else
        //     {
        //         newCount++;
        //         pd = newPd;
        //     }
        // }
        // System.out.print(count);
        
    }
}

/* Subarray: is continuous part of the array */