import java.util.LinkedList;
import java.util.Queue;

public class bbq2 {

    public static void main(String [] args) {

        Queue<String> q = new LinkedList<String>();

        q.add("A");
        q.add("B");
        q.add("C");


        System.out.println(q);

        System.out.println(q.contains("C"));

        System.out.println(q.peek());


        System.out.println(q.toArray()[1]);


    }
}
