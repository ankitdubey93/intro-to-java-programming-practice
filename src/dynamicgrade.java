import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.LinkedBlockingDeque;

public class dynamicgrade {
    public static Scanner input = new Scanner(System.in);

    public static void main(String [] args) {

        ArrayList<Integer> scores = new ArrayList<Integer>();
        int score;


        while(true) {
            System.out.println("Enter the scores (Enter negative value to stop): ");
            score = input.nextInt();
            if(score < 0) {
                break;
            }

            scores.add(score);

            }



        int maxScore = getMax(scores);
        int minScore = getMin(scores);
        int sum = getTotal(scores);
        double average = sum/scores.size();

        Comparator<Integer> reverseComparator = Collections.reverseOrder();
        Collections.sort(scores, reverseComparator);



        System.out.println("Highest Score: " + maxScore);
        System.out.println("Lowest Score: " + minScore);
        System.out.println("Average Score: " + average);
        System.out.println("Scores from the highest to the lowest are: " + scores);

    }

    public static int getMax(ArrayList<Integer> scores) {
        int maxScore = scores.get(0);
        for(int index = 0;index < scores.size(); index++) {
            int currentScore = scores.get(index);
            if(currentScore > maxScore) {
                maxScore = currentScore;
            }
        }
        return maxScore;

    }

    public static int getMin(ArrayList<Integer> scores) {
        int minScore = scores.get(scores.size() -1);
        for (int index = 0; index < scores.size(); index++) {
            int currentScore = scores.get(index);
            if (currentScore < minScore) {
                minScore = currentScore;
            }
        }
        return minScore;
    }

    public static int getTotal(ArrayList<Integer> scores) {
        int total = 0;
        for(int index = 0; index < scores.size(); index ++) {
            total += scores.get(index);
        }
        return total;
    }


}
