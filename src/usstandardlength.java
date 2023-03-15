import java.util.*;

public class usstandardlength {
    public static Scanner input = new Scanner(System.in);

    public static void main(String [] args) {
        String choice;
        String metric;
        String selection;
        String unit;
        double result;
        double miles;
       String Label;

        choice = getChoice().toUpperCase();
        miles = getMiles();

        if (choice.equals("US Measurement") || choice.equals("US") || choice.equals("Metric Measurements") || choice.equals("metric")) {
            selection = getSelection();
            result = convertMeasurement(miles, selection);
            if(result == 0){
                System.out.println("You have to type the unit to which you want your distance converted into");
            } else {
                displayResult(result,selection);
            }
        }

        else {
            System.out.println("You need to first choose the metric system. i.e. US measurements or Metric measurements");
        }
    }

    public static double getMiles() {
        double miles;
        System.out.println("Enter distance in miles:");
        miles = input.nextDouble();
        return miles;
    }




    public static String getChoice() {
        return getStringInput("Enter US to convert to US measurements and Metric to convert to Metric measurements");
    }

    public static String getSelection() {
        return getStringInput("Enter the conversion unit");
    }

    public static String getStringInput(String message) {
        System.out.println(message);
        return input.next();
    }



    public static double convertMeasurement(double miles, String unit) {
        switch(unit) {
            case "km":
            case "kilometer":
                return (miles * 1.60934);
            case "cm":
            case "centimeter":
                return (miles * 1609.33999997549);
            case "metre":
            case "m":
                return (miles * 160934);
            case "feet":
            case "ft":
                return (miles * 5280);
            case "yard":
            case "y":
                return (miles * 1760);
            case "inches":
            case "in":
                return (miles * 63360);
            default:
                return 0;
        }
    }

    public static void displayResult(double result,String Label) {

        System.out.println("Your distance in  " + Label + " is " + result);

    }



}
