import java.util.*;
public class USStandardLengths {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double miles;
        double kilometres;
        double metres;
        double centimetres;

        miles = getMiles();
        kilometres = calculateKilometres(miles);
        metres = calculateMetres(kilometres);
        centimetres = calculateCentimetres(metres);
        displayResult(kilometres,metres,centimetres);

    }

    private static double getMiles() {
        double miles;
        System.out.println("Distance in miles: ");
        miles = input.nextDouble();
        return miles;
    }

   private static double calculateKilometres(double miles) {
        double kilometres;

        kilometres = (miles * 1.60934);

        return kilometres;
   }

    private static double calculateMetres(double kilometres) {
        double metres;

        metres = (kilometres * 1000);

        return metres;
    }

    private static double calculateCentimetres(double metres) {
        double centimetres;

        centimetres = (metres * 100);

        return centimetres;

    }

    private static void displayResult(double kilometres,double metres,double centimetres) {
        System.out.println("Distance in kilometres is "+ kilometres +"," + "Distance in metres is " + metres + " and " + " Distance in centimetres is " + centimetres);
    }
}
