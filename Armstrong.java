/***************** Java Program to Check Armstrong Number *****************/
// // 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
// // 1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

import java.util.Scanner;

class Armstrong
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int temp = n;

		int len = String.valueOf(temp).length();

		int sum = 0;
		for(int i=0; i<len; i++)
		{
			int digit = temp%10;
			sum += Math.pow(digit, len);
			temp /= 10;
		}

		if(sum == n)
			System.out.println("Number is armstrong");
		else
			System.out.println("Number is NOT armstrong");
	}
}