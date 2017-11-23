public class TestCalculator {

    private Calculator myCalc = new Calculator();
    public boolean testParser()
    {
        // the variable with the number of successful tests
        int noOfSucTests = 0;

        //Check for adding
        if(myCalc.x("12 + 5") == 17)
        {
            noOfSucTests++;
        }
        else
        {
            System.out.println("[FAIL] Basic parsing fails to add.");
        }

        //Check for multiplication
        if(myCalc.x("12 x 5") == 60)
        {
            noOfSucTests++;
        }
        else
        {
            System.out.println("[FAIL] Basic parsing fails to multiply.");
        }

        //Check for syntax error
        if(myCalc.x("12 [ 5") == null)
        {
            noOfSucTests++;
        }
        else
        {
            System.out.println("[FAIL] Parser does not return null for operators which are not supported.");
        }

        if(noOfSucTests == 3)
        {
            return true;
        }

        return false;
    }

    public boolean testAdd()
    {
        // the variable with the number of successful tests
        int noOfSucTests = 0;

        //Check for adding positive numbers
        myCalc.x = Double.valueOf(100);
        if(myCalc.x(new Double(9)) == 109)
        {
            noOfSucTests++;
        }
        else
        {
            System.out.println("[FAIL] Calculator adds incorrectly");
        }

        //Check for adding negative numbers
        myCalc.x = Double.valueOf(-55);
        if(myCalc.x( new Double(-79)) == -134)
        {
            noOfSucTests++;
        }
        else
        {
            System.out.println("[FAIL] Calculator adds with negative numbers incorrectly");
        }

        if(noOfSucTests == 2)
        {
            return true;
        }

        return false;
    }

    public boolean testMultiplication()
    {
        // the variable with the number of successful tests
        int noOfSucTests = 0;

        //Check for multiplying positive numbers
        myCalc.x = Double.valueOf(2);
        if(myCalc.x(10) == 20)
        {
            noOfSucTests++;
        }
        else
        {
            System.out.println("[FAIL] Calculator multiplies incorrectly");
        }

        //Check for multiplying negative numbers
        myCalc.x = Double.valueOf(-11);
        if(myCalc.x(-9) == 99)
        {
            noOfSucTests++;
        }
        else
        {
            System.out.println("[FAIL] Calculator multiplies by negative incorrectly");
        }

        if(noOfSucTests == 2)
        {
            return true;
        }

        return false;
    }
}
