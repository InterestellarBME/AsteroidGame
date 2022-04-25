import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        if (test5BuildStation()) System.out.println("Test 5: Building space station  is successful\nor failed due to lack of resources");
        if (testStart6()) System.out.println("Test 6: sunstorm generted succesfully");
        if (testStart9()) System.out.println("Test 9: sunstorm Colide with settler");
        if (testStart10()) System.out.println("Test 9: drp resource on a hollow asteroid");
    }

    public static boolean test1Start() throws IOException {
        boolean result = false;
        try {
            System.out.println("Do You Want To Do TestCase1?:: Y/N");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String ans = reader.readLine();
            if (ans.equals("N"))
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
    public  static  boolean test3BuildRobot()
    {
        boolean result = false;
        try{
            // checking if the tester wants to run this test case now
            System.out.println("Do You Want To Do TestCase3?:: Y/N");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String ans = reader.readLine();
            if (ans.equals("N"))
                return result;


        }catch (Exception e)
        {

        }
        return result;
    }
    public static boolean test2Mine() throws IOException {
        boolean result1 = false;
        try {
            // checking if the tester wants to run this test case now
            System.out.println("Do You Want To Do TestCase2?:: Y/N");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String ans = reader.readLine();
            if (ans.equals("N"))
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

    public static boolean test5BuildStation() throws IOException {
        boolean result2 = false;
        String ans;
        try {
            // checking if the tester wants to run this test case now
            System.out.println("Do You Want To Do TestCase5?:: Y/N");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            ans = reader.readLine();
            if (ans.equals("N"))
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


        } catch (IOException e) {
            return result2;
        }
        result2 = true;
        return result2;
    }
    public static boolean testStart6() throws IOException, InterruptedException {

        boolean result6 = false;
        try {
            System.out.println("Do You Want To Do TestCase6?:: Y/N");
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
            reader2.readLine();
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

    public static boolean testStart9() throws IOException{
        boolean result9 = false;
        try {
            System.out.println("Do You Want To Do TestCase9?:: Y/N");
            BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
            reader4.readLine();
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
    public static boolean testStart10() throws IOException{
        boolean result10 = false;
        try{
            System.out.println("Do You Want To Do TestCase10?:: Y/N");
            BufferedReader reader5 = new BufferedReader(new InputStreamReader(System.in));
            reader5.readLine();
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
}
