public class Datatype
{
	public static void main(String[] args)
	{
		char c = 'a';	// 2 bytes - char
		boolean bl = true;	// 1 byte - boolean

		// Integer type - int, short, long, byte
		byte b = 4;	// 1 byte - byte
		short s = 6;	// 2 nytes - short
		int i = 5;	// 4 bytes - int
		long l = 8;	// 8 bytes - long

		// Floating point type - float, double
		float f = 6.45f;	// 4 bytes - float
		double d = 9.23;	// 8 bytes - double

		System.out.println(c + " "+ bl +" " + b + " " + s + " " + i + " " + l + " " + f + " " + d+"\n");

		System.out.println("S.No\t" + "Data type\t" + "Size\t" + "Min. value\t\t" + "Max. value");
		System.out.println("1\t\t byte\t\t" + Byte.SIZE/8 +"\t\t" + Byte.MIN_VALUE +"\t\t\t" + Byte.MAX_VALUE);
		System.out.println("2\t\t short\t\t" + Short.SIZE/8 +"\t\t" + Short.MIN_VALUE +"\t\t\t" + Short.MAX_VALUE);
		System.out.println("3\t\t int\t\t" + Integer.SIZE/8 +"\t\t" + Integer.MIN_VALUE +"\t\t" + Integer.MAX_VALUE);
		System.out.println("4\t\t long\t\t" + Long.SIZE/8 +"\t\t" + Long.MIN_VALUE +"\t\t" + Long.MAX_VALUE + "\n");

		System.out.println("5\t\t float\t\t" + Float.SIZE/8 + "\t\t" + Float.MIN_VALUE + "\t\t\t" + Float.MAX_VALUE);
		System.out.println("6\t\t double\t\t" + Double.SIZE/8 + "\t\t" + Double.MIN_VALUE + "\t\t" + Double.MAX_VALUE + "\n");

		System.out.println("7\t\t char\t\t" + Character.SIZE/8 + "\t\t" + Character.MIN_VALUE + "\t\t\t" + Character.MAX_VALUE);
	}
}