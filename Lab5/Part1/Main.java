public class Main {
    public static void main(String[] args)
    {


        // create an object of type WordGroup
        WordGroup groupA = new WordGroup("You can discover more about a person in an hour of play than in a year of conversation");

        WordGroup groupB = new WordGroup("When you play play hard when you work dont play at all");

        //declare a String arrays
        String[] wordsFromGroupA = new String[300];
        wordsFromGroupA = groupA.getWordArray();

        String[] wordsFromGroupB = new String[300];
        wordsFromGroupB = groupB.getWordArray();


        System.out.println("First quote:");
        // Loop through the String array and print each element
        for(int i=0 ; i <wordsFromGroupA.length;i++)
        {
            System.out.println(wordsFromGroupA[i]);

        }


		System.out.println("Second quote:");
        for(int i=0 ; i <wordsFromGroupB.length;i++)
        {
            System.out.println(wordsFromGroupB[i]);

        }

    }
}
