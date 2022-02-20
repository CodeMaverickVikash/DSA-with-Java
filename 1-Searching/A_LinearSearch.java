/*
* Linear Search is a sequential search algorithm. In Linear Search we’ll have to traverse the array comparing the elements consecutively one after the other until the target value is found. hence, it is suitable to search for elements in small and unsorted list of elements.
* Time Complexity - O(n)
* Space Complexity - O(1)

work on brute force approach -- no logic
*/


import java.util.Scanner;

class A_LinearSearch
{
	static int search(int arr[], int n)
	{
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] == n)
				return i;
		}

		return -1;
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number to be search in array: ");
		int n = scan.nextInt();

		int arr[] = { 2, 3, 4, 10, 40 };

		int index = search(arr, n);
		if(index == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at " + index);
	}
}