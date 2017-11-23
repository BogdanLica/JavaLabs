
public class Main {

    public static void main(String[] args)
    {
        Wolf myWolf = new Wolf("Wolf1",5);
        Parrot myParrot = new Parrot("Captain",9);
        Deer myDeer = new Deer("Deer1",92);

        Meat myMeat = new Meat("Chicken");
        Plant myPlant = new Plant("Astilbe");


        try {
            myWolf.eat(myMeat);
            myDeer.eat(myPlant);
            myWolf.eat(myPlant);
        } catch (Exception e) {
            // Print the error thrown by the class
            System.err.println(e.getMessage());
        }

    }
}
