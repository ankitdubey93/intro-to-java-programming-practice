import java.util.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class guessinggamearay {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Think of a number between 0 to 100 (inclusive).");
        int low = 0;
        int high = 100;
        int guess = 50;

        ArrayList<Integer> guesses = new ArrayList<Integer>();

        while(true) {
            System.out.println("Is your number higher (h), lower (l), or equal (e) to" + guess + " ?");
            String answer = input.nextLine().toLowerCase();

            if (answer.equals("h")) {
                low = guess +1;
                guess = (low + high)/2;
            }

            else if (answer.equals("l")) {
                high = guess - 1;
                guess = (low + high)/2;
            }
            else if (answer.equals("e")) {
                System.out.println("Your number is " + guess + "!");
                guesses.add(guess);
                break;
            }

            else {
                System.out.println("Invalid Input. Please enter 'h,l or e'.");
                continue;
            }

            guesses.add(guess);

        }

        System.out.println("Guesses: " + guesses);
    }
}
