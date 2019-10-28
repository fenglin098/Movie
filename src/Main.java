import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> movie = new ArrayList<>();
        boolean answer = true;
        do{
            System.out.println("Please enter your favorite movie, or enter q to quit.");
            Scanner keyboard = new Scanner(System.in);
            String userInput=keyboard.next().toLowerCase();
            if (userInput.equals("q")){
            answer=false;
            }else movie.add(userInput);
        } while (answer==true);
        Collections.sort(movie);
        System.out.println("My favorite movies are: "+movie);
        Random r = new Random();
        int rSelection=r.nextInt(movie.size());
        System.out.println("I recommend you to watch: "+movie.get(rSelection));
    }
}
