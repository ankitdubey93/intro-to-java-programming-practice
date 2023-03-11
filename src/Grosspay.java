import java.util.*;
class Grosspay{
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double hours;
        double rateperhour;
        double grossweeklypay;
        double grossmonthlypay;
        double grossannualpay;

        hours = getHours();
        rateperhour = getRate();
        grossannualpay = calculateAnnualpay(rateperhour,hours);
        grossmonthlypay = calculateMonthlypay(grossannualpay);
        grossweeklypay = calculateWeeklypay(rateperhour,hours);
        displayResult(grossannualpay,grossweeklypay,grossmonthlypay);
    }

    private static double getHours() {
        double hours;

        System.out.println("Enter hours per week:");
        hours = input.nextDouble();

        return hours;
    }
    private static double getRate() {
        double rateperhour;

        System.out.println("Enter rate per hour:");
        rateperhour = input.nextDouble();

        return rateperhour;
    }

    private static double calculateAnnualpay(double hours,double rateperhour) {
        double grossannualpay;

        grossannualpay = (rateperhour * hours * 52);

        return grossannualpay;
    }

    private static double calculateMonthlypay(double grossannualpay) {
        double grossmonthlypay;

        grossmonthlypay = (grossannualpay/12);

        return grossmonthlypay;
    }

    private static double calculateWeeklypay(double hours, double rateperhour) {
        double grossweeklypay;

        grossweeklypay = (hours * rateperhour);

        return grossweeklypay;
    }

    private static double displayResult(double grossannualpay, double grossweeklypay, double grossmonthlypay){
        System.out.println("The gross annual pay is" + " $ "+ grossannualpay);
        System.out.println("The gross monthly pay is" + " $ "+ grossmonthlypay);
        System.out.println("The gross weekly pay is" +" $ "+ grossweeklypay);

    return grossweeklypay;
    }


}
