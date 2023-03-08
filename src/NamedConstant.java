import java.util.Scanner;

public class NamedConstant {
public static void main(String[] args) {
    final double PI = 3.14; //Declaring a constant

    //Making a scanner object
    Scanner input = new Scanner(System.in);

    //Prompt user to enter a radius
    System.out.print("Enter a number for raidus: ");
    double radius = input.nextDouble();

    //Compute the area
    double area = radius * radius * PI;

    //Display results
    System.out.println("The area for the circle of radius " + radius +   "is"   + area);
}
}
