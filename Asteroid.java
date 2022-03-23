import javax.swing.*;

import java.util.List;

import static java.lang.Math.random;

public class Asteroid {

    //resourcename represent of integers from 0 to 3
    public int resourceName;
    public int depth;
    public int number;
    public boolean isTeleportable;
    public boolean checkDrilled;
    public List<Resources> resourcelist;
    public Resources res;
    public  boolean checkRadioactive;




    public Asteroid(int reasourceName , int depth , int number)
    {
        this.resourceName=reasourceName;
        this.depth=depth;
        this.number=number;
    }

    public  int getDepth(){
        return  depth;

    }
    public int getNumber(){
        return number;
    }

    public int getResourceName(){
        return resourceName;
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
        System.out.println("this method changes asteroid to hollow");
    }
    public void fullyMined()
    {
        System.out.println("this method shows when depth is 0");
    }
}
