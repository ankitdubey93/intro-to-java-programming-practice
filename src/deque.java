import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class deque {

    public static void main(String [] args) {

        Deque<Integer> arrDeque = new ArrayDeque<>();
        Deque<Integer> linkedDeque = new LinkedList<>();


        arrDeque.add(5);
        arrDeque.offerFirst(7);
        arrDeque.offerLast(9);


        System.out.println(arrDeque);

        System.out.println(arrDeque.size());

        System.out.println(arrDeque.peek());
        System.out.println(arrDeque.peekFirst());
        System.out.println(arrDeque.peekLast());
    }
}
