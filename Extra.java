import java.util.Scanner;


/*
The difference between static and final in Java is that static is used to define the class member that can be used independently of any object of the class while final is used to declare a constant variable or a method that cannot be overridden or a class that cannot be inherited. 
*/

class Extra
{
	// static int i = 2; // global varibale
	static final int i = 2; // global + constant variable


	public static void main(String[] args) 
	{
		// int a = 4; // local variable
		// int b = 4;
		
		String a = "Hello";
		String b = "hello";

		// a == b;
		// a.equals(b);

		// final int i; // local + constant variable

		// i = 5;
		// i = 8;
		System.out.println(i);

		// System.out.printf("%f",n);
	}
}