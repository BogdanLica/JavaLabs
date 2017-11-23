public abstract class Carnivore extends Animal {

    //Constructor
    public Carnivore(String inputName, int inputAge) {
        super(inputName, inputAge);
    }

    @Override
    void eat(Food foodPassed) throws Exception {

        if(foodPassed instanceof Plant)
        {
            throw new Exception("Do not give me plants");
        }
        else {
            System.out.println("Carnivore is eating the given food");
        }
    }
}
