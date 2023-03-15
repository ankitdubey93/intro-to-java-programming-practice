import java.util.*;
public class howoldareyou {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double ageinyear;
        String selection;
        String monthsdayshourseconds;
       double result;


        ageinyear = getAgeinyears();
        selection = getSelection().toUpperCase();

        if (selection.equals("M"))
         {
             monthsdayshourseconds = getmonthsdayshoursseonds("Months");
            result = calculateAgeinmonths(ageinyear);
            displayResult(result,"Months");
        }
        else if (selection.equals("D")) {
            monthsdayshourseconds = getmonthsdayshoursseonds("Days");
            result = calculateAgeindays(ageinyear);
            displayResult(result, "Days");
        }
        else if (selection.equals("H")) {
            monthsdayshourseconds = getmonthsdayshoursseonds("Hours");
            result = calculateAgeinhours(ageinyear);
            displayResult(result, "Hours");
        }
        else if (selection.equals("S")) {
            monthsdayshourseconds = getmonthsdayshoursseonds("Seconds");
            result = calculateAgeinseconds(ageinyear);
            displayResult(result, "Seconds");
        }
        else {
            System.out.println("Please enter M(for age in months),D(for age in days),H(for age in hours and S(for age in seconds)");
        }

    }

    public static double getAgeinyears() {
        System.out.println("Age in years:");
        double ageinyears = input.nextDouble();
        return ageinyears;
    }

    public static String getSelection() {
        System.out.println("Enter M for months,D for days,H for hours and S for seconds");
        String selection = input.next();
        return selection;
    }

    public static String getmonthsdayshoursseonds(String label){
        return null;
    }
    public static double calculateAgeinmonths(double ageinyears) {
        double ageinmonths = (ageinyears * 12);
        return ageinmonths;
    }
    public static double calculateAgeindays(double ageinyears) {
        double ageindays = (ageinyears * 12 * 365);
        return ageindays;
    }
    public static double calculateAgeinhours(double ageinyears) {
        double ageinhours = (ageinyears * 12 * 365 * 24);
        return ageinhours;
    }
    public static double calculateAgeinseconds(double ageinyears) {
        double ageinseconds = (ageinyears * 12 * 365 * 24 * 3600);
        return ageinseconds;
    }
    public static void displayResult(double result,String label) {
        System.out.println("Your age in " + label + " is  "   + result);
    }
}
