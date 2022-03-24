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
    public List<Resources> resourcelist;
    public  boolean isRadioactive;
    public Resources resources;
    public int random;
   // public Resources res;




    public Asteroid()
    {
       // this.res=resources;
        this.depth=new Random().nextInt(20);
        this.random=new Random().nextInt(3)+1;
        this.location=location;
        this.isTeleportable=false;
        this.checkDrilled=false;
        this.isHollow=false;
        this.isRadioactive=false;

        switch (random){
            case 1:
            {
                this.resources = new Carbon("Carbon");
                this.isHollow=false;
                this.isRadioactive=false;
            }

            break;

            case 2:
            {
                this.resources = new Iron("Iron");
                this.isHollow=false;
                this.isRadioactive=false;
            }
            break;
            case 3:
            {
                this.resources = new Uranium("Uranium");
                this.isHollow=false;
                this.isRadioactive=true;
            }
            break;
        }
    }


    public  int getDepth(){
        return  this.depth;

    }
    public int getLocation(){
        return this.location;
    }

    public String getResourceName(){
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
    public void changeToHollow()
    {
        this.resourcelist.remove(0);
        this.isHollow=true;

    }
    public void fullyMined()
    {
        System.out.println("this method shows when depth is 0");
    }


}
