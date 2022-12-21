/*************** to Check if a Given number is Palindrome *************/
// 12321 is palindrome, but 1451 is not palindrome

// class Palindrome
// {
// 	static boolean toCheckPalindrome(int num)
// 	{
// 		int temp = num;

// 		int len = String.valueOf(temp).length();

// 		int sum = 0;
// 		for(int i=0; i<len; i++)
// 		{
// 			int last = temp%10;
// 			sum = sum*10 + last;
// 			temp = temp/10;
// 		}

// 		if(sum == num)
// 			return true;
// 		else
// 			return false;
// 	}

// 	public static void main(String[] args) 
// 	{
// 		int n = 12321;

// 		System.out.println(toCheckPalindrome(n));
// 	}
// }



/**************** to Check if a Given String is Palindrome *************/

class Palindrome
{
	public static void main(String[] args) 
	{
		String str = "abcdcba";

		String sum = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			sum += str.charAt(i);
		}	

		System.out.println(sum);

		// int n1=1, n2=1;
		// String s1="a", s2="a";

		// if(sum == str) // return 0
		if(str.equals(sum))
			System.out.println("String is palindrome " + str);
		else
			System.out.println("String is NOT palindrome " + str);
	}
}