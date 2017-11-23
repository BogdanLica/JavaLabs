public class Wolf extends Animal {

    // Constructor
    public Wolf(String inputName,int inputAge)
    {
        super(inputName,inputAge);
    }

    // Print the noise
    @Override
    void makeNoise()
    {
        System.out.println("Growl");
    }


}
