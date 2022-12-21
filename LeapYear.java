import java.util.*;


class LeapYear
{
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		int year = inp.nextInt();

		if(year%4 == 0 && year%100 != 0 || year%400 == 0)
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is not leap");
	}
}