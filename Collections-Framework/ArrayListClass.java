import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections; // for sort method

import java.util.List; // List interface


/* Propertise:
* An ArrayList is a re-sizable array, also called a dynamic array.
* Java ArrayList allows duplicate and null values.
* Java ArrayList is an ordered collection. It maintains the insertion order of the elements.
* You cannot create an ArrayList of primitive types like int, char etc. You need to use boxed types like Integer, Character, Boolean etc.
* Java ArrayList is not synchronized
*/

class ArrayListClass
{
	public static void main(String[] args)
	{
		// First way
		ArrayList<String> list = new ArrayList<String>(4);
		for(int i=0)
		Collections.fill(list, "ab");
		System.out.println(list.size());
		// list.add("vikash");
		// list.add("Nikhil");
		// list.add("Mangal");
		// list.add("Ravi");

		// Iterator it = list.iterator(); // Making iterator on list
		// while(it.hasNext())
		// 	System.out.println(it.next());

		// System.out.println(list);  // Displaying list

		// Another way BOTH are same
		// List<String> ls = new ArrayList<>();
		// ls.add("Vikash");
		// ls.add("Mangla");
		// ls.add("Mangla");
		// ls.add("Nikhil");

		// First way
		// Iterator it = ls.iterator();
		// while(it.hasNext())
		// 	System.out.println(it.next());

		// Second and Recommended way because it is easy
		// for(String x:ls)
		// 	System.out.println(x);

		// Adding an element at a particular index in an ArrayList
        // ls.add(2, "Elephant");

        // list.addAll(ls); // This will add all the elements which is present in ls to list.
        // System.out.println(ls.contains("Vikash"));

		// System.out.println(list);

		// Accessing elements from an ArrayList. there is 4 method for accessing element isEmpty, size, get, set.
		// System.out.println(ls.isEmpty());
		// System.out.println(ls.size());
		// System.out.println(ls.get(3));
		// ls.set(3, "Sharma"); // updateing element

		// Removing elements from an ArrayList
		// ls.remove(2);
		// ls.remove(String.valueOf("Vikash")); // This will remove 30 from the list
		// ls.clear();

		// Sorting an ArrayList using collections.sort()
		// Collections.sort(ls);

		// System.out.println(ls);
	}
}