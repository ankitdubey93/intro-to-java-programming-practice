import java.util.*;
public class Guessinggame {
public static Scanner input = new Scanner(System.in);

public static void main(String [] args) {



    System.out.println("Think of a number between 0 and 100.inclusive");
    System.out.println("I will try to guess the number");
    int guess = guessNumber();

}


public static int guessNumber() {
    int low = 0;
    int high = 100;
    int guess = 50;
    String answer;
    int numGuesses = 0;

    do {
        System.out.println("Is your number" + guess + "? (h/l/e)" );
        answer = input.nextLine().toLowerCase();
        if (answer.equals("h")) {
           low = guess + 1;
           guess = (low + high)/2;

        }
        else if (answer.equals("l")) {
                high = guess - 1;
                guess = (low + high)/2;
            }

        numGuesses++;

    } while (!answer.equals("e"));

    System.out.println("I guessed your number in " + numGuesses + " guesses!");
    return guess;
}

}
