import java.util.*;
public class multiplicationexpression {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int value = getValue("multiple number ");
        int expressions = getValue("No of expressions required ");

        whileLoop(value,expressions);
    }

    public static int getValue(String name) {
        System.out.println("Enter " + name );
         int value = input.nextInt();
         return value;
    }
    public static void whileLoop(int value,int expressions) {
        System.out.println("The multiplication expressions are : ");

        int count = 1;
        while (count <= expressions) {
            System.out.println(value + " * " + count + " = " + (value * count));
            count++;
        }
    }
}
