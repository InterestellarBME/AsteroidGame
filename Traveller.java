abstract public class Traveller {
    public boolean checkHide;
    public int lives;
    int id;
    public Asteroid currentAsteroid;
public void setId(int id)
{
    this.id=id;
}
public int getId()
{
    return id;
}
/**
     * This function decreases one unit of the thickness of the mantel of
     * each asteroid it’s applied on
     */
    public void drill()
    {
        currentAsteroid.decreasedepth();
    }

    /** This function moves the object to a neighboring
     field. Each field is surrounded by nine other fields.
     *
     */

    public void move()
    {

        System.out.println("This is move() of Traveller");
    }

    /**This function is executed when a robot or a settler wants to hide in a hollow asteroid
     *
     * @param a the asteroid which the traveller wants to hide inside it
     */
    public void hide(Asteroid a)
    {
        if(a.getHollow())
            this.checkHide=true;
    }

    /**
     *
     * @return 1 if the traveller was hit by blast otherwise 0
     */
    public int hitByBlast()
    {
        if(currentAsteroid.getExploded() && !checkHide)
             return 1;
        else
            return 0;
    }

    /**
     * this method will be overridden depending on th class implementing it
     * in case of settler, it will decrease the lives by 0
     * in case of robot, it will remove the robot from the game
     */
    abstract public void die();

    public void setAsteroid(Asteroid a)
    {
        System.out.println("This is setAsteroid() of Traveller");
    }

    /**
     *
     * @param a asteroid
     * @return  the asteroid the traveller is on
     */

    public Asteroid getAsteroid(Asteroid a)
    {
        System.out.println("This is getAsteroid() of Traveller");
        return a;
    }

    public boolean checkHide() {
        return checkHide;
    }
}
