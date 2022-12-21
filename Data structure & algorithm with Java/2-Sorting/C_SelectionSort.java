/* Selection sort
* Find the minimum element in unsorted array and swap it with element at begining
* Time Complexity - O(n^2)

sorted (0 element) + unsorted
*/

class C_SelectionSort
{
	static void swap(int arr[], int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	static void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[min_idx] > arr[j])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            if(min_idx != i)
				swap(arr, i, min_idx);
        }
    }

	public static void main(String args[])
	{
		int[] arr = {4, 1, 9, 2, 3, 6};

		sort(arr);

		System.out.print("Sorted array: ");
		for(int x:arr)
			System.out.print(x+" ");
	}
}