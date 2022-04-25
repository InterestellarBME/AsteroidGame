import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;


public class Main {
    public static Game game;
    public static Settler settler;
    public static Asteroid asteroid;
    public static ArrayList<Asteroid> AsteroidBelt;

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting tests.");
        if (test1Start()) System.out.println("Test 1: Start is successful");
        if (test2Mine()) System.out.println("Test 2: Mine is successful");
        if (test3BuildRobot()) System.out.println("Test 3: Build Robot is successful");
        if (test4BuildGate()) System.out.println("Test 4: Building teleportationg gates is successful");
        if (test5BuildStation()) System.out.println("Test 5: Building space station is executed successful");
        if (test6SunStorm()) System.out.println("Test 6: sunstorm generted succesfully");
        if (test7SunStormAndSettlerUseGate()) System.out.println("Test 7: sunstorm generted with player move is succesful");
        if (test8SunStormDamagesSettler()) System.out.println("Test 8: sunstorm generted succesfully and the player lost a life is successful");
        if (test9AsteroidExplosion()) System.out.println("Test 9: asteroid exploded after sunstorm is successful");
        if (test10DropResourceOnHollow()) System.out.println("Test 10: drop resource on a hollow asteroid is successful");
        if(test11HidingInAsteroid()) System.out.println("Test 11: hiding in a hollow asteroid is successful");
        if(test12Die()) System.out.println("test 12: die is successful");
        if(test13SpecialCase()) System.out.println("Test 13: the scenario from instructions was executed successfully");
    }

    public static boolean test1Start() throws IOException {
        boolean result = false;
        try {
            System.out.println("Do You Want To Do TestCase1?:: Y/N");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String ans = reader.readLine();
            if(ans.equals("N") || ans.equals("n"))
                return result;
            System.out.println("Enter how many asteroids to create: ");
            int input;
            input = Integer.parseInt(reader.readLine());
            game = new Game();
            game.Start(input);
            System.out.println(input + " asteroids created");
            Settler player = new Settler();
            game.AddTraveller(player);
            System.out.println("A player is created and added to the game");
        } catch (Exception e) {
            return result;
        }
        result = true;
        return result;
    }

    public static boolean test2Mine() throws IOException {
        boolean result1 = false;
        try {
            // checking if the tester wants to run this test case now
            System.out.println("Do You Want To Do TestCase2?:: Y/N");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String ans = reader.readLine();
            if(ans.equals("N") || ans.equals("n"))
                return result1;;


            int depth = game.asteroidBelt.get(0).getDepth();
            System.out.println(depth);

            for (int i = 0; i < depth; i++) {
                // settler.drill();
                game.asteroidBelt.get(0).decreasedepth();
                System.out.println(game.asteroidBelt.get(0).getDepth());
            }
            if (game.asteroidBelt.get(0).getDepth() == 0) {
                Resources res = game.asteroidBelt.get(0).getResourceOfAsteroid().get(0);
                System.out.println(res.resourceName);
                //settler.minedResources.add(res);
                System.out.println("Asteroid Mined");
                //player.mine();
            }
            System.out.println("A player Drilled and Mined");
        } catch (Exception e) {
            return result1;
        }
        result1 = true;
        return result1;
    }

    public  static  boolean test3BuildRobot()
    {
        boolean result = false;
        try{
            // checking if the tester wants to run this test case now
            System.out.println("Do You Want To Do TestCase3?:: Y/N");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String ans = reader.readLine();
            if(ans.equals("N") || ans.equals("n"))
                return result;
            System.out.println("Do you want to let the player have enough resources?:: Y/N");
            ans = reader.readLine();
            Settler s = new Settler();
            if (ans.equals("Y") || ans.equals("y"))
            {
                s.addResources(new Iron());
                s.addResources(new Carbon());
                s.addResources(new Uranium());
            }
            else
            {
                s.addResources(new WaterIce());
            }
            if(s.buildRobot())
            {
                result = true;
                System.out.println("Robot is built");
            }
            else
            {
                System.out.println("Building robot failed because player doesn't have enough resources");
            }
        }catch (Exception e)
        {
            return  result;
        }
        return result;
    }
    public  static  boolean test4BuildGate()
    {
        boolean result = false;
        try{
            // checking if the tester wants to run this test case now
            System.out.println("Do You Want To Do TestCase4?:: Y/N");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String ans = reader.readLine();
            if(ans.equals("N") || ans.equals("n"))
                return result;
            System.out.println("Do you want to let the player have enough resources?:: Y/N");
            ans = reader.readLine();
            Settler s = new Settler();
            if (ans.equals("Y") || ans.equals("y"))
            {
                s.addResources(new Iron());
                s.addResources(new Uranium());
                s.addResources(new WaterIce());
                s.addResources(new WaterIce());
            }
            else
            {
                s.addResources(new WaterIce());
                s.addResources(new Iron());
                s.addResources(new Uranium());
            }
            if(s.buildTeleportationGates())
            {
                result = true;
            }
            else
            {
                System.out.println("Building teleportation gates failed because player doesn't have enough resources");
            }
        }catch (Exception e)
        {
            return  result;
        }
        return result;
    }
    public static boolean test5BuildStation() throws IOException {
        boolean result2 = false;
        String ans;
        try {
            // checking if the tester wants to run this test case now
            System.out.println("Do You Want To Do TestCase5?:: Y/N");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ans = reader.readLine();
            if(ans.equals("N") || ans.equals("n"))
                return result2;

            System.out.println("Testing SpaceStation Building");
            System.out.println("In order to make space station You need to check Mined Resources , Continue?:: Y/N");

                    Settler set1 = new Settler();
                    set1.addResources(new Carbon());
                    set1.addResources(new Uranium());
                    set1.addResources(new Iron());
                    set1.addResources(new WaterIce());
                    set1.addResources(new Carbon());
                    for (int i = 0; i < set1.minedResources.size(); i++) {
                        System.out.println("You Have" + "  " + set1.minedResources.get(i).resourceName);
                    }
            System.out.println("Following Materials are Missing to Build" + "\n1Unit of Uranim" + "\n1Unit of Iron");
        } catch (Exception e) {
            return result2;
        }
        result2 = true;
        return result2;
    }
    public static boolean test6SunStorm() throws IOException, InterruptedException {

        boolean result6 = false;
        try {
            System.out.println("Do You Want To Do TestCase6?:: Y/N");
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
            String ans = reader2.readLine();
            if(ans.equals("N") || ans.equals("n"))
                return result6;
            System.out.println("Testing Generating sunstorm\nIn order to Generate sunstorm press Y?:: Y/N");
            reader2.readLine();
            Sun sun = new Sun();
            sun.generateSunStorm();
            System.out.println("Sunstorm Generated succesfully");
        }catch (Exception e){
            return result6;
        }

        result6=true;
        return result6;

    }

    public  static boolean test7SunStormAndSettlerUseGate()
    {
        boolean result = false;
        try{
            // checking if the tester wants to run this test case now
            System.out.println("Do You Want To Do TestCase7?:: Y/N");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String ans = reader.readLine();
            if(ans.equals("N") || ans.equals("n"))
                return result;
            // creating a sun
            Sun s = new Sun();
            Settler settler = new Settler();
            // generating sun storm
            s.generateSunStorm();
            s.applyToSettler(settler);
            // teleporting
        }catch (Exception e)
        {
            return result;
        }
        result = true;
        return  result;
    }

    public  static boolean test8SunStormDamagesSettler()
    {
        boolean result = false;
        try{
            // checking if the tester wants to run this test case now
            System.out.println("Do You Want To Do TestCase8?:: Y/N");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String ans = reader.readLine();
            if(ans.equals("N") || ans.equals("n"))
                return result;
            // creating a sun
            Sun s = new Sun();
            Settler settler = new Settler();
            // generating sun storm
            s.generateSunStorm();
            s.applyToSettler(settler);
        }catch (Exception e)
        {
            return result;
        }
        result = true;
        return  result;
    }
    public static boolean test9AsteroidExplosion() throws IOException{
        boolean result9 = false;
        try {
            System.out.println("Do You Want To Do TestCase9?:: Y/N");
            BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
            String ans = reader4.readLine();
            if(ans.equals("N") || ans.equals("n"))
                return result9;
            System.out.println("Testing Generating sunstorm\nEffecting on settler\nIn order to test press Y?:: Y/N");
            Settler set2 = new Settler();
            set2.lives = 5;
            set2.checkHide=false;
            Sun sun1 = new Sun();
            sun1.applyToSettler(set2);
        }catch (Exception e){
            return result9;
        }
        result9=true;
        return result9;

    }
    public static boolean test10DropResourceOnHollow() throws IOException{
        boolean result10 = false;
        try{
            System.out.println("Do You Want To Do TestCase10?:: Y/N");
            BufferedReader reader5 = new BufferedReader(new InputStreamReader(System.in));
            String ans = reader5.readLine();
            if(ans.equals("N") || ans.equals("n"))
                return result10;
            System.out.println("Testing drop resources of asteroid\nIn order to test press Y?:: Y/N");
            Settler setl4 = new Settler();
            setl4.minedResources.add(new Carbon());
            setl4.minedResources.add(new Uranium());
            System.out.println("Below you can see resources of settler\n" +
                    "============================");
            System.out.println(setl4.minedResources.get(0).resourceName);
            System.out.println(setl4.minedResources.get(1).resourceName);

            Asteroid a = new Asteroid(5);
            System.out.println("Below you can see resource in asteroid\n" +
                    "============================");
            System.out.println(a.resourceOfAsteroid.get(0).resourceName);
            setl4.drop(a);
            System.out.println("Resources of Asteroid    " + a.resourceOfAsteroid.get(0).resourceName);
            System.out.println("Resources of settler     "+ setl4.minedResources.get(0).resourceName);


        }catch (Exception e){
            return result10;
        }
        result10=true;
        return result10;
    }

    // settler tries to find a hollow asteroid to hide in
    public static boolean test11HidingInAsteroid()
    {
        boolean result = false;
        try{
            // checking if the tester wants to run this test case now
            System.out.println("Do You Want To Do TestCase11?:: Y/N");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String ans = reader.readLine();
            if(ans.equals("N") || ans.equals("n"))
                return result;

            System.out.println("Do you want to include a hollow asteroid?:: Y/N");
            ans = reader.readLine();
            if(ans.equals("Y") || ans.equals("y"))
            {
                for(int i =0; i < 5; i++)
                {
                    Game.asteroidBelt.add(new Asteroid(1));
                }
                Game.asteroidBelt.get(3).isHollow = true;
            }
            else if(ans.equals("N") || ans.equals("n"))
            {
                for(int i =0; i < 5; i++)
                {
                    Game.asteroidBelt.add(new Asteroid(1));
                }
            }
            Settler s = new Settler();
            boolean foundHollow = false;
            for(int i =0; i < Game.asteroidBelt.size(); i++) {
                s.hide(Game.asteroidBelt.get(i));
                if (Game.asteroidBelt.get(i).isHollow)
                {
                    System.out.println("Settler hiding in asteroid: " + i);
                    foundHollow = true;
                    break;
                }
            }
            if(!foundHollow)
                System.out.println("Settler couldn't hide because there is no hollow asteroid");

        }catch (Exception e)
        {
            return result;
        }
        result = true;
        return  result;
    }

    public static boolean test12Die()
    {
        boolean result = false;
        try{
            System.out.println("Do You Want To Do TestCase12?:: Y/N");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String ans = reader.readLine();
            if(ans.equals("N") || ans.equals("n"))
                return result;
            Settler s = new Settler();
            s.lives = 0;
            s.die();
        }catch (Exception e)
        {
            return  result;
        }
        result = true;
        return result;
    }
    public  static boolean test13SpecialCase()
    {
        boolean result = false;
        try{
            // checking if the tester wants to run this test case now
            System.out.println("Do You Want To Do TestCase13?:: Y/N");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String ans = reader.readLine();
            if(ans.equals("N") || ans.equals("n"))
                return result;

            // initialization
            Asteroid a1 = new Asteroid(3);
            Asteroid a2 = new Asteroid(2);
            Asteroid a3 = new Asteroid(1);
            for(int i =0; i < Game.asteroidBelt.size(); i++)
            {
                Game.asteroidBelt.remove(i);
            }
            Game.asteroidBelt.add(a1);
            Game.asteroidBelt.add(a2);
            Game.asteroidBelt.add(a3);
            Settler s = new Settler();
            s.currentAsteroid = a1;
            Gate g1 = new Gate(a1);
            Gate g2 = new Gate(a3);
            g1.setPairGate(g2);
            g2.setPairGate(g1);
            // g4 and g3 are a pair
            Gate g3 = new Gate(a2);
            Gate g4 = new Gate(s.currentAsteroid);      // first constructed with the current asteroid of the settler
                                                        // when deployed can change current asteroid to the new asteroid
            g3.setPairGate(g4);
            g4.setPairGate(g3);
            Robot r1 = new Robot();
            r1.currentAsteroid = a3;
            a3.isHollow = true;
            a1.setDepth(0);

            // controls
            s.mine();
            s.minedResources.add(new Uranium());
            s.move();
            s.drop(a3);
            a3.setAtPerihelion(true);
        }catch (Exception e)
        {
            return result;
        }
        result = true;
        return  result;
    }
}
