class Swaping
{
    static void printA(int arr[])
    {
        for(int x:arr)
            System.out.print(x + " ");
    }

    static void printB(int arr[])
    {
        for(int x:arr)
            System.out.print(x + " ");
    }
    public static void main(String[] args)
    {
        int a[] = {1, 2, 3, 4};
        int b[] = {5, 6, 7, 8};

        int[] temp = new int[a.length];
        for(int i=0; i<a.length; i++)
        {
            temp[i] = a[i];
            a[i] = b[i];
            b[i] = temp[i];
        }

        System.out.print("First array: ");
        printA(a);
        System.out.print("\n");
        System.out.print("Second array: ");
        printB(b);
    }
}