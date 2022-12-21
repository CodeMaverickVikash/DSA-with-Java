// class Parent
// {
// 	String Pname = "Mumtaj";
// 	int Pmoney = 2000;
// 	String Pvehicle = "Bike";

// 	public void Pwork()
// 	{
// 		System.out.println("Bank manger");
// 	}
// }

// class Child extends Parent
// {
// 	String nameC = "Raja";
// 	int moneyC = 3000;
// 	String vehicleC = "Car";

// 	public void workC()
// 	{
// 		System.out.println("IT professional");
// 	}

// 	public void whoChild()
// 	{
// 		System.out.println(Pname + " child");
// 	}
// }


// public class Inheritance
// {
// 	public static void main(String[] args)
// 	{
// 		Child child = new Child();

// 		child.whoChild();
// 		child.Pwork();
// 		System.out.println(child.Pname);
// 	}
// }


// class Vehicle
// {
// 	int cost = 550;
// 	int milege = 50;

// 	public void show_vehicle_details()
// 	{
// 		System.out.println("I am vehicle");
// 		System.out.println("Cost of vehicle is: " + cost);
// 		System.out.println("Milege of vehicle is: " + milege);
// 	}
// }


// class Car extends Vehicle
// {
// 	String color = "blue";
// 	int tyres = 4;

// 	public void show_car_details()
// 	{
// 		System.out.println("I am car");
// 		System.out.println("Color of car is: " + color);
// 		System.out.println("Number of tyres in a car is: " + tyres);
// 	}
// }


// public class Inheritance
// {
// 	public static void main(String[] args)
// 	{
// 		Car c = new Car();

// 		// c.show_car_details();
// 		c.show_vehicle_details();
// 	}
// }


// Inheritance with constructor
class Vehicle
{
	int cost = 0;
	int milege = 0;

	public Vehicle(int c, int m)
	{
		cost = c;
		milege = m;
	}

	public void show_vehicle_details()
	{
		System.out.println("I am vehicle");
		System.out.println("Cost of vehicle is: " + cost);
		System.out.println("Milege of vehicle is: " + milege);
	}
}


class Car extends Vehicle
{
	String color = "";
	int tyres = 0;

	public Car(int c, int m, String col, int ty)
	{
		// If you want to send something from child to parent class then use super()
		super(c, m); // Passing arg to Vehicle class by using super() method
		color = col;
		tyres = ty;
	}

	public void show_car_details()
	{
		System.out.println("I am car");
		System.out.println("Color of car is: " + color);
		System.out.println("Number of tyres in a car is: " + tyres);
	}
}


public class Inheritance
{
	public static void main(String[] args)
	{
		Car c = new Car(550, 50, "blue", 4);

		// c.show_car_details();
		c.show_vehicle_details();
	}
}