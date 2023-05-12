import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class trialgpt {

    public static void main(String[] args) {
        // Create a HashMap and add some key-value pairs
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "John Smith");
        map.put(2, "Mary Jones");
        map.put(3, "David Lee");
        map.put(4, "Sarah Brown");

        // Prompt the user to enter a name to search for
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search for: ");
        String name = scanner.nextLine();

        // Search for the key that has the specified name
        Integer key = null;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getValue());
            if (entry.getValue().equalsIgnoreCase(name)) {
                key = entry.getKey();
                break;
            }
        }

        // Display the result of the search
        if (key != null) {
            System.out.println("The key for name \"" + name + "\" is " + key);
        } else {
            System.out.println("No key found for name \"" + name + "\"");
        }
    }
}
