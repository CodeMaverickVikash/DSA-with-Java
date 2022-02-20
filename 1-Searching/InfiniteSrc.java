/* Search element in infinite sorted array */
/* Time complexity: O(log n) */
class InfiniteSrc
{
    static int searchInfinite(int arr[], int key)
    {
        int low = 0;
        int high = 1;

        while(arr[high] < key)
        {
            low = high;
            high = high*2;
        }

        return binarySearch(arr, key, low, high);
    }
    public static void main(String[] args)
    {
        // Infinite sorted array
        int[] arr = {1, 3, 4, 5, 7, 9, 12, 32, 45, 65, 67, 89};
        int key = 32;

        int ans = searchInfinite(arr, key);
    }
}