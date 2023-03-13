import java.util.*;
public class Diya {
    private static Scanner input = new Scanner(System.in);

    public static void main(String [] args) {

        String choice;
        String answer;
        String betterlucknexttime;



        System.out.println("I love you,Diya. Do you love me too?");
        choice = getChoice();
        if (choice.equals("YES") || choice.equals("yes")) {
            answer = ("You guys can make babies now");
            displayResult(answer);
        } else if (choice.equals("NO") || choice.equals("no")) {
            betterlucknexttime = ("Ankit will love you forever.");
            displayResult(betterlucknexttime);
        } else {
            System.out.println("You must enter either YES or NO, nothing else works");
        }
        }


    public static String getChoice() {
        String choice;

        System.out.println("Enter YES(yes) or NO(no)");
        choice = input.nextLine();
        return choice;
    }

    public static void displayResult(String answer) {
        System.out.println("You both love each other. Make babies now");
    }



}
