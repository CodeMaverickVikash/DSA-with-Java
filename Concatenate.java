class Concatenate
{
	public static void main(String[] args) 
	{
		String s1 = "Vikash";
		String s2 = "Maskhare";

		System.out.println(s1+" "+s2);	

		int n1 = 12;
		int n2 = 34;

		System.out.println(n1+" "+n2);

		// Convert int to string
		String s = String.valueOf(n1);
		System.out.println(s.getClass().getSimpleName());

		// Convert string to int
		String s3 = "5";
		Integer n = Integer.valueOf(s3);
		System.out.println(n.getClass().getSimpleName());

	}
}