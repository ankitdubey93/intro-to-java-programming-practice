import java.util.*;
public class forloopmultiplication {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int value = getValue("multiple number ");
        int expressions = getValue("No of expressions required ");

        forLoop(value,expressions);
    }

    public static int getValue(String name) {
        System.out.println("Enter " + name );
        int value = input.nextInt();
        return value;
    }
    public static void forLoop(int value,int expressions) {
        System.out.println("The multiplication expressions are : ");

        for (int count = 1;
                count <= expressions;
                count++) {
            System.out.println(value + " * " + count + " = " + (value * count));

        }
    }
}

