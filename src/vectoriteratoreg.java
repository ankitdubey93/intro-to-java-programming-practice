import java.util.Vector;
import java.util.*;
import java.io.*;

public class vectoriteratoreg {

        public static void main(String args[]) {
            Vector<String> v = new Vector<>();
            v.add("Geeks");
            v.add("Geeks");
            v.add(1, "For");


            for (int i = 0; i < v.size(); i++) {
                System.out.print(v.get(i) + " ");
            }
            System.out.println();
            for (String str : v)
                System.out.print(str + " ");
        }
}



