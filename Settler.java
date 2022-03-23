import java.*;
import java.util.List;

public class Settler {
    public boolean anotehrGate;
    public List<Resources> minedResources;      // 0 - 10

    public Resources mine()
    {
        System.out.println("This is mine() of Settler");
        // this needs to be connected to asteroid to get the
        // resource from inside of it and return it to the list of minedResources
        Resources r = new Resources();
        return r;
    }
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
    public void dropGate(Gate gateToDrop)
    {
        System.out.println("This is dropGate(Gate gateToDrop) of Settler");
    }
    public void buildSpaceStation(Asteroid a)
    {
        System.out.println("This is buildSpaceStation(Asteroid a) of Settler");
    }
    public void die()
    {
        System.out.println("This is die() of Settler");
    }
}
