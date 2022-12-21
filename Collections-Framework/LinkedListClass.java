import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;


/* Propertise:
* Java LinkedList maintains the insertion order of the elements.
* LinkedList can have duplicate and null values.
* The LinkedList class implements Queue and Deque interfaces. Therefore, It can also be used as a Queue, Deque or Stack.
* Java LinkedList is not thread-safe. You must explicitly synchronize concurrent modifications to the LinkedList in a multi-threaded environment.

Java ArrayList vs LinkedList
Both ArrayList and LinkedList implement the List interface. However, they differ completely in the way they store and link to the elements.

An ArrayList stores the elements sequentially based on their index. However, a LinkedList uses a doubly-linked list to store its elements.

A doubly-linked list consists of a collection of nodes, where each node contains three fields -

The data at that node.
A pointer/reference to the next node in the list.
A pointer/reference to the previous node in the list.

*/


class LinkedListClass
{
	public static void main(String args[])
	{
		LinkedList<String> friends = new LinkedList<String>();
		friends.add("Rajeev");
        friends.add("John");
        friends.add("David");
        friends.add("Chris");

        friends.add(3, "Lisa");

        friends.addFirst("Steve");
        friends.add("Steve");
        friends.addLast("Jennifer");

        // System.out.println(friends);

        // ArrayList<String> familyFriends = new ArrayList<>();
        // familyFriends.add("Jesse");
        // familyFriends.add("Walt");

        // friends.addAll(familyFriends); // Added all the element of familyFriends to firends

        // System.out.println(friends);

        // Retrieving elements from a LinkedList
        // System.out.println(friends.getFirst());
        // System.out.println(friends.getLast());
        // System.out.println(friends.get(2));

        // Removing elements from a LinkedList
        // friends.removeFirst();
        // friends.removeLast();
        // friends.remove("John");
        // friends.clear();

        // System.out.println(friends);

        // Searching for elements in a LinkedList
        // System.out.println(friends.contains("Steve"));
        // System.out.println(friends.indexOf("Steve"));
        // System.out.println(friends.lastIndexOf("Steve"));
        // System.out.println(friends.lastIndexOf("Bob"));

        // Iterating over a LinkedList
        // for(String item : friends)
        // 	System.out.println(item);

        // Iterator<String> it = friends.iterator();
        // while(it.hasNext())
        // 	System.out.println(it.next());
	}
}