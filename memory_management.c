#include <stdio.h>
#include <stdlib.h> // it is used for dynamic memory allocation

int main()
{
    /* to store natural numbers */
    int *ptr, n;

    puts("Enter n: ");
    scanf("%d", &n);

    /* Dynamic memory allocation using malloc(). */
    // ptr = (int*) malloc(n * sizeof(int));
    /* Dynamic memory allocation using calloc(). */
    ptr = (int*) calloc(n, sizeof(int));

    if(ptr == NULL)
    {
        puts("Memory allocation failed. ");
        exit(0);
    }
    else
    {
        /* Store n natural numbers in the allocated memory block */
        for(int i=0; i<n; i++)
        {
            ptr[i] = i+1;
        }

        /* Print all natural numbers stored in the momory block */
        printf("The values present in the allocated memory block: ");
        for(int i=0; i<n; i++)
        {
            printf("%d ", ptr[i]);
        }
    }

    free(ptr);

    return 0;
}