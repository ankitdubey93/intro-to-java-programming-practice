import java.util.*;
public class nestedforloopmultiplication {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

       int startingvalue = getValue("Starting");
       int endingvalue = getValue("Ending");
       forLoop(startingvalue,endingvalue);

    }

    public static int getValue(String label) {
        System.out.println("Enter the " + label + " value");
        int value = input.nextInt();
        return value;
    }

    public static void forLoop(int start, int end) {


        for (int i = start;i <= end; i++) {
            System.out.println(i);
            for (int j = start; j <= end; j++) {
                System.out.println(i * j);
            }
        }
    }
}

