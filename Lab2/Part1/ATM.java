public class ATM {
	 Integer bankBalance = new Integer(0);
	 Integer decision = new Integer(0);
	 
	 //Get the input from the user
	    Toolbox myToolbox = new Toolbox();	
	 //bankBalance = myToolbox.readIntegerFromCmd(); You need to be in a method in order to call it
			
	 
	public void go()
	{
		
		System.out.println("Welcome to online ATM banking");
		System.out.println("How much do you want in your account?");
		
		//input the start balance
		bankBalance = myToolbox.readIntegerFromCmd();
		
			
		//Display balance
		System.out.print("Your balance is : ");
		System.out.println(bankBalance);
		
	}
	
}
