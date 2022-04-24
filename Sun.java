import java.util.Random;
import java.util.Timer;

public class Sun {
    private int efffectiveTime;
    Sun()
    {
        efffectiveTime = new Random().nextInt(5)+5;

    }

    /**
     * This function generates the sun storm.
     */
    public void generateSunStorm() throws InterruptedException {
        int countDown = efffectiveTime;
        Timer t = new Timer();
        for (int i =0;i<countDown;i++){
            t.wait(1000);
            countDown--;
            System.out.println("Remaining time of sunstorm"+ countDown);
        }
    }
    public void applyToSettler(Settler s){
        if(!s.checkHide){
            s.lives--;
            System.out.println("Settler new lives :"+s.lives);
            if(s.lives<=0){
                s.die();
            }
        }
    }
    public void applyToRobot(Robot r){
        if(!r.checkHide){
            r.lives--;
            System.out.println("Settler new lives :"+r.lives);
            if(r.lives<=0){
                r.die();
            }
        }
    }
    /**
     * This function removes the asteroid after it's exploded.
     * @param a the asteroid which to be removed.
     */
    public void removeasteroid(Asteroid a){
        if(a.isHollow && a.getResourceOfAsteroid().get(0) instanceof  Uranium){

            System.out.println("An Asteroid exploded.");
        }
    }

}
