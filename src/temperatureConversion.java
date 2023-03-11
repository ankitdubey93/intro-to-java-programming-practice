import java.util.*;
class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        fahrenheit = getFahrenheit();
        celsius = calculateCelsius(fahrenheit);
        displayResult(fahrenheit, celsius);
    }
    private static double getFahrenheit() {
        double fahrenheit;
        System.out.println("Enter Fahrenheit temperature:");
        fahrenheit = input.nextDouble();
        return fahrenheit;
    }
    private static double calculateCelsius(double fahrenheit) {
        double celsius;
        celsius = (fahrenheit - 32) * 5 / 9;

        return celsius;
    }
    private static void displayResult(double fahrenheit, double celsius) {
        System.out.println(fahrenheit + "° Fahrenheit is " +
                celsius + "° Celsius");
    }
}