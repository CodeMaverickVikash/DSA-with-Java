import java.util.*;

class Set_matrix_zero {
    static void setZeroes(int[][] matrix) {
        // Naive solution - O((N*M)*(N + M)), O(1)
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {
        //         if(matrix[i][j] == 0) {
        //             for(int k = 0; k<matrix[0].length; k++) {
        //                 if(matrix[i][k] != 0) {
        //                     matrix[i][k] = -1;
        //                 }
        //             }
        //             for(int k = 0; k<matrix.length; k++) {
        //                 if(matrix[k][j] != 0) {
        //                     matrix[k][j] = -1;
        //                 }
        //             }
        //         }
        //     }
        // }
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {
        //         if(matrix[i][j] == -1) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }
        // Better solution - O(N*M + N*M), O(n)
        int rows = matrix.length, cols = matrix[0].length;
        int dummy1[] = new int[rows];
        int dummy2[] = new int[cols];

        Arrays.fill(dummy1,-1); // [-1, -1, -1]
        Arrays.fill(dummy2,-1); // [-1, -1, -1, -1]

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    dummy1[i] = 0; // [0, -1, -1]
                    dummy2[j] = 0; // [0, -1, -1, 0]
                }
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dummy1[i] == 0 || dummy2[j]==0) {
                    matrix[i][j] = 0;
                }
            }
        }
    } // End setZeroes()

    static void printM(int[][] matrix) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        // Problem 1: Set Matrix Zeroes
        int[][] matrix = {{0, 1, 2, 0}, 
                          {3, 4, 5, 2}, 
                          {1, 3, 1, 5}};
        setZeroes(matrix);
        printM(matrix);
    }
}