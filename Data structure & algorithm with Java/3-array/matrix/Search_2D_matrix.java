class Search_2D_matrix {
    static boolean searchMatrix(int[][] matrix, int key) {
        // Naive solution - O(N*M)
        // for(int i=0; i<matrix.length; i++) { // O(N)
        //     for(int j=0; j<matrix[0].length; j++) { // O(M)
        //         if(matrix[i][j] == key) {
        //             return true;
        //         }
        //         if(matrix[i][j] > key) {
        //             break;
        //         }
        //     }
        // }
        // better solution - O(N*Log(M))
        // int i=0, j=0;
        // while(i<matrix.length) { // O(N)
        //     int start = 0;
        //     int end = matrix[0].length-1;
        //     while(start<=end) { // O(log(M))
        //         int mid = (start+end)/2;
        //         if(matrix[i][mid] == key) {
        //             return true;
        //         }
        //         else if(matrix[i][mid] < key) {
        //             start = mid + 1;
        //         }
        //         else if(matrix[i][mid] > key) {
        //             end = mid - 1;
        //         }
        //     }
        //     i++;
        // } 
        // Efficient solution - O(N)
        // set indexes for top right element
        int i = 0, j = matrix[0].length - 1;
        while (i < matrix[0].length && j >= 0) { // O(N)
            if (matrix[i][j] == key) {
                return true;
            }
            if (matrix[i][j] > key)
                j--;
            else // if mat[i][j] < key
                i++;
        }
 
        return false;
    } // End searchMatrix()
    public static void main(String[] args) {
        // Problem 2: Search a 2D Matrix
        int[][] matrix = {{1,3,5,7}, 
                          {10,11,16,20}, 
                          {23,30,34,60}}; 
        int target = 3;
        System.out.print(searchMatrix(matrix, target));
    }
}