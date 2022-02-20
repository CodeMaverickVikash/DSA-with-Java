// Maximum sum subarray ------> Kadane's algorithm , O(n), O(1)

class Maximum_sum_subarray {
    static int maxSumSubarray(int arr[]) {
        // Brute force solution
        // int sum = 0, ansSum=0;
        // for(int i=0; i<arr.length; i++) {
        //     int currSum = 0;
        //     for(int j=0; j<arr.length; j++) {
        //         currSum += arr[j];
        //         if(currSum>sum) {
        //             sum = currSum;
        //         }
        //     }
        //     if(sum>ansSum) {
        //         ansSum = sum;
        //     }
        // }
        // return ansSum;
        // Optimal solution
        int maxSum = 0, currSum = 0;
        for(int i=0; i<arr.length; i++) {
            currSum += arr[i];
            if(currSum > maxSum)
                maxSum = currSum;
            if(currSum < 0) // is it nagative
                currSum = 0;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        // int[] arr = {-5, 4, 6, -3, 4, -1};
        // int arr[] = {5, -4, -2, 6, -1};
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.print("Maximum contiguous sum is " + maxSumSubarray(arr));
    }
}