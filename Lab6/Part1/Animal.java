public class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String inputName,int inputAge)
    {
        this.name = inputName;
        this.age=inputAge;

    }


    // Return the age
    public int getAge()
    {
        return this.age;
    }


    // Return the name
    public String getName()
    {
        return this.name;
    }



}
