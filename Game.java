import java.lang.System;
import java.util.ArrayList;
import java.util.List;

public class Game
{

    public List<Asteroid> asteroidBelt = new ArrayList<Asteroid>();
    public boolean CheckWin;

    public void Start( int NoOfAsteroids)
    {
        System.out.println("This is Start() of Game");
        for(int i =0; i <NoOfAsteroids; i++)
        {
            asteroidBelt.add(new Asteroid());
        }

    }

    public void End()
    {
        System.out.println("This is End() of Game");
    }

    public Traveller RemoveTraveller( Traveller t)
    {
        System.out.println("This is RemoveTraveller() of Game");
        return null;
    }
    public Traveller AddTraveller (Traveller t)
    {
        System.out.println("This is AddTraveller() of Game");
        return null;
    }


}
