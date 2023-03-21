import java.util.*;
public class averagedowhileloop {
 public static Scanner input = new Scanner(System.in);

 public static void main(String [] args) {
  try {
   double average = getAveragescores();
  } catch (Exception error) {
   System.out.println(error.getMessage());
   System.exit(0);
  }

 }
 public static double getAveragescores() {
  int score;
  int totalscore = 0;

  int count = 0;

  do {
   System.out.println("Enter Grade Score " + (count + 1) + " (Enter negative value to end)");
   count++;
   score = input.nextInt();
   if (score >=0) {
    totalscore = totalscore + score;
   }
  } while (score > 0);
   double average = totalscore/(count-1);
   System.out.println("Average is" + average);
  return average;
 }
 
  
 }

