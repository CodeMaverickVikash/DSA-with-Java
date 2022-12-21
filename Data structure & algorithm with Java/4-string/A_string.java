// ALWAYS REMEMBER : Java Strings are Immutable. -------> cannot delete, add and modify.
// NOTE: DO NOT USE == to check for string equality, use equals() or compareTo()

// Compare 2 strings
class string {
   public static void main(String args[]) {
       String s1 = "Tony";
       String s2 = "Tony";
 
        // compareTo() Method: it will return 3 things
        /*
            s1 > s2 : +ve value
            s1 == s2 : 0
            s1 < s2 : -ve value
         */
        if(s1.compareTo(s2) == 0) {
            System.out.println("String is equal");
        } 
        else if(s1.compareTo(s2) > 0) {
            System.out.print("S1 is greater than s2");
        }
        else {
            System.out.println("S1 is lesser than s2");
        }      
 
       
       // equals() method
    //    if(s1.equals(s2)) {
    //        System.out.println("They are the same string");
    //    } else {
    //        System.out.println("They are different strings");
    //    }
      
   }
}


// Substring: The substring of a string is a subpart of it.
// public class Strings {
//    public static void main(String args[]) {
//        String name = "TonyStark";
     
//        System.out.println(name.substring(0, 4));
//    }
// }

// ParseInt Method of Integer class
// public class Strings {
//    public static void main(String args[]) {
//        String str = "123";
//        int number = Integer.parseInt(str);
//        System.out.println(number);      
//    }
// }

// ToString Method of String class
// public class Strings {
//    public static void main(String args[]) {
//       int number = 123;
//       String str = Integer.toString(number);
//       System.out.println(str.length());
//    }
// }