import java.util.Stack;
import java.util.Iterator;

public class StackClass
{

    public static void main(String[] args) 
    {
        Stack<String> animals= new Stack<>();

        animals.push("Lion");
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");

        // System.out.println(animals);

        // System.out.println(animals.getClass().getSimpleName()); // it give class name of aminal

        // animals.pop();
        // System.out.println(animals.peek());
        // System.out.println(animals.isEmpty());
        // System.out.println(animals.size());
        // System.out.println(animals.search("Horse")); // search top to bottom

        // Iterating over a Stack
        // for(String x:animals)
        // 	System.out.println(x);

        // animals.forEach((element)->{
        // 	System.out.println(element);
        // });

        // Iterator<String> it = animals.iterator();
        // while(it.hasNext())
        // 	System.out.println(it.next());
    }
}
