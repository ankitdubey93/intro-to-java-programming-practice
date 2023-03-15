// This program asks the user to enter their rate and hours eventually giving them their grosspay.
// If they have worked overtime, that is more than 40 hours a week, then they will be paid at overtime hours.



import java.util.*;

public class Salary {
    public static Scanner input = new Scanner(System.in);

public static void main(String[] args) {
double hours;
double grosspay;
double rate;

rate = getRate();
hours = getHours();

if (hours>(40)) {
    grosspay = calculateGrosspaywot(hours,rate);
    displayResult(grosspay);
}
else if (hours<=(40)) {
    grosspay = calculateGrosspaywoot(hours,rate);
    displayResult(grosspay);
}
else {
    System.out.println("You must enter hours and rate to get your gross pay");
}
}

public static double getRate() {

    System.out.println("Enter rate per hour you earn: ");
    double rate = input.nextDouble();

    return rate;
}

public static double getHours() {

    System.out.println("Please enter the hours you worked in the week:");
    double hours = input.nextDouble();
    return hours;
}

public static double calculateGrosspaywot(double hours,double rate) {

    double grosspaywot = ((40 * rate) + ((hours - 40) * rate * 1.5));

    return grosspaywot;
}

public static double calculateGrosspaywoot(double hours, double rate) {

    double grosspaywoot = (rate * hours);

    return grosspaywoot;
}

public static void displayResult(double grosspay) {

    System.out.println("Your gross pay is" + grosspay);
}
}
