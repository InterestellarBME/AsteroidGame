import java.sql.SQLOutput;
import java.util.Random;

public class Resources {
     protected String resourceName;
     public int number;         // carbon = 1, iron = 2, water = 3, uranium = 4

    /**
     * constructor to set the resource name attribute
     * @param resourceName name of desired resource to be instantiated
     *
     */
    public Resources(String resourceName)
    {
    this.resourceName=resourceName;
    }

    /**
     * This is a getter method for the resource name
     * @return the value of resource name attribute
     */
    public String getResourcesName()
    {
        return this.resourceName;
    }

    /**
     * This function assigns a randomly resources by generating a random  number between 1 and 4
     * using Random function.
     */
    public void setNumber()
    {
        this.number= new Random().nextInt(3)+1;
    }

    /**
     * This is a getter method for the number of resource
     * @return  attribute number which defines the type of resource
     * carbon = 1, iron = 2, water = 3, uranium = 4
     */
    public int getNumber(){
        return this.number;
    }

    /**
     * This is an abstract method, implemented by Uranium and IceWater classes
     * it will explode in case of uranium resource
     * the water will sublimes in case of Icewater resource
     * @param a the asteroid which contains either one of the two resources

     */
    public void reactWithSun(Asteroid a)
    {
        System.out.println("This is reactWithSun() of Resource");
    }

}
