import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Main
{
	public static void main(String[] args)
	{
        UserGroup myUserGroup = new UserGroup();
        myUserGroup.addSampleData();
        //myUserGroup.printUsernames();


        UserGroup administrators = new UserGroup();
        Iterator<User> iteratorAdministrators = myUserGroup.getUserIterator();

        
        while(iteratorAdministrators.hasNext())
        {
            User currentUser = iteratorAdministrators.next();

            if(currentUser.getUserType().equals("admin")) // check if the User is an admin
            {
              administrators.addUser(currentUser.getUsername(),currentUser.getUserType(),currentUser.getName());
            }
        }
        administrators.printUsernames();


        Iterator<User> iteratorModifyAdmins = administrators.getUserIterator();
        User lastUser = null;

        while(iteratorModifyAdmins.hasNext())
        {
            lastUser = iteratorModifyAdmins.next();
        }
        lastUser.setUserType("user");

        System.out.println("Users:");
        myUserGroup.printUsernames();
        System.out.println("Admins:");
        administrators.printUsernames();

        /*
        Problem:
        There is now a user in the admin group

        Solution(1):
        Using inheritance, have the children classes: Administrator Class and a User Class and the parent class: UserGroup
        In the Administrator Class, override the setUserType so that the type can not be changed

        Solution(2):
        Do no let the userType to be changed to admin unless it is specified at the beginning(remove the setType method)
         */

	}
	
	
	

	
	
	
}