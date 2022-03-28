import javax.swing.*;

import java.net.SocketOption;
import java.util.List;
import java.util.Random;

import static java.lang.Math.random;

public class Asteroid implements IPlace{

    //resourcename represent of integers from 0 to 3

    public int depth;
    public int location;
    public boolean isTeleportable;
    public boolean checkDrilled;
    public boolean isHollow;
    public  boolean isRadioactive;
    public Resources resources;
    public int random;
   // public Resources res;


    /**
     * Setting the depth to a random value between 7 and 20.
     * Setting isTeleportable and checkDrilled initially to false.
     * Using method Random().nextInt with two values 1 and 2,
     * so that if the value is 2 the asteroid is randomly generated as a hollow one.
     * The Switch method is used to deterimne which resource is contained in the asteroid.
     */
    public Asteroid()
    {
        System.out.println("This is Asteroid() of Asteroid");
       // this.res=resources;
        this.depth=new Random().nextInt(20)+7;
        this.location=location;
        this.isTeleportable=false;
        this.checkDrilled=false;
        // 0: hollow, 1: has resources
        int ran = new Random().nextInt(2);
        if (ran == 1)
        this.isHollow=false;
        else {
            this.isHollow = true;
            return;
        }
        this.isRadioactive=false;
        if(isHollow == false)
        resources =  Asteroid.addResources();
        switch (resources.getNumber()){
            case 1:
            {
                this.isHollow=false;
                this.isRadioactive=false;
            }
            break;
            case 2:
            {
                this.isHollow=false;
                this.isRadioactive=false;
            }
            break;
            case 3:
            {
                this.isHollow=false;
                this.isRadioactive=true;
            }
            break;
        }
        // calls for the skeleton test
        this.getDepth();
    }

    /**
     * This function generates a random resource based on the number gemerated by Random() function
     * @return the randomly generated resource.
     */
    public static Resources addResources()
    {
        System.out.println("This is addResource() of Asteroid");
        int random=new Random().nextInt(3)+1;
        switch (random)
        {
            case 1:
            {
                return new Carbon();
            }
            case 2:
            {
                return new Iron();
            }
            case 3: {
                return new Uranium();
            }
            default: return null;
        }
    }

    /**
     * This function returns an integer to show lenght of asteroids mantle
     * @return asteroid depth.
     */
    public  int getDepth(){
        System.out.println("This is getDepth() of Asteroid");
        return  this.depth;

    }

    /**
     *
     * @return location of the asteroid.
     */
    public int getLocation(){
        return this.location;
    }

    /**
     *
     * @return name of the resouce.
     */
    public String getResourceName(){
        System.out.println("This is getResourceName() of Asteroid");
       return resources.getResourcesName();
    }

    /**
     * This function decreases the depth by one unit after every drilloperattion that happens untill it becomes a hollow asteroid.
     */
    public void decreasedepth(){

        System.out.println("this method decreases depth after each drill action call");
    /*
    if(depth!=0)
    {
        System.out.println("Decreasing the depth of the the current Asteroid!");
        depth--;
    }
    else{
        System.out.println("Cannot decrease depth any further. It's time to mine!");
    }*/
    }

    /**
     * This function is called when the game starts to add random resource types to the asteroids.
     */
    public  void  addresource()
    {
/*
randomly passing resources to each asteroid

 */

        System.out.println("this method adds resources");
    }
    // was called changeToHollow() in the class diagram

    /**
     * This function changes the asteroid into a hollow one after it becomes fully mined.
     */
    public void makeEmpty()
    {
        this.resources=null;
        this.depth=0;
        this.isHollow=true;
        this.isRadioactive=false;

    }

    /**
     * This function checks if depth of drilled is equal to the asteroid depth
     * so then the asteroid can change to hollow.
     */
    public void fullyMined()
    {
        System.out.println("this method shows when depth is 0");
    }


    /**
     *
     * @return random boolean value
     */
    public boolean checkPrehilion()
    {
        return new Random().nextBoolean();
    }

    /**
     * This function is going to be overridden every time the location the setller changes.
     * @return null
     */
    @Override
    public IPlace getNeighbour() {
        System.out.println("This is getNeighbour of Asteroid - IPlace");
        return null;
    }

    /**
     * This function adds the neighbor of the gate.
     */
    @Override
    public void addNeighbour() {
        System.out.println("This is addNeighbour of Asteroid - IPlace");
    }

    /**
     * This function removes the neighbor of the gate and gets overridden everytime this needs to be happened.
     */
    @Override
    public void deleteNeighbour() {
        System.out.println("This is deleteNeighbour of Asteroid - IPlace");
    }

    /**
     * connects a settler or a robot to a gate or an asteroid
     */
    @Override
    public void addTraveller() {
        System.out.println("This is addTraveller of Asteroid - IPlace");
    }
}
