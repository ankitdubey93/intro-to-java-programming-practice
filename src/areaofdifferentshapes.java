import java.util.*;
import static java.lang.Math.*;
public class areaofdifferentshapes {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String choice;
        double userinput;
        double result;


        choice = getChoice();

        if (choice.equals("square")) {
            userinput = getuserinput("Length");
            result = calculateAreaofsquare(userinput);
            displayResult(choice,result);
        }
        else if (choice.equals("circle")) {
            userinput = getuserinput("Radius");
            result = calculateAreaofcircle(userinput);
            displayResult(choice,result);

        }
        else {
            System.out.println("Please enter the correct details in the fields");
        }
    }

    public static String getChoice() {
        System.out.println("Please type square or circle to calculate their respective areas");
        String choice = input.next();
        return choice;
    }

    public static double getuserinput(String measure) {
        double distance;
        System.out.println("Enter" + measure + ":");
        distance = input.nextDouble();
        return distance;
    }

    public static double calculateAreaofsquare(double length){
        double area = (length * length);
        return area;
    }
    public static double calculateAreaofcircle(double radius) {
        double area = (PI * radius * radius);
        return area;
    }
    public static void displayResult(String choice,Double area) {
        System.out.println("The area of " + choice + " is " + area + "m^2");
    }
}
