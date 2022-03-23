public class Traveller {
    public boolean checkHide;
    public int lives;
    public void drill()
    {
        System.out.println("This is drill() of Traveller");
    }
    public void move()
    {
        System.out.println("This is move() of Traveller");
    }
    public void hide(Asteroid a)
    {
        System.out.println("This is hide() of Traveller");
    }
    public int hitByBlast()
    {
        System.out.println("This is hitByBlast() of Traveller");
        return 1;
    }
    public void die()
    {
        System.out.println("This is die() of Traveller");
    }
    public void setAsteroid(Asteroid a)
    {
        System.out.println("This is setAsteroid() of Traveller");
    }
    public Asteroid getAsteroid(Asteroid a)
    {
        System.out.println("This is getAsteroid() of Traveller");
        return a;
    }
}
