//This program asks the age in years, converts it and displays Age in months, days, hours and seconds.

import java.math.BigInteger;
import java.util.*;
public class Age {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int ageinyears; //defining an integer variable "age in years"

        System.out.println("What is your age in years?");
        ageinyears = input.nextInt();

        int ageinmonths = (ageinyears * 12); //defining an integer variable "age in months"
        int ageindays = (ageinmonths * 365);
        int ageinhours = (ageindays * 24);
        BigInteger ageinseconds = BigInteger.valueOf(ageinhours).multiply(BigInteger.valueOf(3600)); //defining an integer variable "age in seconds"

        System.out.println("Your age in months is " + ageinmonths);
        System.out.println("Your age in days is " + ageindays);
        System.out.println("Your age in hours is " + ageinhours);
        System.out.println("Your age in seconds is " + ageinseconds );
    }
}
