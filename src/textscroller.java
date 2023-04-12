import java.util.Scanner;

public class textscroller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a line of text: ");
        input.nextLine();
        String line = input.nextLine();
        System.out.print("Enter the number of characters to print in each line: ");
        int charsPerLine = input.nextInt();
        System.out.print("Enter the number of lines to print: ");
        int numLines = input.nextInt();
        input.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Enter the scroll direction (left or right): ");
        String scrollDirection = input.nextLine();

        // Duplicate the text to fill the specified number of characters per line
        String repeatedLine = line;
        while (repeatedLine.length() < charsPerLine) {
            repeatedLine += line;
        }

        // Print the requested number of lines with the given scrolling behavior
        for (int i = 0; i < numLines; i++) {
            // Calculate the amount of scrolling for this line
            int scrollAmount = i % charsPerLine;
            if (scrollDirection.equalsIgnoreCase("left")) {
                scrollAmount = charsPerLine - scrollAmount;
            }

            // Shift the line's content and print it
            String shiftedLine = repeatedLine.substring(scrollAmount) + repeatedLine.substring(0, scrollAmount);
            System.out.println(shiftedLine);
        }
    }
}