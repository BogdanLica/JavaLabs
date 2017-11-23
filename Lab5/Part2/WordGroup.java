import java.util.HashMap;
import java.util.HashSet;

public class WordGroup {

    private String words="";

    // Constructor
    public WordGroup(String inputString)
    {
        this.words = inputString.toLowerCase();
    }

    // Split the input into separate words and store them in a String array
    public String[] getWordArray()
    {
        String[] temp = new String[300];
        temp = this.words.split(" ");
        return temp;

    }

    // Return a HashSet with all the Strings from the two objects
    public HashSet<String> getWordSet(WordGroup parameterWordGroup)
    {  
        //Create a HashSet
        HashSet<String> myHashSet = new HashSet<String>();


        String[] firstGroup = new String[300];
        firstGroup = this.getWordArray();

        String[] secondGroup = new String[300];
        secondGroup = parameterWordGroup.getWordArray();

        // Loop through the first array of words and add each element into the HashSet
        for(int i=0;i<firstGroup.length;i++)
        {
            myHashSet.add(firstGroup[i]);

        }

        // Loop through the second array of words and add each element into the HashSet
        for(int i=0;i<secondGroup.length;i++)
        {
            myHashSet.add(secondGroup[i]);

        }

        return myHashSet;
    }


}
