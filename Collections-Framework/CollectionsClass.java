import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClass 
{

    public static void main(String[] args) 
    {

        List<Integer> list = new ArrayList<>();

        list.add(6);
        list.add(4);
        list.add(3);

        Collections.addAll(list, 2, 5, 1);

        // Sorting
        Collections.sort(list);
        // Collections.sort(list, Collections.reverseOrder());

        // Searching
        // int index = Collections.binarySearch(list, 4);
        // System.out.println(index);

        List<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(10);

        // Copy
        // Collections.copy(list, list2);

        // disjoint - It returns true if the two collections do not have any element in common.
        // System.out.println(Collections.disjoint(list, list2));

        System.out.println(list);
    }

}
