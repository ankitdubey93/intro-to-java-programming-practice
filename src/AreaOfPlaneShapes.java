import java.util.*;
public class AreaOfPlaneShapes {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double radius;
        double length;
        double areaofcircle;
        double areaofcube;

        radius = getRadius();
        length = getLength();
        areaofcircle = calculateAreaOfCircle(radius);
        areaofcube = calculateAreaOfCube(length);
        displayResult(areaofcircle, areaofcube);

    }

    private static double getRadius() {
        double radius;

        System.out.println("What is the radius of the circle?");
        radius = input.nextDouble();

        return radius;
    }

    private static double getLength() {
        double length;

        System.out.println("What is the length of the cube?");
        length = input.nextDouble();

        return length;

    }

    private static double calculateAreaOfCircle(double radius) {
        double areaofcircle;

        areaofcircle = (3.14 * radius * radius);

        return areaofcircle;

    }
    private static double calculateAreaOfCube(double length) {
        double areaofcube;

        areaofcube = (length * length * length);

        return areaofcube;

    }

    private static void displayResult(double areaofcircle, double areaofcube){
    System.out.println("The area of the circle is " + areaofcircle);
        System.out.println("The area of cube is  " + areaofcube);
    }
}

