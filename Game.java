import java.lang.System;
import java.util.ArrayList;
import java.util.List;

public class Game {

    public static List<Asteroid> asteroidBelt = new ArrayList<Asteroid>();
    public static List<Traveller> travellers = new ArrayList<Traveller>();
    public boolean CheckWin;

    public void Start(int NoOfAsteroids) {
        for (int i = 0; i < NoOfAsteroids; i++) {
            asteroidBelt.add(new Asteroid(1));
        }
    }

    public static void End() {
        System.out.println("Game is over");
    }

    public Traveller RemoveTraveller(Traveller t) {
        int i = 0;
        for (; i < travellers.size(); i++) {
            if (t.id == travellers.get(i).id)
                break;
        }
        travellers.remove(i);
        return t;
    }

    public Traveller AddTraveller(Traveller t) {
        travellers.add(t);
        return t;
    }
}
