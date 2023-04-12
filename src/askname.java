import java.util.*;
public class askname {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a name in the format 'Firstname Lastname' :");
        String name = input.nextLine().trim();

    // Splitting name in two parts

    String[]nameParts = name.split("\\s+");
    if (nameParts.length != 2) {
        System.out.println("Invalid input format");
        return;
    }
    String firstname = nameParts[0];
    String lastname = nameParts[1];



    String firstinitial = "";
    if(firstname.length()>0) {
        firstinitial = firstname.substring(0,1).toUpperCase() + ".";
    }

    System.out.println(lastname + "," + firstinitial);
    }
}
