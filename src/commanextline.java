import java.util.Scanner;

public class commanextline {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.print("Enter a line of comma-separated values: ");
        String line = input.nextLine();

        // Split the line into individual values
        String[] values = line.split(",");

        // Print each value on a separate line without commas and leading/trailing spaces
        for (String value : values) {
            System.out.println(value.trim());
        }
    }
}