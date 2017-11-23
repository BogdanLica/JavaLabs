public abstract class Omnivore extends Animal {

    //Constructor
    public Omnivore(String inputName,int inputAge)
    {
        super(inputName,inputAge);
    }

    @Override
    void eat(Food myFood)
    {
        System.out.println("Omnivore is eating the given food");
    }
}
