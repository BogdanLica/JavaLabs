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


}
