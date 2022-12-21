import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


/* Propertise:
* HashSet cannot contain duplicate values.
* HashSet allows null value.
* HashSet is an unordered collection. It does not maintain the order in which the elements are inserted.
* HashSet internally uses a HashMap to store its elements.
* HashSet is not thread-safe. If multiple threads try to modify a HashSet at the same time, then the final outcome is not-deterministic. You must explicitly synchronize concurrent access to a HashSet in a multi-threaded environment.
*/


class HashSetClass
{
	public static void main(String args[])
	{
		Set<String> daysOfWeek = new HashSet<>();
		daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        daysOfWeek.add("Monday");

        // System.out.println(daysOfWeek.getClass().getSimpleName());
        // System.out.println(daysOfWeek.isEmpty());
        // System.out.println(daysOfWeek.size());
        // System.out.println(daysOfWeek.contains("Monday"));

        // Removing elements from a HashSet
        // daysOfWeek.remove("Monday");
        // daysOfWeek.clear();

        // System.out.println(daysOfWeek);

        // Iterating over a HashSet
        // for(String x : daysOfWeek)
        // 	System.out.println(x);

        // daysOfWeek.forEach((element)->{
        // 	System.out.println(element);
        // });

        // Iterator<String> it = daysOfWeek.iterator();
        // while(it.hasNext())
        // 	System.out.println(it.next());
        
        // System.out.println(daysOfWeek);
	}
}