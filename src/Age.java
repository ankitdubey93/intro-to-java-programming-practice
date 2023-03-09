//This program asks the age in years, converts it and displays Age in months, days, hours and seconds.

import java.util.*;
public class Age {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int aiy; //defining an integer variable "age in years"
        int aim; //defining an integer variable "age in months"
        int aid; //defining an integer variable "age in days"
        int aih; //defining an integer variable "age in hours"
        int ais; //defining an integer variable "age in seconds"

        System.out.println("What is your age in years?");
        aiy = input.nextInt();

        aim = (aiy * 12);
        aid = (aim * 365);
        aih = (aid * 24);
        ais = (aih * 60 * 60);

        System.out.println("Your age in months is " + aim);
        System.out.println("Your age in days is " + aid);
        System.out.println("Your age in hours is " + aih);
        System.out.println("Your age in seconds is " + ais);
    }
}
