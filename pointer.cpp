#include <iostream>

int findLarg(int *ptr)
{
    int large = 0;
    for(int i=0; i<5; i++)
    {
        if(*ptr > large )
        {
            large = *ptr;
            ptr++;
        }
        else
            ptr++;
    }

    return large;
}

int main()
{
    int arr[] = {12, 32, 2, 54, 6};

    // int *ptr = arr; // OR ptr = &arr[0]

    // for(int i=0; i<5; i++)
    // {
    //     std::cout<<*ptr<<"\n";
    //     ptr++;
    // }

    // int *ptr = &arr[4];

    // for(int i=4; i>=0; i--)
    // {
    //     std::cout<<*ptr<<" ";
    //     ptr--;
    // }

    // Finding largest element in element
    int *p = arr;
    int result = findLarg(p);
    std::cout<<result;

    return 0;
}