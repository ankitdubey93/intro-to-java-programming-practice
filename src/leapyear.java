import java.util.*;
public class leapyear {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter a year: ");
            int year = input.nextInt();
            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }

            int[] daysInMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

            System.out.println("Enter a month number: ");
            int monthNumber = input.nextInt();


            if (monthNumber < 1 || monthNumber > 12) {
                break;
            }

            String monthName = monthNames[monthNumber - 1];
            int numberofDays = daysInMonth[monthNumber - 1];
            System.out.println(monthName + " has " + numberofDays + " days.");

        }
    }
    public static boolean isLeapYear(int year) {
        if(year % 4 !=0) {
            return false;
        }
        else if(year % 100 !=0) {
            return true;
        }
        else if(year % 400 != 0) {
            return false;
        }
        else {
            return true;
        }
    }
}
