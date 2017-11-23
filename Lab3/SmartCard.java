public class SmartCard
{
    
    private String nameOwner="";
    private Boolean staffStatus=false;
    /**
     * Constructor for objects of class SmartCard
     */
    public SmartCard(String name)
    {
        // initialise instance variables
        nameOwner = name;
    }

    public String getOwner()
    {
        return nameOwner;
    }
    public boolean isStaff()
    {
        if(staffStatus == true)
        {
            return staffStatus;
        }
        else 
        {
            return false;
        }
    
    }
    public void setStaff(boolean valueInput)
    {
        staffStatus = valueInput;
    
    }
}
