import java.util.Scanner;
public class Socksize {

 public static Scanner input = new Scanner(System.in);
 public static void main(String[] args) {
    double shoesize;
    String socksize;

    int shoe;

     shoesize = getShoesize();
     shoe = convertshoe(shoesize);
     socksize = getSocksize(shoe);
     displayResult(socksize);
 }
 public static double getShoesize() {
     System.out.println("Please enter your shoe size:");
     if(input.hasNextDouble()) {
         return (input.nextDouble());
     }
     else {
         System.out.println("You entered an invalid value");
         System.exit(0);
         return 0.0;
     }
 }
 public static int convertshoe(double shoesize){
     return (int)shoesize;

 }

 public static String getSocksize(int shoe) {
     String socksize = ("sock size");

     if (shoe<=4) {
         return ("extra small");
     }
     if ((shoe>=4) && shoe<=6) {
         return ("small");
     }
     if ((shoe>=7) && shoe<=9) {
         return ("medium");
     }
     if ((shoe>=10) && shoe<=12) {
         return ("large");
     }
     if (shoe>=13) {
         return ("extra large");
     }

     return socksize;
 }

 public static void displayResult(String socksize) {
     System.out.println("You should order " + socksize + " size for your socks ");
 }
}
