import java.util.LinkedHashMap;
import java.util.Map;


/* Propertise:
* A LinkedHashMap cannot contain duplicate keys.
* LinkedHashMap can have null values and the null key.
* Unlike HashMap, the iteration order of the elements in a LinkedHashMap is predictable.
* Just like HashMap, LinkedHashMap is not thread-safe. You must explicitly synchronize concurrent access to a LinkedHashMap in a multi-threaded environment.
*/


class LinkedHashMapClass
{
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> wordNumberMapping = new LinkedHashMap<>();
		wordNumberMapping.put("one", 1);
        wordNumberMapping.put("two", 2);
        wordNumberMapping.put("three", 3);
        wordNumberMapping.put("four", 4);

        wordNumberMapping.putIfAbsent("five", 5);

        // System.out.println(wordNumberMapping);

        // System.out.println(wordNumberMapping.containsKey("one"));
        // System.out.println(wordNumberMapping.containsValue(2));

        // wordNumberMapping.put("two", 6);

        // Accessing the entries of a LinkedHashMap
        // System.out.println(wordNumberMapping.containsKey("five"));
        // System.out.println(wordNumberMapping.containsValue(6));

        // Removing entries from a LinkedHashMap
        // wordNumberMapping.remove("one");
        // wordNumberMapping.remove("two", 6);

        // System.out.println(wordNumberMapping);

        // Iterating
        // wordNumberMapping.forEach((key, value)->{
        // 	System.out.println(key + " " + value);
        // });

        // for(Map.Entry<String, Integer> x : wordNumberMapping.entrySet())
        // 	System.out.println(x.getKey() + " " + x.getValue());

        // for(String x:wordNumberMapping.keySet())
        // 	System.out.println(x);

        // for(Integer x:wordNumberMapping.values())
        // 	System.out.println(x);
	}
}