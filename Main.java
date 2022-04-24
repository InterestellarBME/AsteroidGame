import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static Game game;
    public static Settler settler;
    public static void main(String[] args) throws IOException {
        int input;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Starting tests.\nTest 1: Start");
        if (testStart()) System.out.println("Test 1: Start is successful");

    }
    public static boolean testStart() throws IOException {
        boolean result = false;
        try {
            System.out.println("Enter how many asteroids to create: ");
            int input;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            input = Integer.parseInt(reader.readLine());
            game = new Game();
            game.Start(input);
            Settler player = new Settler();
            game.AddTraveller(player);
        }catch (Exception e)
        {
            return result;
        }
        result = true;
        return result;
    }
}

