// Multiple inheritance is not supported in java but we can implement it by using interface
// Extend and Implement

class Person 
{
	String name;
	int age;

	public Person(String n, int a)
	{
		name = n;
		age = a;
	}

	public void show_person_details()
	{
		System.out.println("The name of the person is: " + name);
		System.out.println("The age of the person is: " + age);
	}
}


// Interface is special type of class which has only abstract method
interface Father
{
	public void task();
}

class Man extends Person implements Father
{
	int salary;
	public Man(String n, int a, int s)
	{
		super(n, a);
		salary = s;
	}

	@Override
	public void task()
	{
		System.out.println("Earn Money");
	}
}


class Multiple_inheritance
{
	public static void main(String args[])
	{
		Man m = new Man("Vikash", 21, 20000);
		m.show_person_details();
		m.task();
	}
}