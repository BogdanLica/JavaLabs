public class Main {

    public static void main(String[] args)
    {
        Wolf myWolf = new Wolf("Doggy",5);
        Parrot myParrot = new Parrot("Captain",9);

        System.out.println("Wolf:");
        System.out.println(myWolf.getName() + " " + myWolf.getAge());

        System.out.println("Parrot:");
        System.out.println(myParrot.getName() + " " + myParrot.getAge());


        System.out.println();
        Meat myMeat = new Meat("Chicken");
        Plant myPlant = new Plant("Astilbe");

        System.out.println(myMeat.getName());
        System.out.println(myPlant.getName());




    }
}
