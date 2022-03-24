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

    }
}
