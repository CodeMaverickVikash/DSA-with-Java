/* Bubble sort
* Repeatedly swap two adjacent element if they are in wrong order
* Time Complexity - O(n^2)
*/
import java.util.*;

class A_BubbleSort
{
	static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String args[])
	{
		// int arr[] = {1, 3, 8, 4, 9};
		int arr[] = {5, 4, 3, 2, 1};

		for(int i=0; i<arr.length; i++) // (0 -> n) -----------> O(n)
		{
			boolean swapped = false;
			for(int j=0; j<arr.length-i-1; j++) // (0 -> n-i-1) ------------> O(n)
			{
				if(arr[j] > arr[j+1])
				{
					// swapped = true;
					swap(arr, j, j+1);
				}
			}

			if(!swapped) // it means array is sorted so no need to repeat i
				break;
		}
		
		
		for(int x: arr)
			System.out.print(x+" ");
	}
}