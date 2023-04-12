import javax.sound.midi.SysexMessage;
import java.awt.desktop.SystemSleepEvent;
import java.util.*;
public class backwards {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Enter a line of text:");
        String line = input.nextLine();

        line = line.trim();


        line = line.replaceAll("\\s+"," ");


        String[] words = line.split(" ");
        String reversed = "";

        for (int i = words.length - 1;i >= 0;i--) {
            reversed += words[i] + " ";

            }
        String charreverse = "";

        for (int i = reversed.length() - 1;i >= 0;i--) {
            charreverse += reversed.charAt(i);
        }
        charreverse = charreverse.trim();


        System.out.println(charreverse);
    }
}
