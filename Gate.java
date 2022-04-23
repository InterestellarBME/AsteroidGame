import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;

public class Gate {
    static int globalId = 0; // increase it with each id assignment
    int id;
    Asteroid currentAsteroid;

    // I made both int and Gate attributes because it might be easier to compare int
    // to check if two gates are the same or not
    int pairId;
    Gate pairGate;

    // IMPORTANT: the two gates must first be created then they can be setted as pairs
    public Gate(Asteroid a)
    {
        this.id = globalId;
        globalId++;
        this.currentAsteroid = a;
        a.gate = this;
    }

    /**
     * This function removes the gate from the game
     */
    // this function is no longer necessary
    /*public void disappear()
    {
        System.out.println("This is disappear() of Gate");
    }*/

    /**
     * This function sets the pair property of the gate
     * @param g the gate which to be paired eith the other gate.
     */
    public void setPairGate(Gate g)
    {
        this.pairGate = g;
        this.pairId = g.id;
        g.pairId = this.id;
    }

    /**
     * This function teleports the robot or the settler to the other pair of the gate.
     * @param t the traveller (robot or setller) which is going to be teleported.
     */
    public void travellerIsOn(Traveller t)
    {
        t.currentAsteroid = this.pairGate.currentAsteroid;
        t.move();
    }
}
