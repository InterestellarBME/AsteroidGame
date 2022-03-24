import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int input;
        System.out.println("Welcome to Asteroid Minning by team Interstellar. This is main() of the function. The goal of \n" +
                "the program is showing that all methods can be reached in different scenarios. Hypothetical scenarios will be suggested \n" +
                "on the screen. Throughout each scenario, each method called will print its name on screen.");
        System.out.println("Enter the number of asteroids to create at the start of the game: ");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        input = Integer.parseInt(reader.readLine());
        Game game = new Game();
        game.Start(input);


        // sun storm scenario
        Sun sun = new Sun();
        Settler settler = new Settler();
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
            if(x == 1)
            {
                settler.drill();
                System.out.println("Do you want to pick up this resource: "+ game.asteroidBelt.get(i).getResourceName() + "\n 1:Yes \n 2:No\n");
                int y = sc2.nextInt();
                if(y == 1)
                {
                    settler.mine();
                }
                // no: ask if you want to go to next asteroid
                System.out.println("Do you want to move to the next asteorid?\n 1:Yes \n 2:No\n");
                y = sc2.nextInt();
                if(y == 1)
                {
                    settler.move();
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

}}
