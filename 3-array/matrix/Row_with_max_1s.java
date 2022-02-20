// There is three types of solutions: brute-better-optimal
import java.util.*;

class Row_with_max_1s {
    static int rowWithMax1s(int[][] arr) {
        // Brute force solution - O(N*M)
	    // int currCount = 0, maxCount = 0, row = -1;
	    // for(int i=0; i<arr.length; i++) { // O(N)
	    //     for(int j=0; j<arr[0].length; j++) { // O(M)
	    //         if(arr[i][j] == 1) {
	    //             currCount++;
	    //         }
	    //     }
	    //     if(currCount>maxCount) {
	    //         maxCount = currCount;
	    //         row = i;
	    //     }
	    // }
	    // return row;
        // Better solution
        // Using binarySearch technique O(N*Log(M))
        // Optimal solution - O(N+M)
        // for(int col=0;col<arr[0].length;col++){
        //     for(int row=0;row<arr.length;row++){
        //         if(arr[row][col] == 1){
        //             return row;
        //         }
        //     }
        // }
        // return -1;
        //Approach 2
        int j = arr[0].length-1;
        while(j>=0 && arr[0][j]==1){
            j--;
        }
        int row = 0;
        for(int i=1;i<arr.length;i++){
            while(j>=0 && arr[i][j]==1){
                j--;
                row = i;
            }
        }
        return (j == arr[0].length-1) ? -1 : row;
	}

    public static void main(String args[]) {
        // Problem 3: Row with max 1s
        int[][] matrix = {{0, 1, 1, 1},
                          {0, 0, 1, 1},
                          {1, 1, 1, 1},
                          {0, 0, 0, 0}};
        System.out.print(rowWithMax1s(matrix));
    }
}