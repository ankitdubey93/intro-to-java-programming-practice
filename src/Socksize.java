import java.util.*;
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
     double shoesize;
     System.out.println("Please enter your shoe size:");
     shoesize = ((input.nextDouble())+0.5);
     return shoesize;
 }
 public static int convertshoe(double shoesize){
     int shoe = (int)shoesize;
     return shoe;
 }

 public static String getSocksize(int shoe) {

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
     return (getSocksize(shoe));
 }

 public static void displayResult(String socksize) {
     System.out.println("You should order " + socksize + " size for your socks ");
 }
}
