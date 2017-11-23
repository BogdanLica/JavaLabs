public class ATM {
	 Integer bankBalance = new Integer(0);
	 Integer decision = new Integer(0);
	 
	//Get the input from the user
	    Toolbox myToolbox = new Toolbox();	
	 
			
	 
	public void go()
	{
		
		System.out.println("Welcome to online ATM banking");
		System.out.println("How much do you want in your account?");
		
		//Start balance
		bankBalance = myToolbox.readIntegerFromCmd();
		

		//Options
		System.out.println("What do you want to do?");
		System.out.println("1 : Withdraw");
		System.out.println("2 : Deposit");
		System.out.println("3 : Inquire");
		System.out.println("4 : Quit");
		decision = myToolbox.readIntegerFromCmd();
		
		
		if(decision.equals(1))
			{
				withdraw();
			}

		else if(decision.equals(2))
			{
				deposit();			
			}
		
		
		else if(decision.equals(3))
			{
				inquire();			
			}
		
		else if(decision.equals(4))
			{
				quit();			
			}
		
		
	}


	public void withdraw()
	{
		System.out.println("*****************************************");
		System.out.println("                 Withdrawal              ");
		System.out.println("*****************************************");
		
		
		Integer withdrawalAmount = new Integer(0);
		
		System.out.println("How much would you like to withdraw?");
		withdrawalAmount = myToolbox.readIntegerFromCmd();
		bankBalance = bankBalance - withdrawalAmount; // deduct withdrawalAmount from bankBalance
	}


	public void deposit()
	{
		System.out.println("*****************************************");
		System.out.println("                 Deposit                 ");
		System.out.println("*****************************************");
		
		
		Integer depositAmount = new Integer(0);
		
		System.out.println("How much would you like to deposit");
		depositAmount = myToolbox.readIntegerFromCmd();
		bankBalance =bankBalance + depositAmount; // add withdrawalAmount to bankBalance
	}




	public void inquire()
	{
		System.out.println("*****************************************");
		System.out.println("                Your balance is " + bankBalance);
		System.out.println("*****************************************");
	}


	public void quit()
	{
		System.out.println("*****************************************");
		System.out.println("                 GoodBye!                ");
		System.out.println("*****************************************");

	}

	
}
