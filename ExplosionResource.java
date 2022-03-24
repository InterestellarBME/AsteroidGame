import java.util.*;


public class ExplosionResource extends Resources{
int ClosenessToSun;
boolean ReactWithSun;
    public ExplosionResource(int ClosenessToSun,boolean ReactWithSun)
    {
        this.ClosenessToSun=ClosenessToSun;
        this.ReactWithSun=ReactWithSun;
    }
    public int getClosenessToSun() {
        return ClosenessToSun;
    }

    public void ExplodingResource()
    {
        if (this.getClosenessToSun()>=10)
        {
            Asteroid a = new Asteroid();
            a.RemoveAsteroid();
            System.out.println("This is a ExplosionResource class that extends from resources class");

        }
    }

}

