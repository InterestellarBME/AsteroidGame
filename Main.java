import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import junit.framework.*;

public class Main {
    public static Game game;
    public static Settler settler;
    public static void main(String[] args) throws IOException {
        int input;
        System.out.println("Welcome to Asteroid Minning by team Interstellar. This is main() of the function. The goal of \n" +
                "the program is showing that all methods can be reached in different scenarios. Hypothetical scenarios will be suggested \n" +
                "on the screen. Throughout each scenario, each method called will print its name on screen.");
        System.out.println("Enter the number of asteroids to create at the start of the game: ");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        input = Integer.parseInt(reader.readLine());
        game = new Game();
        game.Start(input);


        // sun storm scenario
        Sun sun = new Sun();
        settler = new Settler();
        System.out.println("Do you want to generate sun storm?\n 1:Yes \n 2:No\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==1)
        {
            sun.makeSunStorm();
            for (int i=0; i<game.asteroidBelt.size(); i++)
            {
                if (game.asteroidBelt.get(i).isHollow==true)
                {
                    System.out.println("Asteroid " + i + " is hollow. Do you want to hide?\n 1:Yes \n 2:No\n");
                    Scanner sc2 = new Scanner(System.in);
                    int x = sc2.nextInt();
                    if (x==1)
                    {
                        settler.hide(game.asteroidBelt.get(i));
                        break;
                    }
                    else
                    {
                        sun.removeAsteroid(game.asteroidBelt.get(i));
                        settler.hitByBlast();
                        settler.die();
                        game.RemoveTraveller(settler);
                        game.End();
                        break;
                    }
                }
            }


    }
        // drop mine drill and move scenario
        for(int i = 0 ; i <  game.asteroidBelt.size(); i++)
        {
            if(game.asteroidBelt.get(i).isHollow == true)
                continue;
            System.out.println("You are now on asteroid number " + i + " Do you want to drill this asteroid or not?\n 1:Yes \n 2:No\n");
            Scanner sc2 = new Scanner(System.in);
            int x = sc2.nextInt();
            // drill + decrease depth + all the mantle was drilled (fullymined()) + getAsteoid
            if(x == 1)
            {
                settler.getAsteroid(new Asteroid());
                settler.drill();
                game.asteroidBelt.get(i).decreasedepth();
                game.asteroidBelt.get(i).fullyMined();
                // making explosion if uranium and prehilion
                // explosion happens
                if (game.asteroidBelt.get(i).getResourceName() == "Uranium" && game.asteroidBelt.get(i).checkPrehilion() == true)
                {
                    game.asteroidBelt.get(i).resources.reactWithSun(new Asteroid());
                    sun.removeAsteroid(new Asteroid());
                    settler.die();
                }
                System.out.println("Do you want to pick up this resource: "+ game.asteroidBelt.get(i).getResourceName() + "\n 1:Yes \n 2:No\n");
                int y = sc2.nextInt();
                // mine and change to hollow
                if(y == 1)
                {
                    settler.mine();
                    game.asteroidBelt.get(i).makeEmpty();
                }
                // no: ask if you want to go to next asteroid
                System.out.println("Do you want to move to the next asteorid?\n 1:Yes \n 2:No\n");
                y = sc2.nextInt();
                // moving to a new asteroid
                if(y == 1)
                {
                    settler.move();
                    settler.setAsteroid(new Asteroid());
                    if(new Random().nextBoolean())
                    {
                        boolean b = new Random().nextBoolean();
                        if(b)
                        {
                            buildingGate();
                        }
                        if(!b)
                        {
                            buildingRobot();
                        }
                    }
                    continue;
                }
                if(y == 2)
                {
                    // loop to decide whether to mine or to move to the next asteroid
                    // the other option is to end the game
                    game.End();
                    return;
                }
            }
        }
        System.out.println("You finished all the asteroids on the belt. Do you want to drop a resource?\n 1:Yes \n 2:No\n");
        input = sc.nextInt();
        if(input == 1) {
            settler.getAsteroid(new Asteroid());
            settler.drop(new Carbon());
            //game.asteroidBelt.get(game.asteroidBelt.size()).addresource();
            game.asteroidBelt.get(game.asteroidBelt.size() - 1).addresource();
        }
        if(new Random().nextBoolean())
        {
            buildingSpaceStation();
        }


        // scenario that includes building robots and gates


    }

    /**
     * deploys the two gates and assign them as a pair
     * @throws IOException in case that the BufferedReader didn't read the input stream
     */
    public static void buildingGate() throws IOException {
        if(new Random().nextBoolean())
        {
            System.out.println("Do you want to build a gate?\n 1:Yes \n 2:No\n");
            if(new Random().nextBoolean())
            {
                System.out.println("You don't have enough resources for building a gate");
                return;
            }
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            int input = Integer.parseInt(reader.readLine());
            if(input == 1)
            {
                settler.buildTeleportationGates();
                Gate g = new Gate();
                g.setPairGate(new Gate());
            }
        }
    }

    /**
     * This function checks the resources necessary to build the robot
     * if the required resources are obtained, robot is built and added to the game
     * @throws IOException in case that the BufferedReader didn't read the input stream
     */
    public static void buildingRobot() throws IOException {
        if(new Random().nextBoolean())
        {
            System.out.println("Do you want to build a Robot?\n 1:Yes \n 2:No\n");
            if(new Random().nextBoolean())
            {
                System.out.println("You don't have enough resources for building a robot");
                return;
            }
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            int input = Integer.parseInt(reader.readLine());
            if(input == 1)
            {
                settler.buildRobot();
            }
        }
    }

    /**
     * This function Check if the settler wants to build space station and the necessary resources
     * if the settler has enough resources and decides to build the station, the game ends
     * @throws IOException in case that the BufferedReader doesn't read the input stream
     */
    public static void buildingSpaceStation() throws IOException {
        if(new Random().nextBoolean())
        {
            System.out.println("Do you want to build a space station?\n 1:Yes \n 2:No\n");
            if(new Random().nextBoolean())
            {
                System.out.println("You don't have enough resources for building a space station");
                return;
            }
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            int input = Integer.parseInt(reader.readLine());
            if(input == 1)
            {
                settler.buildSpaceStation(new Asteroid());
                game.End();
            }
        }
    }

}

