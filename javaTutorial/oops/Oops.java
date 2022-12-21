/************************************************** Classes and Object*******************************************/

// // Custom Class
// class Employee{
//    int id;
//    int salary;
//    String name;

//    public void printDetails(){
//        System.out.println("Myself "+ name);
//        System.out.println("id of "+ name + " is " + id);
//        System.out.println();
//    }

//    public int getSalary(){
//        return salary;
//    }
// }

// // Main Class and Main Method
// public class Oops {
//    public static void main(String[] args) {
       
//        Employee harry = new Employee(); // Instantiating a new Employee Object
//        Employee john = new Employee(); // Instantiating a new Employee Object

//        // Setting Attributes for Harry
//        harry.id = 12;
//        harry.salary = 34;
//        harry.name = "Vikash";

//        // Setting Attributes for John
//        john.id = 17;
//        john.salary = 12;
//        john.name = "John Khandelwal";

//        // Printing the Attributes
//        harry.printDetails();
//        john.printDetails();

//        System.out.println(john.getSalary());
//    }
// }

/********************************************** Access modifiers in Java *****************************************/

/*
    There is 4 types AM:
    1. Default - No keyword required
    2. public
    3. private
    4. protected
*/

// class MyEmployee{
//    private int id;
//    private String name;
//    public String j = "Johan";

//    public void setAttribute(String n, int id){
//        this.name = n;
//        this.id = id;
//    }
//    public String getAttribute(){
//        return name + " " + id;
//    }
// }

// public class Oops {
//    public static void main(String[] args) {
//        MyEmployee vikash = new MyEmployee();

//        // vikash.id = 45;
//        // vikash.name = "Vikash"; --> Throws an error due to private access modifier

//        System.out.println(vikash.j);

//        vikash.setAttribute("vikash", 234);

//        System.out.println(vikash.getAttribute());
//    }
// }


/************************************* Constructors in Java*******************************************************/

// class MyMainEmployee{
//    private int id;
//    private String name;

//     // For set Attributes we should use constructor
//    public MyMainEmployee(String myName, int myId){
//        id = myId;
//        name = myName;
//    }

//    public String getName(){
//        return name;
//    }

//    public int getId(){
//        return id;
//    }
// }

// public class Oops {
//    public static void main(String[] args) {
//        MyMainEmployee harry = new MyMainEmployee("ProgrammingWithVikash", 12);

//        System.out.println(harry.getId());
//        System.out.println(harry.getName());
//    }
// }

/******************************************** this and super keyword in Java **************************************/

/* The this keyword refers to the current object/class in a method or constructor.
The super keyword refers to superclass (parent) objects. */

// class EkClass{
//     int a;

//     // Constructor
//     EkClass(int a){
//         this.a = a; // This is a way for us to reference on object of the class which is being created: passing to obj
//     }

//     public int getA() {
//         return a;
//     }
    
// }

/* A reference variable used to refer immediate parent class object
1) can be used to refer immediate parent class instance variable
2) can be used to invoke parent class method
2) can be used to invoke parent class constructor */

// class DoClass extends EkClass{
//     DoClass(int c){
//         super(c); // sending args to parent class constructor
//         System.out.println("I am a constructor");
//     }
// }
// public class Oops {
//     public static void main(String[] args) {
//         EkClass e = new EkClass(65);
//         DoClass d = new DoClass(5);

//         System.out.println(e.getA());
//     }
// }


// Best program =
// class Oops
// {
//     public static void main(String[] args)
//     {
//         char symbol = '+';
//         switch(symbol)
//         {
//             case '*':
//                 System.out.println("Asterisk symbol found");
//                 break;
//             case '%':
//                 System.out.println("Percentage symbol found");
//                 break;
//             default:
//                 System.out.println("No match found");
//             case '-':
//                 System.out.println("Minus symbl found");
//                 break;
//             case '=':
//                 System.out.println("Equal symbol found");
//                 break;
//         }
//     }
// }