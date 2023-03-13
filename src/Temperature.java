import java.util.*;
public class Temperature {
    private static Scanner input = new Scanner(System.in);

    public static void main(String [] args) {
        double temperature;
        String choice;
        double result;


        choice = getChoice().toUpperCase();

        switch (choice) {
            case "C":
                temperature = getTemperature("Fahrenheit");
                result = calculateCelsius(temperature);
                displayResult(temperature,"Fahrenheit",result,"Celsius");
                break;

            case "F":
                temperature = getTemperature("Celsius");
                result = calculateFahrenheit(temperature);
                displayResult(temperature,"Celsius",result,"Fahrenheit");
                break;
            default:
                System.out.println("You must enter C to convert to Celsius or F to convert to Fahrenheit");
        }
    }

    public static String getChoice() {
        String choice;
        System.out.println("Enter C to convert to Celsius or F to convert to Fahrenheit");
        choice = input.nextLine();
        return choice;

    }

    public static double getTemperature(String label) {
        double temperature;

        System.out.println("Enter" + label + "temperature:");
        temperature = input.nextDouble();
        return temperature;
    }

    public static double calculateCelsius(double fahrenheit) {
        double celsius;

        celsius = (fahrenheit - 32) * 5/9;

        return celsius;
    }

    public static double calculateFahrenheit(double celsius) {
        double fahrenheit;

        fahrenheit = (celsius * 9/5 + 32);

        return fahrenheit;
    }

    public static void displayResult(double temperature,String fromLabel,double result, String toLabel ) {
        System.out.println(temperature + " degree " + fromLabel + " is " + result + " degree " + toLabel);

    }
}
