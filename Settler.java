
import java.util.ArrayList;
import java.util.List;

public class Settler extends Traveller{
    public boolean anotehrGate;
    public Asteroid currentAsteroidId;
    public List<Resources> minedResources = new ArrayList<Resources>();      // 0 - 10

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
     * resource To Drop the type of resource that the settler wants to drop
     * ex: Uranium, Iron, Carbon, etc..
     */
    public void drop(Asteroid a)
    {
        a.resourceOfAsteroid.clear();
        a.isHollow=true;
        if(a.isHollow){
            a.resourceOfAsteroid.add(this.minedResources.get(0));
            this.minedResources.remove(0);
            a.isHollow=false;
        }
        // this method removes the item passed as parameter from the list of mined resources
    }

    public void addResources(Resources res){
        minedResources.add(res);
    }
    public boolean buildRobot()
    {
        boolean built = false;
        // checking if the settler has enough resources
        int u =0; int ir = 0; int c = 0;
        for (int i =0; i < minedResources.size(); i++)
        {
            if(minedResources.get(i).getResourcesName().equals("Carbon")) c++;
            if(minedResources.get(i).getResourcesName().equals("Uranium")) u++;
            if(minedResources.get(i).getResourcesName().equals("Iron")) ir++;
        }
        // not having enough resources case
        if(c < 1 || u < 1 || ir < 1)
            return built;
        c = 1; ir = 1; u = 1;
        // removing the resources that will be used to build
        for(int i = 0; i < minedResources.size(); i++)
        {
            if(c == 1){
                if(minedResources.get(i).getResourcesName().equals("Carbon")) {
                    c--;
                    minedResources.remove(i);
                }
            }
            if(u == 1) {
                if (minedResources.get(i).getResourcesName().equals("Uranium")) {
                    u--;
                    minedResources.remove(i);
                }
            }
            if (ir == 1){
                if(minedResources.get(i).getResourcesName().equals("Iron")) {
                    ir--;
                    minedResources.remove(i);
                }
            }
        }
        // building the new robot
        Robot r = new Robot();
        // adding the new robot to the game
        Game.travellers.add(r);
        built = true;
        return  built;

    }
    public boolean buildTeleportationGates()
    {
        boolean built = false;
        // checking if the settler has enough resources
        // we need 2 w 1 ir 1 u
        int u =0; int ir = 0; int w = 0;
        for (int i =0; i < minedResources.size(); i++)
        {
            if(minedResources.get(i).getResourcesName().equals("waterice")) w++;
            if(minedResources.get(i).getResourcesName().equals("Uranium")) u++;
            if(minedResources.get(i).getResourcesName().equals("Iron")) ir++;
        }
        // not having enough resources case
        if(w < 2 || u < 1 || ir < 1)
            return built;
        w = 2; ir = 1; u = 1;
        // removing the resources that will be used to build
        for(int i = 0; i < minedResources.size(); i++)
        {
            if(w > 0){
                if(minedResources.get(i).getResourcesName().equals("waterice")) {
                    w--;
                    minedResources.remove(i);
                }
            }
            if(u == 1) {
                if (minedResources.get(i).getResourcesName().equals("Uranium")) {
                    u--;
                    minedResources.remove(i);
                }
            }
            if (ir == 1){
                if(minedResources.get(i).getResourcesName().equals("Iron")) {
                    ir--;
                    minedResources.remove(i);
                }
            }
        }
        // building the new robot
        Gate g1 = new Gate(this.currentAsteroid);
        Gate g2 = new Gate(this.currentAsteroid);
        // setting the new gates
        g1.setPairGate(g2);
        g2.setPairGate(g1);
        // adding the new robot to the game
        built = true;
        return  built;
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
        if(this.lives <= 0)
        Game.End();
    }

    /**
     * This function adds the extracted resource to the resources list
     */
    public void mine()
    {
        System.out.println("This is mine() of Settler");
    }


}
