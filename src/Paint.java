import java.util.*;
public class Paint {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double length;
        double width;
        double height;
        double price;
        double sqftpergallon;
        double areaof4walls;
        double noofgallons;
        double totalcost;
        int gallons;

        length = getLength();
        width = getWidth();
        height = getHeight();
        price = getPrice();
        sqftpergallon = getSqftpergallon();
        areaof4walls = calculateAreaofwalls(length,width,height);
        noofgallons = calculateNoofgallons(areaof4walls,sqftpergallon);
        gallons = converttoInt(noofgallons);
        totalcost = calculateTotalCost(gallons,price);
        displayResult(totalcost,gallons);
    }
    private static double getLength() {
        double length;
        System.out.println("What is the length of the room?");
        length = input.nextDouble();
        return length;
    }
    private static double getWidth() {
        double width;
        System.out.println("What is the width of the room?");
        width = input.nextDouble();
        return width;
    }
    private static double getHeight() {
        double height;
        System.out.println("What is the height of the room?");
        height = input.nextDouble();
        return height;
    }
    private static double getPrice() {
        double price;
        System.out.println("What is the price of paint per gallon?");
        price = input.nextDouble();
        return price;
    }
    private static double getSqftpergallon() {
        double sqftpergallon;
        System.out.println("How much square feet does a gallon cover?");
        sqftpergallon = input.nextDouble();
        return sqftpergallon;
    }
    private static double calculateAreaofwalls(double length,double width,double height){
        double areaof4walls = ((2 * length * height) + (2 * width * height));
        return areaof4walls;
    }
    private static double calculateNoofgallons(double areaof4walls,double sqftpergallon){
        double noofgallons;
        noofgallons = ((areaof4walls/sqftpergallon)+0.9999);
        return noofgallons;
    }

private static int converttoInt(double noofgallons) {
        int gallons;
    gallons = (int) Math.round(noofgallons);
    return gallons;
}
    private static double calculateTotalCost(int gallons,double price){
        double totalcost;
        totalcost = (gallons * price);
        return totalcost;
    }

    private static void displayResult(double totalcost,int gallons){
        System.out.println("The total cost of the paint will be Rs. " + totalcost + " for " + gallons + " gallons of paint");
    }
}




