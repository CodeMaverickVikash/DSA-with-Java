/* Insertion sort
* Pick first element of unsorted array and put it on correct position of sorted array.
* Time Complexity - O(n^2)

Sorted (one element) + unsorted
*/

class B_InsertionSort
{
	public static void main(String[] args) 
	{
		int[] arr = {8, 4, 1, 5, 9, 2};

		for(int i=1; i<arr.length; i++) // (start->n) ----------> O(n)
		{
			int temp = arr[i];
			int j = i-1;

			/* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
			while(j>=0 && arr[j] > temp) // (n->start) -----------> O(n)
			{
				arr[j+1] = arr[j]; // Right shift
				j--;
			}

			arr[j+1] = temp;
		}

		for(int x:arr)
			System.out.print(x+" ");
	}
}