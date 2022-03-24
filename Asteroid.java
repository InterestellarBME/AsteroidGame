import javax.swing.*;

import java.util.List;
import java.util.Random;

import static java.lang.Math.random;

public class Asteroid {

    //resourcename represent of integers from 0 to 3

    public int depth;
    public int location;
    public boolean isTeleportable;
    public boolean checkDrilled;
    public boolean isHollow;
    public  boolean isRadioactive;
    public Resources resources;
    public int random;
   // public Resources res;




    public Asteroid()
    {
        System.out.println("This is Asteroid() of Asteroid");
       // this.res=resources;
        this.depth=new Random().nextInt(20)+7;
        this.location=location;
        this.isTeleportable=false;
        this.checkDrilled=false;
        // 0: hollow, 1: has resources
        int ran = new Random().nextInt(2);
        if (ran == 1)
        this.isHollow=false;
        else {
            this.isHollow = true;
            return;
        }
        this.isRadioactive=false;
        if(isHollow == false)
        resources =  Asteroid.addResources();
        switch (resources.getNumber()){
            case 1:
            {
                this.isHollow=false;
                this.isRadioactive=false;
            }
            break;
            case 2:
            {
                this.isHollow=false;
                this.isRadioactive=false;
            }
            break;
            case 3:
            {
                this.isHollow=false;
                this.isRadioactive=true;
            }
            break;
        }
        // calls for the skeleton test
        this.getDepth();
    }
    public static Resources addResources()
    {
        System.out.println("This is addResource() of Asteroid");
        int random=new Random().nextInt(3)+1;
        switch (random)
        {
            case 1:
            {
                return new Carbon();
            }
            case 2:
            {
                return new Iron();
            }
            case 3: {
                return new Uranium();
            }
            default: return null;
        }
    }

    public  int getDepth(){
        System.out.println("This is getDepth() of Asteroid");
        return  this.depth;

    }
    public int getLocation(){
        return this.location;
    }

    public String getResourceName(){
        System.out.println("This is getResourceName() of Asteroid");
       return resources.getResourcesName();
    }

    public void decreasedepth(){

        System.out.println("this method decreases depth after each drill action call");
    /*
    if(depth!=0)
    {
        System.out.println("Decreasing the depth of the the current Asteroid!");
        depth--;
    }
    else{
        System.out.println("Cannot decrease depth any further. It's time to mine!");
    }*/
    }
    public  void  addresource()
    {
/*
randomly passing resources to each asteroid

 */

        System.out.println("this method adds resources");
    }
    public void makeEmpty()
    {
        this.resources=null;
        this.depth=0;
        this.isHollow=true;
        this.isRadioactive=false;

    }
    public void fullyMined()
    {
        System.out.println("this method shows when depth is 0");
    }


}
