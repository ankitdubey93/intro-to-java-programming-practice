import java.io.IOException;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scores{
    public static void main(String args[]){

      File file = new File("/Users/Ankit Dubey/IdeaProjects/HelloWorld/src/scores.txt");

        try{
            Scanner input = new Scanner(file);
            input.nextLine();
            double[] scores = new double[100]; // assuming there are no more than 100 scores
            int count = 0;
            double sum = 0;

            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] parts = line.split(",");
                double score = Double.parseDouble(parts[1].trim());
                scores[count] = score;
                count++;
                sum += score;
            }
            input.close();

            System.out.println("Scores: ");
            for (int i = 0;i < count;i++) {
                System.out.println(scores[i] + " ");
            }
            System.out.println();

            double average = sum / count;
            System.out.printf("High: %.2f\n", getMax(scores, count));
            System.out.printf("Low: %.2f\n", getMin(scores, count));
            System.out.printf("Average: %.2f\n", average);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid score format.");
        } catch (Exception e) {
            System.out.println("Unexpected circumstance occurred. ");
        }
    }

    public static double getMax(double[] array, int count) {
        double max = array[0];
        for (int i = 1; i < count; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double getMin(double[] array, int count) {
        double min = array[0];
        for (int i = 1; i < count; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}


