public class User
{
	private String username="";
	private String userType="";
	private String name;

	// Constructor
	public User(String user,String userTypeInput,String nameInput){
		this.username=user;
		setUserType(userTypeInput);
		this.name = nameInput;
		
	}

	// Return username
	public String getUsername()
	{
		return this.username;
	}

	// Return the userType
	public String getUserType()
	{
		return this.userType;
	}

	// Return the name
	public String getName()
	{
		return this.name;
	}

	// Set the userType
	public void setUserType( String parameterUserType)
	{
        this.userType=checkType(parameterUserType,this.username);

	}

	// check if the userType is 'user', 'editor' or 'admin'
	public String checkType(String userTypeparameter,String currentUsername)
	{
		if(userTypeparameter.equals("user")||userTypeparameter.equals("editor")||userTypeparameter.equals("admin"))
		{
			return userTypeparameter;
		}
		System.out.println("Input userType not valid at username: " + currentUsername);
		return "";
	}
	
	

}