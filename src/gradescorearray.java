import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class gradescorearray {
    public static Scanner input = new Scanner(System.in);

    public static  void main(String [] args) {

        System.out.println("How many subjects did you appear in?: ");
        int subjects = input.nextInt();

        int[] scores = new int[subjects];
        int score;
        int numEntered = 0;

        while(true) {
            System.out.println("Enter the score for subject " + (numEntered+1) + ":");
            score = input.nextInt();
            if(score < 0) {
                break;
            }

            scores[numEntered] = score;
            numEntered++;
            if (numEntered == subjects) {
                break;
            }
        }

        int maxScore = getMax(scores);
        int minScore = getMin(scores);
        int sum = getTotal(scores);
        double average = sum/subjects;
        Arrays.sort(scores);
        reverse(scores);


        System.out.println("Highest Score: " + maxScore);
        System.out.println("Lowest Score: " + minScore);
        System.out.println("Average Score: " + average);
        System.out.println("Scores from the highest to the lowest are: " + Arrays.toString(scores));

    }

    public static int getMax(int[] scores) {
        int maxScore = scores[0];
        for(int index = 1;index < scores.length; index++) {
            if(maxScore < scores[index]) {
                maxScore = scores[index];
            }
        }
        return maxScore;

    }

    public static int getMin(int[] scores) {
        int minScore = scores[0];
        for (int index = 1; index > scores.length; index++) {
            if (minScore > scores[index]) {
                minScore = scores [index];
            }
        }
        return minScore;
    }

    public static int getTotal(int [] scores) {
        int total = 0;
        for(int index = 0; index < scores.length; index ++) {
            total += scores[index];
        }
        return total;
    }
    public static void reverse(int[] scores) {
        int n = scores.length;

        for(int i = 0; i < n/2; i++) {
            int temp = scores[i];
            scores[i] = scores[n - i - 1];
            scores[n - i - 1] = temp;
        }
    }
}
