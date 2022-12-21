/*
* Binary search is a searching technique that is based upon the Divide-and-Conquer Rule. In this searching technique, a sorted array is divided into two equal halves and then the same technique is applied onto the two halves searching for the element by comparing the high and the low.
* For Binary Search to be performed on any array, the array must be already sorted in any format, that is, either ascending or descending.
* Time Complexity - O(log n)
* Space Complexity - O(1)
*/


import java.util.*;

class B_BinarySearch
{
	static int search(int[] arr, int n)
	{
		int beg = 0, end = arr.length - 1;

		while(beg <= end)
		{
			int mid = (beg+end)/2;
			if(arr[mid] == n)
				return mid;
			else if(arr[mid] < n)
				beg = mid + 1;
			else
				end = mid - 1;
		}

		return -1;
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int arr[] = { 2, 3, 4, 10, 40 };

		int index = search(arr, n);
		if(index == -1)
			System.out.println("Element not found"); 	
		else
			System.out.println("Element found at " + index);
	}
}