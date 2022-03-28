import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;


public class Gate {
    int id;
    public Gate()
    {
        System.out.println("This is Gate() of Gate");
    }

    /**
     * This function removes the gate from the game
     */
    public void disappear()
    {
        System.out.println("This is disappear() of Gate");
    }

    /**
     * This function sets the pair property of the gate
     * @param g the gate which to be paired eith the other gate.
     */
    public void setPairGate(Gate g)
    {
        System.out.println("This is setPairGate() of Gate");
    }

    /**
     * This function teleports the robot or the settler to the other pair of the gate.
     * @param t the traveller (robot or setller) which is going to be teleported.
     * @return randomly generated boolean value.
     */
    public boolean isTravellerOn(Traveller t)
    {
        System.out.println("This is isTravellerOn() of Gate");
        return new Random().nextBoolean();
    }
}
