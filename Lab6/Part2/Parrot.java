public class Parrot extends Animal {

	// Constructor
    public Parrot(String inputName, int inputAge) {
        super(inputName, inputAge);
    }

    // Print the noise
    @Override
    void makeNoise()
    {
        System.out.println("Purrrr");
    }

}
