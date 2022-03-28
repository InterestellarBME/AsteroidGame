
import java.util.List;

public class Settler extends Traveller{
    public boolean anotehrGate;
    public int currentAsteroidId;
    public List<Resources> minedResources;      // 0 - 10

    //public Resources mine()
   // {
      //  System.out.println("This is mine() of Settler");
        // this needs to be connected to asteroid to get the
        // resource from inside of it and return it to the list of minedResources
       // Resources r = new Resources();
        //return r;
   // }

    /**
     *
     * @param resourceToDrop the type of resource that the settler wants to drop
     * ex: Uranium, Iron, Carbon, etc..
     */
    public void drop(Resources resourceToDrop)
    {
        System.out.println("This is drop(Resources resourceToDrop) of Settler");
        // this method removes the item passed as parameter from the list of mined resources
    }
    public void buildRobot()
    {
        System.out.println("This is buildRobot() of Settler");
    }
    public void buildTeleportationGates()
    {
        System.out.println("This is buildTeleportationGates() of Settler");
    }

    /**
     *This function drops the second gate in the current position of the player
     * the first called by BuildTeleportationGate()
     * @param gateToDrop object of gate to be dropped
     *
     */
    public void dropGate(Gate gateToDrop)
    {
        System.out.println("This is dropGate(Gate gateToDrop) of Settler");
    }

    /**
     *
     * @param a the asteroid where the space station will be built
     */
    public void buildSpaceStation(Asteroid a)
    {
        System.out.println("This is buildSpaceStation(Asteroid a) of Settler");
    }

    public void die()
    {
        System.out.println("This is die() of Settler");
    }

    /**
     * This function adds the extracted resource to the resources list
     */
    public void mine()
    {
        System.out.println("This is mine() of Settler");
    }


}
