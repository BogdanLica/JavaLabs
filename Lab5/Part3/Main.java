import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {

        // Create an object of type WordGroup
        WordGroup groupA = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");
        WordGroup groupB = new WordGroup("When you play play hard when you work dont play at all");


        HashMap<String,Integer> myMapGroupA = new HashMap<String,Integer>();
        myMapGroupA = groupA.getWordCounts();
        HashMap<String,Integer> myMapGroupB = new HashMap<String,Integer>();
        myMapGroupB = groupB.getWordCounts();

       
        Set<String> mySetGroupA = myMapGroupA.keySet();
        Iterator<String> itA = mySetGroupA.iterator();
        System.out.println();
        System.out.println("First Set:");
        while(itA.hasNext())
        {
            String currentString = itA.next();
            System.out.println(currentString + " " + myMapGroupA.get(currentString));
        }


        Set<String> mySetGroupB = myMapGroupB.keySet();
        Iterator<String> itB = mySetGroupB.iterator();
        System.out.println();
        System.out.println("Second Set:");
        while(itB.hasNext())
        {
            String currentString = itB.next();
            System.out.println(currentString + " " + myMapGroupB.get(currentString));
        }
        

        
        // Create a set that contains all the words from both WordGroups
        HashSet<String> mySet = new HashSet<String>();
        mySet=groupA.getWordSet(groupB);
        
        System.out.println();
        System.out.println("HashMap:");
        Iterator<String> it = mySet.iterator();
       
        while(it.hasNext())
        {   //create a temporary variable that contains the current word in the iteration
            String currentString = it.next();
            int sumCounters;

            //In case there is not an entry of the current word in the HashMap of the groupA,consider the counter only from groupB
            if(myMapGroupA.get(currentString) == null)
            {
                sumCounters=myMapGroupB.get(currentString);
            }
            
            else if(myMapGroupB.get(currentString) == null)
            {
                sumCounters=myMapGroupA.get(currentString);
            }
            // if the current word is in both HashMaps,the total counter is the sum of the individual counters
            else
            {
                sumCounters = myMapGroupA.get(currentString) + myMapGroupB.get(currentString);
            }

            System.out.println(currentString + " " + sumCounters);

        }


    }
}
