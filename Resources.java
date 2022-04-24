import java.sql.SQLOutput;
import java.util.Random;

public class Resources {
     protected String resourceName;
    int number;

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



    /**
     * This is a getter method for the number of resource
     * @return  attribute number which defines the type of resource
     * carbon = 1, iron = 2, water = 3, uranium = 4
     */
   public void explode(Asteroid a) {};


    public void sublime(Asteroid a)
    {
        System.out.println("This is reactWithSun() of Resource");
    }

}
