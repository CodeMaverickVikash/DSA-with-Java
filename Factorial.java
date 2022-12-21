/*************** Factorial of a number   (5*4*3*2*1) *************/

import java.util.Scanner;


class Factorial
{
	// Iterative solution
	// static int findFactorial(int n)
	// {
	// 	int sum = 1;
	// 	while(n>=1)
	// 	{
	// 		sum *= n;
	// 		n--;
	// 	}

	// 	return sum;
	// }

	// Recursive solution
	static int findFactorial(int n)
	{
		if(n <= 1)
			return 1;
		
		return n * findFactorial(n-1);
	}

	public static void main(String[] args) 
	{
		// Scanner scan = new Scanner(System.in);

		// int n = scan.nextInt();

		int result = findFactorial(5);
		System.out.print(result);
	}
}

// findFactorial(5) -> 5 * findFactorial(4) -> 5 * 4 * findFactorial(3) -> 5 * 4 * 3 * findFactorial(2) -> 5 * 4 * 3 * 2 * findFactorial(1) 

// findFactorial(5) = 5 * findFactorial(4);
// findFactorial(4) = 4 * findFactorial(3);
// findFactorial(3) = 3 * findFactorial(2);
// findFactorial(2) = 2 * findFactorial(1);
// findFactorial(1) = 1