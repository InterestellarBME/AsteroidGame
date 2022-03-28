public class Traveller {
    public boolean checkHide;
    public int lives;
    public Asteroid currentAsteroid;

    /**
     * This function decreases one unit of the thickness of the mantel of
     * each asteroid it’s applied on
     */
    public void drill()
    {
        System.out.println("This is drill() of Traveller");
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
        System.out.println("This is hide() of Traveller");
    }

    /**
     *
     * @return 1 if the traveller was hit by blast otherwise 0
     */
    public int hitByBlast()
    {
        System.out.println("This is hitByBlast() of Traveller");
        return 1;
    }

    /**
     * this method will be overridden depending on th class implementing it
     * in case of settler, it will decrease the lives by 0
     * in case of robot, it will remove the robot from the game
     */
    public void die()
    {
        System.out.println("This is die() of Traveller");
    }


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

}
