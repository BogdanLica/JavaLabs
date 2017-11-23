public class FizzBuzz { //create the class FizzBuzz
	public static void main(String[] args)	// construct the main method
	{
		for(Integer i = new Integer(1);i < 61; i++) // create an object Integer and assign the values from 1 to 60
		{
			
			if(i % 3 != 0 && i % 5 != 0) // check if the number is not a multiple of 3 and not a multiple of 5
			{	
				System.out.print(i); // print the number if the condition is met
			}


			if(i % 3 == 0) // check if the number is a multiple of 3
			{
				System.out.print("Fizz"); // print Fizz if the condition is met
			}


			if(i % 5 == 0) // check if the number is a multiple of 5
			{
				System.out.print("Buzz"); // print Buzz if the condition is met
			}


			System.out.println(); // go to the new line
			
		}
	}
}
