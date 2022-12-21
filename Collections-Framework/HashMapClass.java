import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;

/* Propertise:
* A HashMap cannot contain duplicate keys.
* Java HashMap allows null values and the null key.
* HashMap is an unordered collection. It does not guarantee any specific order of the elements.
* Java HashMap is not thread-safe. You must explicitly synchronize concurrent modifications to the HashMap.
*/

class HashMapClass
{
	public static void main(String a[])
	{
		Map<String, Integer> numberMapping = new HashMap<>();
		numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        numberMapping.putIfAbsent("Four", 4);

        // System.out.println(numberMapping);

        // System.out.println(numberMapping.isEmpty());
        // System.out.println(numberMapping.size());
        // System.out.println(numberMapping.containsKey("One"));
        // System.out.println(numberMapping.containsValue(6));
        // System.out.println(numberMapping.get("One"));
        // numberMapping.put("One", 5);

        // System.out.println(numberMapping);

        // Removing keys from a HashMap
        // numberMapping.remove("One");
        // numberMapping.remove("Two", 2); // Remove a key from the HashMap only if it is mapped to the given value

        // System.out.println(numberMapping);


        // HashMap's entry set
        // Set<Map.Entry<String, Integer>> keyValueSet = numberMapping.entrySet();
        // System.out.println(keyValueSet);

        // HashMap's key set
        // Set<String> keySet = numberMapping.keySet();
        // System.out.println(keySet);

        // HashMap's values
        // Collection<Integer> valueSet = numberMapping.values();
        // System.out.println(valueSet);

        // Iterating over a HashMap
        // numberMapping.forEach((key, value)->{
        //     System.out.println(key + ": " + value);
        // });

       //  for (Map.Entry<String, Integer> e: numberMapping.entrySet()) {
       //     // System.out.println(e);

       //     System.out.println(e.getKey() + ": " + e.getValue());
       // }

       //  for (String key: numberMapping.keySet()) {
       //     System.out.println(key);
       // }

       // for(Integer value: numberMapping.values()) {
       //     System.out.println(value);
       // }

        // Set<Map.Entry<String, Integer>> keyValues = numberMapping.entrySet();
        // Iterator<Map.Entry<String, Integer>> it = keyValues.iterator();
        // while(it.hasNext())
        // {
        //     Map.Entry<String, Integer> entry = it.next();
        //     System.out.println(entry.getKey() + ": " + entry.getValue());
        // }
	}
}