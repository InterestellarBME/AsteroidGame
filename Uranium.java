public class Uranium extends Resources
{
    public Uranium()
    {
        super("Uranium");
        // for the skeleton test
        System.out.println("This Uranium() of Uranium");
    }
    public void setNumber()
    {
        this.number=3;
    }

    /**
     * This function removes asteroid from the game after exploding
     * @param a the asteroid to be exploded and removed
     */
    public void exploide(Asteroid a){
        Sun s = new Sun();
       // s.reactWithSun(1);
      //  a.setExploded(true);

    }
}
