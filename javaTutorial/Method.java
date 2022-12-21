// Methods in Java
public class Method {
    /* The static keyword is used to associate a method of a given class with the class bazay(rather than) the object.
   The static method in a class is shared by all the objects
    A static method can be accessed without creating an object of the class */

    // Custom Method
   static int logic(int x, int y){
       int z;
       if(x>y){
           z = x+y;
       }
       else {
           z = (x +y) * 5;
       }
       x = 566;
       return z;
   }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Driven Method
   public static void main(String[] args) {
       int a = 5;
       int b = 7;
       int c;

        // Static method invocation using without Object creation
    //    c = logic(a, b);
    //    System.out.println("without object "+c);

       // we can also accessed static method using Object creation
    //    Method obj = new Method();
    //    c = obj.logic(a, b);
    //    System.out.println("with object "+c);     

    //    Method obj = new Method();
    //    obj.myPublicMethod();
       // myPublicMethod(); // This will throw error because Public methods must be called by creating objects
   }
}

// Method Overloading in Java

// public class Method {
//     static void foo(){
//         System.out.println("Good Morning bro!");
//     }

//     static void foo(int a){
//         System.out.println("Good morning " + a + " bro!");
//     }

//     static void foo(int a, int b){
//         System.out.println("Good morning " + a + " bro!");
//         System.out.println("Good morning " + b + " bro!");
//     }

// //    static void foo(int a, int b, int c){
// //        System.out.println("Good morning " + a + " bro!");
// //        System.out.println("Good morning " + b + " bro!");
// //    }

//     static void change(int a){
//         a = 98;
//     }

//     static void change2(int [] arr){
//         arr[0] = 98;
//     }
//     static void tellJoke(){
//         System.out.println("I invented a new word!\n" +
//                 "Plagiarism!");
//     }

//     public static void main(String[] args) {
//          tellJoke();

// //         Case 1: Changing the Integer
//         int x = 45;
//         change(x);
//         System.out.println("The value of x after running change is: " + x);

// //         Case 1: Changing the Array
//          int [] marks = {52, 73, 77, 89, 98, 94};
//          change2(marks);
//          System.out.println("The value of x after running change is: " + marks[0]);


//         // Method Overloading
// //        foo();
// //        foo(3000);
// //        foo(3000, 4000);
//         // Arguments are actual!


//     }
// }
