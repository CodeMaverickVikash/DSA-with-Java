// Prime number

// import java.util.*;


// class PrimeNumber
// {
// 	static boolean isPrime(int n)
// 	{
// 		if(n<=1)
// 			return false;
// 		if(n==2)
// 			return true;

// 		for(int i=2; i<n; i++)
// 			if(n%i == 0)
// 				return false;

// 		return true;
// 	}

// 	public static void main(String[] args) 
// 	{
// 		Scanner scan = new Scanner(System.in);
// 		int n = scan.nextInt();

// 		if(isPrime(n))
// 			System.out.println("The number is Prime");
// 		else
// 			System.out.println("The number is not Prime");
// 	}
// }

// Prime numbers in a given range

import java.util.*;


class PrimeNumber
{
	static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		if(n==2)
			return true;

		for(int i=2; i<n; i++)
		{
			if(n%i == 0)
				return false;
		}

		return true;
	}
	static void printPrimeSeries(int start, int end)
	{
		System.out.print("Prime Number: ");
		for(int i=start; i<=end; i++)
		{
			if(isPrime(i))
				System.out.print(i + " ");

		}
	}

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();

		printPrimeSeries(start, end);
	}
}