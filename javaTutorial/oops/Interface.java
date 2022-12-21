// Interface helps in abstraction
// An iterface is completely "abstract class" that is used to group related method with empty body
// But in iterface all method will be abstract
// We can't create object of interface


interface Phone
{
	public void cost();
	public void color();
	public void bateryLife();
}


class Iphone implements Phone
{
	public void cost()
	{
		System.out.println("Cost of Iphone is 30$");
	}

	public void color()
	{
		System.out.println("Color of Iphone is Gold");
	}

	public void bateryLife()
	{
		System.out.println("Batter life of Iphone is 22haours");
	}
}


public class Interface
{
	public static void main(String[] args)
	{
		Iphone ip = new Iphone();
		ip.cost();
		ip.color();
		ip.bateryLife();
	}
}