public abstract class Herbivore extends Animal {

    //Constructor
    public Herbivore(String inputName,int inputAge)
    {
        super(inputName,inputAge);
    }

    @Override
    void eat(Food foodPassed) throws Exception
    {
        if(foodPassed instanceof Meat)
        {
            throw new Exception("Do not give me meat");
        }
        else {
            System.out.println("Herbivore is eating the given food");
        }
    }
}

