import java.util.*;
public class gradescoresaverage {
 public static Scanner input = new Scanner(System.in);

 public static void main(String [] args) {
  try {
   int subjects = getValue("No of subjects", false);
   int scores = getScores(subjects);
   double average = scores/subjects;
   System.out.println("The average of your scores are " + average);
  } catch(Exception error) {
   System.out.println(error.getMessage());
   System.exit(0);
  }

 }

 public static int getValue(String name, boolean allowZero) {
  System.out.println("Enter " + name);
  int value = input.nextInt();

  int minValue = allowZero ? 0 : 1;


  while(value < minValue) {
   System.out.println(value + " is not a valid input. Please enter a number greater than or equal to " + minValue);
   value = input.nextInt();
  }

  return value;
 }

 public static int getScores(int subject) {
  int score = 0;

  int count = 1;
  while (count <= subject) {
   score = score + getValue(" score " + count, true);
   count++;
  }
  return score;
 }

}
