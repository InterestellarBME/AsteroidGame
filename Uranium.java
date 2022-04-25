public class Uranium extends Resources
{
    public Uranium()
    {
        super("Uranium");
        // for the skeleton test
    }
    public void setNumber()
    {
        this.number=3;
    }

    public void explode(Asteroid A){
      //  Sun s = new Sun();

      //  a.setExploded(true);
        for (int i = 0; i < A.getSettlersOnAsteroid().size(); i++) {
            A.getSettlersOnAsteroid().get(i).die(); // All settler on the Asteroid die.
        }

        for(int i = 0; i < A.getRobotsOnAsteroid().size(); i++)

    {
        Robot r = A.getRobotsOnAsteroid().get(i);
        if (r.getDamage() == 100)
        {
            r.Damage(); // decreases the health by 50
            A.getRobotsOnAsteroid().get(i).move(); // Robot travels to a different Asteroid
        }
        else  // if the health is less than 100, that means it equals 50. So, Damage is called and the robot will die
        {
            r.Damage();
            r.die();
        }
    }
    }
}
