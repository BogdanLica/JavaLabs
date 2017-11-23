import java.util.ArrayList;
import java.util.Iterator;

public class UserGroup
{
    private ArrayList<User> listUsers;

	//Constructor
	public UserGroup()
	{
         listUsers = new ArrayList<User>();
	}

	// Return the user by the index in the array list
	public User getUser(int index)
	{
		return listUsers.get(index);
	}


	//Create 10 Users
	public void addSampleData()
	{
		User temp = null;

		temp = new User("bob123","editor","Bob");
		checkAllowedType(temp);
		
		temp = new User("alex8u","admin","Alex");
		checkAllowedType(temp);

		temp = new User("bb92","user","George");
		checkAllowedType(temp);

		temp = new User("house87","editor","Jack");
		checkAllowedType(temp);

		temp = new User("doggy123","editor","Bobby");
		checkAllowedType(temp);

		temp = new User("123abc","user","Andrew");
		checkAllowedType(temp);

		temp = new User("admin","user","Alex");
		checkAllowedType(temp);

		temp = new User("p@ssword","user","Mike");
		checkAllowedType(temp);

		temp = new User("x","admin","Pavel");
		checkAllowedType(temp);

		temp = new User("alex","editor","Joe");
		checkAllowedType(temp);
		
	}

	public void checkAllowedType(User temp)
	{
		if(temp.getUserType() != "")
		{
			listUsers.add(temp);
		}

	
	}

	// Print all the usernames
	public void printUsernames()
	{
		for(User object:listUsers)
		{
			System.out.println("Username: " + object.getUsername() + " " + "Usertype: " + object.getUserType());
		}
	}
	


}