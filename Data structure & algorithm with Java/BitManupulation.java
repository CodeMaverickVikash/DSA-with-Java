/*
Use bit manupulation technique to perform fast operation

Binary number
addition and substraction
bitwise operator
&, |, ^, ~, >>, <<

even/odd number
swap two number

*/

class BitManupulation{
	public static void main(String[] args){

		int a=5;

		// System.out.println(a/2);
		// System.out.println(a>>1); // a>>1 same as a/2

		// System.out.println(a*2);
		// System.out.println(a<<1); // a<<1 same as a*2

		// Even or odd number using bitwise & operator
		// if((a&1) == 0){
		// 	System.out.println("Even number");
		// }
		// else{
		// 	System.out.println("Odd number");
		// }

		// swap two number using XOR ^ operator
		int x=4, y=7;

		x = x^y;
		y = x^y;
		x = x^y;

		System.out.println(x+" "+y);
	}
}