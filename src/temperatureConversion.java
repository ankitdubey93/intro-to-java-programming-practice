import java.util.*;
public class temperatureConversion {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        double fahrenheit;
        double celsius;

        System.out.println("Enter Temperature in Fahrenheit");
        fahrenheit = input.nextDouble();

        celsius = (fahrenheit - 32) * 5/9;

        System.out.println(Double.toString(fahrenheit) + "Degree Fahrenheit is " + celsius + " Degree Celsius ");
    }
}
