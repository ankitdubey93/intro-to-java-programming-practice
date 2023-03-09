//Program to prompt user for hours and rate per hour and calculate and display their weekly, monthly and annual gross pay(hours* rate)
import java.util.*;
public class HoursandRateperHour {
    private static Scanner input = new Scanner((System.in));
    public static void main(String[] args) {
        double hours;
        double rate;
        double wp;
        double mp;
        double ap;

        System.out.println("Hours per week: ");
        hours = input.nextDouble();

        System.out.println("Rate per Hour: ");
        rate = input.nextDouble();

        wp = (hours * rate);
        ap = (hours * rate * 52);
        mp = (ap/12);

        System.out.println("Weekly Gross Pay is " + wp);
        System.out.println("Monthly gross pay is " + mp);
        System.out.println("Annual Gross pay is " + ap );


    }
}
