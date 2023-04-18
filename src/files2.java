import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class files2 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String args[]){
        String fileName;

        System.out.println("Enter the name of the file: ");
        fileName = input.nextLine();


        try {
            File file = new File(fileName);
            Scanner scan = new Scanner(file);
            String fileContent = scan.nextLine();
            System.out.println(fileContent);

            String pattern = "<.*?>";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(fileContent);
            String untaggedText = m.replaceAll("");
            System.out.println("Untagged Text: ");
            System.out.println(untaggedText);


            String removedTags = fileContent.replaceFirst(untaggedText, "");
            String[] parts = removedTags.split("[<>]+");
            for (int i = 0;i<parts.length;i++)
                System.out.println("<" + parts[i] + ">");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Unexcepted error occured");
        }
    }
}

