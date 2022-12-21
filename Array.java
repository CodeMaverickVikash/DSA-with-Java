/****************** Reverse an array ***************/
// import java.util.Scanner;


// public class Array
// {
//     public static void main(String[] args)
//     {
//         Scanner scan = new Scanner(System.in);

//         System.out.print("Enter the size of Array: ");
//         int size = scan.nextInt();

//         int arr[] = new int[size];

//         System.out.print("Enter element into Array: ");
//         for(int i=0; i<size; i++)
//         {
//             int n = scan.nextInt();
//             arr[i] = n;
//         }

//         for(int i=arr.length-1; i>=0; i--)
//             System.out.print(arr[i] + " ");

//     }
// }

/************* Find the minimum and maximum element in an array ************/

// class Array
// {
//     public static void main(String[] args)
//     {
//         int arr[] = {1, 3, 9, 4, 6};

//         int res;

//         // Getting minimum value
//         res = arr[0];
//         for(int i=1; i<arr.length; i++)
//             res = Math.min(res, arr[i]);
//         System.out.println(res);

//         // Getting maximum value
//         res = arr[0];
//         for(int i=1; i<arr.length; i++)
//             res = Math.max(res, arr[i]);
//         System.out.println(res);
//     }
// }

/**************** Write a program to sort the given array ***************/

// import java.util.Arrays;
// import java.util.Collections;

// class Array
// {
//     public static void main(String[] args) 
//     {
//         Integer arr[] = {2, 1, 8, 4, 3};

//         Arrays.sort(arr); // By default ascending order
//         // Arrays.sort(arr, Collections.reverseOrder());

//         for(Integer x:arr)
//             System.out.print(x+" ");
//     }
// }


// 2D array
// arr[row_index][column_index]
/* 1 2 3
   4 5 6
   7 8 9
*/
import java.util.*;

class Array 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner scan = new Scanner(System.in);

        int row_size = scan.nextInt();
        int column_size = scan.nextInt();

        int[][] arr = new int[row_size][column_size];

        // Insert element into 2-d array
        for(int i=0; i<row_size; i++)
        {
            for(int j=0; j<column_size; j++)
            {
                int element = scan.nextInt();
                arr[i][j] = element;
            }
        }

        // Display element of array
        for(int i=0; i<row_size; i++)
        {
            for(int j=0; j<column_size; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }

    }
}