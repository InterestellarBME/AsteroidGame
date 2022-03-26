import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;

public class Gate {
    int id;
    public Gate()
    {
        System.out.println("This is Gate() of Gate");
    }
    public void disappear()
    {
        System.out.println("This is disappear() of Gate");
    }
    public void setPairGate(Gate g)
    {
        System.out.println("This is setPairGate() of Gate");
    }
    public boolean isTravellerOn(Traveller t)
    {
        System.out.println("This is isTravellerOn() of Gate");
        return new Random().nextBoolean();
    }
}
