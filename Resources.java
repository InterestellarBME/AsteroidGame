public class Resources {
    String Name; //an attribute for the name of the resource
    public Resources (){}
    public Resources(String name)
    {
        this.Name = name;
    }

    public String getResourceName()
    {
        //nm
        System.out.println("This is getResourceName() of Resources");
        return Name;
    }

    public Asteroid reactWithSun(Asteroid a){
        System.out.println("This is reactWithSun() of Resources");

        return a;
    }

}

