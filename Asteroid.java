import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Asteroid {

    
 
    private int Depth;
    private String name;
    public Gate gate;
    private ArrayList<Settler> settlersOnAsteroid;
    private ArrayList<Robot> robotsOnAsteroid;
    private ArrayList<Resources> resourceOfAsteroid;
    private ArrayList<Resources> storedResourceOfAsteroid;
    private Boolean isAtPerihelion;
    public Boolean isHollow;
    private Boolean isRadioactive;
    private Boolean hasGate;
    private Boolean isExploded;

    //</editor-fold>


    //<editor-fold desc="Constructor">


    public Asteroid(int rnd) {
       
       this.isHollow = false;
        this.Depth = new Random().nextInt(10)+7; // random number 0=<Depth<10
        this.isAtPerihelion = false;
        this.resourceOfAsteroid = new ArrayList<>();

        switch (rnd) { // switch case to determine which resource is assigned
            case 1: { // Assigns Carbon to this Asteroid
                this.resourceOfAsteroid.add(new Carbon());
                this.isHollow = false;
                this.isRadioactive = false;
            } break;
            case 2: { // Assigns Iron to this Asteroid
                this.resourceOfAsteroid.add(new Iron());
                this.isHollow = false;
                this.isRadioactive = false;
            }break;
            case 3: { // Assigns Uranium to this Asteroid
                this.resourceOfAsteroid.add(new Uranium());
                this.isHollow = false;
                this.isRadioactive = true;
            }break;
            case 4: { // Assigns WaterIce to this Asteroid
                this.resourceOfAsteroid.add(new WaterIce());
                this.isHollow = false;
                this.isRadioactive = false;
            }break;
           
            
        }

        this.hasGate = false; // initialized as false.
        this.isExploded = false; // initialized as false.
        this.settlersOnAsteroid = new ArrayList<>();
        this.robotsOnAsteroid = new ArrayList<>();
        this.storedResourceOfAsteroid = new ArrayList<>();
    }


    public int getDepth() {
        return this.Depth;
    }


    public void decreasedepth() {

        this.Depth--;
    }


    public void fullyMined() {
        this.resourceOfAsteroid.clear(); // Removes the resource of this Asteroid.
        this.isHollow = true; // This Asteroid is hollow.
        this.isRadioactive = false; // A hollow Asteroid cannot be radioactive.
    }


    public void goToPrehilion(Boolean atPerihelion) {
        isAtPerihelion = atPerihelion;
        if(isAtPerihelion && isRadioactive && Depth == 0) // checks if the Resource is Uranium and if it has to explode
        {
            this.resourceOfAsteroid.get(0).explode(this);
        }
        if(isAtPerihelion && this.getResourceOfAsteroid().get(0) instanceof WaterIce) // checks if the resource is WaterIce and if it has to sublime
        {
            this.resourceOfAsteroid.get(0).sublime(this);
        }
    }

    public void hideTravellers() {
        for (Settler settler : settlersOnAsteroid ) {
            if(!settler.checkHide()) {
                settler.hide(this);
            }
        }
        for (Robot robot : robotsOnAsteroid ) {
            if(!robot.checkHide()) {
                robot.hide(this);
            }
        }
    }

    public Gate getGate() { return gate; }
    public void setGate(Gate gate) { this.gate = gate;  }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public void setDepth(int Depth) { this.Depth = Depth; }

    public Boolean getAtPerihelion() { return isAtPerihelion; }
    public void setAtPerihelion(Boolean atPerihelion) {
        isAtPerihelion = atPerihelion;
    }


    public Boolean getHollow() { return isHollow; }
    public void setHollow(Boolean hollow) {isHollow = hollow;}


    public Boolean getRadioactive() { return isRadioactive; }
    public void setRadioactive(Boolean radioactive) { isRadioactive = radioactive; }

    public Boolean getHasGate() { return hasGate; }
    public void setHasGate(Boolean hasGate) { this.hasGate = hasGate; }

    public List<Settler> getSettlersOnAsteroid() { return this.settlersOnAsteroid; }
    public void setSettlersOnAsteroid(Settler newSettler) { this.settlersOnAsteroid.add(newSettler); }

    public List<Robot> getRobotsOnAsteroid() { return this.robotsOnAsteroid; }
    public void setRobotsOnAsteroid(Robot newRobot) { this.robotsOnAsteroid.add(newRobot); }

    public List<Resources> getStoredResourceOfAsteroid() { return storedResourceOfAsteroid; }
    public void setStoredResourceOfAsteroid(Resources newResource) { this.storedResourceOfAsteroid.add(newResource); }

    public List<Resources> getResourceOfAsteroid() { return resourceOfAsteroid; }
    public void setResourceOfAsteroid(Resources res) {
        this.resourceOfAsteroid.clear();
        this.resourceOfAsteroid.add(res);
    }

    public Boolean getExploded() { return isExploded; }
    public void setExploded(Boolean exploded) { isExploded = exploded; }

}
