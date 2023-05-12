import java.util.*;

public class arraylist {

    public static void main(String args[]) {

       String[] courses = {"java","php","Hadoop","devops","python"};
       List<String> list = (List<String>) new LinkedList();
       for (String s: courses) {
           list.add(s);
       }
       System.out.print("The array of popular courses is: " + list);


       System.out.println(list.size());

    }
}


