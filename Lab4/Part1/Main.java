import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args)
	{
		int userInput=0,numberOfLoops=0;
		
		System.out.println("Enter your number: ");
		userInput = readIntegerFromCmd();

		multiplicationTable(userInput);

        numberOfLoops = sumOfConsecutives();
		System.out.println("Number of iterations : " + numberOfLoops);
		
	}
	
	
	// Make a multiplication Table up to 20 times the number input from the user
	public static void multiplicationTable(int inputUser)
    {
        for(int i=1;i<=20;i++) 
        {
            System.out.println("*" + i*inputUser + "*");  

        }
    }


    //Produce the sum of consecutive
    public static int sumOfConsecutives()
    {
    	//a variable where the sum of the consecutive numbers is stored
        int sum=0;
        // the consecutive number that is added to the sum,also the number of iterations 
        int counter=1; 

        while(sum <= 500)
        {
        	// add the new consecutive number to the old sum
            sum = sum+counter; 
            // go to the next consecutive number,also to the next iteration
            counter++; 
        }

        //counter -1 ,because at the end of the first loop,counter = 2 instead of counter = 1
        return counter -1 ;
    }


	// Read an integer from the command line from the user
	public static int readIntegerFromCmd()
	{
		String line = null;
		int val = 0;
    try {
      BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
      line = is.readLine();
      val = Integer.parseInt(line);
	  
    } catch (NumberFormatException ex) {
      System.err.println("Not a valid number: " + line);
    } catch (IOException e) {
      System.err.println("Unexpected IO ERROR: " + e);
    }
    
	return val;
	}

	
	
	
}