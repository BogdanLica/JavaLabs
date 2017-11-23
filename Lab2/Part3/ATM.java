public class ATM {
	 Integer bankBalance = new Integer(0);
	 Integer decision = new Integer(0);
	 Integer checkNegBalance = new Integer(0);
	 
	//Get the input from the user
	    Toolbox myToolbox = new Toolbox();	
	    // 	bankBalance = myToolbox.readIntegerFromCmd(); You need to be in a method in order to call it
			
	 
	public void go()
	{
		//Greetings
		System.out.println("Welcome to online ATM banking");
		System.out.println("How much do you want in your account?");
		
		//Start balance
		bankBalance = myToolbox.readIntegerFromCmd();

		while(bankBalance < 0) // do not let the starting balance to be negative
		{
			System.out.println("Do not enter a negative value");
			System.out.println("How much do you want in your account?");
			bankBalance = myToolbox.readIntegerFromCmd();
			//ask the user for input until the number given is positive
		}
		
		
		// Run continuously
		while(true)
		{
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
	}

	public void withdraw()
	{
		System.out.println("*****************************************");
		System.out.println("                 Withdrawal              ");
		System.out.println("*****************************************");
		
		
		Integer withdrawalAmount = new Integer(0);
		
		System.out.println("How much would you like to withdraw?");
		withdrawalAmount = myToolbox.readIntegerFromCmd();

		if(withdrawalAmount < 0) // check if they have entered a negative value
		{
			System.out.println("Do not enter a negative value");
		}
		else
		{
			// check if the balance would be negative
			checkNegBalance = bankBalance - withdrawalAmount; 
			if(checkNegBalance < 0)
			{
				System.out.println("Sorry,not suficient funds");
			}
			else
			{
				bankBalance = checkNegBalance;
			}
			
		}
		
	}


	public void deposit()
	{
		System.out.println("*****************************************");
		System.out.println("                 Deposit                 ");
		System.out.println("*****************************************");
		
		
		Integer depositAmount = new Integer(0);
		
		System.out.println("How much would you like to deposit");
		depositAmount = myToolbox.readIntegerFromCmd();

		if(depositAmount < 0)  // check if they have entered a negative value
		{
			System.out.println("Do not enter a negative value");
		}
		else
		{
		bankBalance = bankBalance + depositAmount; // add withdrawalAmount to bankBalance
		}
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
		System.exit(0); // terminate program

	}
	
}
