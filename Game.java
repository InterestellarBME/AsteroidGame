import java.lang.System;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game
{

    public List<Asteroid> asteroidBelt = new ArrayList<Asteroid>();
    public boolean CheckWin;

    public void Start( int NoOfAsteroids)
    {
        System.out.println("This is Start() of Game");
        for(int i =0; i <NoOfAsteroids; i++)
        {
            asteroidBelt.add(new Asteroid(new Random().nextInt(3)+1));
           // System.out.println(asteroidBelt.get(i).getDepth());
           // System.out.println(asteroidBelt.get(i).getresourceName());
            System.out.println(asteroidBelt.get(i).isHollow);
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
    public void removeAsteroid(Asteroid a){
        asteroidBelt.remove(a);
    }


}
