import java.util.LinkedList;
import java.util.Queue;

public class bbq {

    public static void main(String args[]) {

        Queue<String> bbqLine = new LinkedList<String>();

        bbqLine.add("jackson");
        bbqLine.add("Tyreek");
        bbqLine.add("Susan");

        System.out.println(bbqLine.peek());

        bbqLine.poll();

        System.out.println(bbqLine);



    }
}
