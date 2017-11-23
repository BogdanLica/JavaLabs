
public class CardLock
{
    SmartCard lastCard;
    boolean lock=false;
    boolean studentAllowed = false;
       
    public void swipeCard(SmartCard cardInput)
    {
        lastCard = cardInput;
    
    }
    
    public SmartCard getLastCardSeen()
    {
    
        return lastCard;
    }
    
    public boolean isUnlocked()
    {   
        if(lastCard.isStaff() == true || studentAllowed == true)
        {
            lock=true;
            
        }
        else
        {
            lock = false;    
        }
        return lock;
    
    }
    
    public void toggleStudentAccess()
    {
        studentAllowed = !studentAllowed;
    
    
    }
    
}
