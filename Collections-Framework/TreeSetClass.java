import java.util.TreeSet;
import java.util.SortedSet;


/* Propertise:
* TreeSet cannot contain duplicate elements.
* The elements in a TreeSet are sorted as per their natural ordering, or based on a custom Comparator that is supplied at the time of creation of the TreeSet.
* TreeSet cannot contain null value.
* TreeSet internally uses a TreeMap to store elements.
* TreeSet class is not thread-safe. You must explicitly synchronize concurrent access to a TreeSet in a multi-threaded environment
*/



class TreeSetClass
{
	public static void main(String[] args)
	{
		SortedSet<String> fruits = new TreeSet<>();
		fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        // System.out.println(fruits);	

        System.out.println(fruits.size());
        System.out.println(fruits.contains("Banana"));

        // Navigating through the TreeSet
        System.out.println(fruits.first());
        System.out.println(fruits.last());
	}
}