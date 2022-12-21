// abstract class is restricted class that cann't be used to create objects
// In abstract class may be abstract method or normal method
// We can't create object of abstract class

abstract class Animal
{
	public abstract void animal_sound(); // i can't give body directly here

	public void Hello()
	{
		System.out.println("Hello animal lover");
	}
}


class Cat extends Animal
{
	// We are changing parent method in chind class that is called method overrideing
	@Override
	public void animal_sound()
	{
		System.out.println("Meow");
	}
}


class Dog extends Animal
{
	@Override
	public void animal_sound()
	{
		System.out.println("Bow Bow");
	}
}



public class Abstract
{
	public static void main(String[] args)
	{
		Cat c = new Cat();
		Dog d = new Dog();
		c.Hello();
		// c.animal_sound();
		// d.Hello();
		// d.animal_sound();
	}
}