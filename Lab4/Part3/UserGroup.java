import java.util.ArrayList;
import java.util.Iterator;

public class UserGroup
{
    private ArrayList<User> listUsers;

	// Constructor
	public UserGroup()
	{
         listUsers = new ArrayList<User>();
	}

	// Return the user by the index in the array list
	public String getUser(int index)
	{
		return listUsers.get(index).getUsername();
	}

	// Add a new user to the usergroup
	public void addUser(String user,String userType,String name)
    {
        listUsers.add(new User(user,userType,name));

    }

	//Create 10 Users
	public void addSampleData()
	{
		User temp = null;

		temp = new User("bob123","editor","Bob");
		checkAllowedType(temp);

		temp = new User("alex8u","admin","Alex");
		checkAllowedType(temp);

		temp = new User("bb92","admin","George");
		checkAllowedType(temp);

		temp = new User("house87","editor","Jack");
		checkAllowedType(temp);

		temp = new User("doggy123","editor","Bobby");
		checkAllowedType(temp);

		temp = new User("123abc","user","Andrew");
		checkAllowedType(temp);

		temp = new User("admin","admin","Alex");
		checkAllowedType(temp);

		temp = new User("p@ssword","user","Mike");
		checkAllowedType(temp);

		temp = new User("x","admin","Pavel");
		checkAllowedType(temp);

		temp = new User("alex","admin","Joe");
		checkAllowedType(temp);

	}

	// If the userType is correct,the object is added to the list
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

	// Delete the first user in the list
	public void removeFirstUser()
	{
			listUsers.remove(0);
		
	}

    // Delete the last user in the list
	public void removeLastUser()
	{
			listUsers.remove(listUsers.size());
	}


    // Remove the user taken as input
	public void removeUser(String userToFind)
	{
		Iterator<User> iterateUsers = listUsers.iterator();
		boolean check = false;

		while(iterateUsers.hasNext())
		{

			if(iterateUsers.next().getUsername() == userToFind) // check if the current object's username is equal to the user input
			{
				iterateUsers.remove();
				check = true;
				break;
			}
			
		}

		if(!check)
        {
            System.out.println("That user does not exist");
        }
		
		
	}

	// Returns an Iterator from the ArrayList
    public Iterator<User> getUserIterator()
    {
			Iterator<User> userIterator = listUsers.iterator();

			return userIterator;
    }

	



}