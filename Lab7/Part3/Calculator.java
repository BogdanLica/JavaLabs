public class Calculator {
    Double x;
    /*
    * Chops up input on ' ' then decides whether to add or multiply.
    * If the string does not contain a valid format returns null.
    */
    public Double x(String x){
        x.split(" ");
        x.indexOf(" ");
        this.x = new Double((x.substring(x.lastIndexOf(" "))));

        if(x.contains("+"))
        {

            return this.x(new Double((x.substring(0,x.indexOf(" ")))));
        }
        else if(x.contains("*"))
        {
            return this.x(Double.parseDouble((x.substring(0,x.indexOf(" ")))));
        }

        return null;
    }

    /*
    * Adds the parameter x to the instance variable x and returns the answer as a Double.
    */
    public Double x(Double x){
        System.out.println("== Adding ==");
        return new Double( x + this.x);
    }

    /*
    * Multiplies the parameter x by instance variable x and return the value as a Double.
    */
    public Double x(double x){
        System.out.println("== Multiplying ==");
        return new Double(x * this.x);
    }

}
