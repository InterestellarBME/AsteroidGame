import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static Game game;
    public static Settler settler;
    public static void main(String[] args){
        int input;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        game = new Game();
        game.Start(9);
        System.out.println("Hello");
    }
}

