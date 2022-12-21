// In multi-level inheritance we have parent, child and grand-child relationship
class Parent
{
	String name = "";

	public Parent(String n)
	{
		name = n;
	}

	public void show_parent()
	{
		System.out.println("Name is: " + name);
	}
}


class Child extends Parent
{
	int age = 0;

	public Child(String n, int a)
	{
		super(n);
		age = a;
	}

	public void show_age()
	{
		System.out.println("Age is: " + age);
	}
}


class GrandChild extends Child
{
	String gender = "";

	public GrandChild(String n, int a, String g)
	{
		super(n, a);
		gender = g;
	}

	public void show_gender()
	{
		System.out.println("Gender is: " + gender);
	}
}


class Multilevel_inheri
{
	public static void main(String args[])
	{
		GrandChild gc = new GrandChild("Vikash", 21, "Male");
		gc.show_parent();
		gc.show_age();
		gc.show_gender();
	}
}