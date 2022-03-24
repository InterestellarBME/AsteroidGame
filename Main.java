import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int input;
        System.out.println("Welcome to Asteroid Minning by team Interstellar. This is main() of the function");
        System.out.println("Enter the number of asteroids to create at the start of the game: ");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        input = Integer.parseInt(reader.readLine());
        Game game = new Game();
        game.Start(input);

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
}}
