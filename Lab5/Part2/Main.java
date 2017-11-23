import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {


        //Create an object of type WordGroup
        WordGroup groupA = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup groupB = new WordGroup("When you play play hard when you work dont play at all");


        //Create a HashSet and assign the value returned by the function
        HashSet<String> myHash =  new HashSet<>();
        myHash = groupA.getWordSet(groupB);


        // Create an iterator
        Iterator<String> it = myHash.iterator();


        while(it.hasNext())
        {
            System.out.println(it.next());

        }


    }
}
