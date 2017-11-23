public class Deer extends Herbivore{

	//Constructor
    public Deer(String inputName, int inputAge)
    {
        super(inputName,inputAge);
    }

    @Override
    void makeNoise()
    {
        System.out.println("Something");
    }
}
