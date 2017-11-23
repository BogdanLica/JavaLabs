public class Main {
    public static void main(String[] args)
    {
        TestCalculator myTest = new TestCalculator();

        int successfulTests=0;

        boolean testParser = myTest.testParser();
        boolean testAdd = myTest.testAdd();
        boolean testMultiplication = myTest.testMultiplication();

        if(testParser && testAdd && testMultiplication)
        {
            System.out.println( "Congratulations, your Calculator appears to be working." );
        }

    }
}
