/************** Reversed number *******************/

class Number
{
	public static void main(String[] args) 
	{
		int n = 1234;

		int len = String.valueOf(n).length();

		int sum = 0;
		for(int i=0; i<len; i++)
		{
			int last = n%10;
			sum = sum*10 + last;
			n = n/10;
		}

		System.out.println(sum);	
	}
}