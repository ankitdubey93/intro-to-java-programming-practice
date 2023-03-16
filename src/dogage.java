import java.util.*;
public class dogage {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String name;
        Double age;
        Double dogage;

        name = getName();
        age = getAge();
        dogage = getDogage(age);
        displayResult(name, dogage);
    }

    public static String getName() {
        String name;
        System.out.println("What is the name of your dog?");
        name = input.next();
        return name;
    }

    public static Double getAge() {
        double age;
        System.out.println("How old is he/she?");
        age = input.nextDouble();
        return age;
    }

    public static Double getDogage(double age) {
        if (age <= 2) {
            return (10.5 * age);
        }
        else if (age > 2) {
            return (10.5 * 2) + ((age - 2) * 4);

        }
        return age;
    }


        public static void displayResult (String dogname,double dogage){
            System.out.println(dogname + " is " + dogage + " years old in Dog years ");
        }


    }
