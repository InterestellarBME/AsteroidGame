import java.util.Random;

public class Resources {
     protected String resourceName;
     public int number;         // carbon = 1, iron = 2, water = 3, uranium = 4


    public Resources(String resourceName)
    {
    this.resourceName=resourceName;
    }
    public String getResourcesName()
    {
        return this.resourceName;
    }
    public void setNumber()
    {
        this.number= new Random().nextInt(3)+1;
    }
    public int getNumber(){
        return this.number;
    }


}
