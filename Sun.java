public class Sun {
    Sun()
    {
        System.out.println("This is Sun() of Sun");
    }

    /**
     * This function generates the sun storm.
     */
    public void makeSunStorm()
    {
        System.out.println("This is makeSunStorm() of Sun");
        this.reactWithSun(2);
    }

    /**
     * This function removes the asteroid after it's exploded.
     * @param a the asteroid which to be removed.
     */
    public void removeAsteroid(Asteroid a)
    {
        System.out.println("This is removeAsteroid() of Sun");
    }
    public  void reactWithSun(int num)
    {
        switch (num)
        {
            case 1 :
            {
               System.out.println("An Asteroid exploded.");
            }
            case 2 :
                {
                System.out.println("sun strom happened");
                  }
        }
    }
}
