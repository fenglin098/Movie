import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> movie = new ArrayList<>();
        boolean answer = false;
        do{
            System.out.println("What is your favorite movie:");
            Scanner keyboard = new Scanner(System.in);
            String userInput=keyboard.next();
            movie.add(userInput);}
        while (answer==true);


    }
}
