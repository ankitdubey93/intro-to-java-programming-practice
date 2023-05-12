import java.io.*;
import java.util.*;

public class EMS {


    public static Map<Integer, String> employeeTable = new HashMap<>();


    public static void addEmployee(int id, String name) {
        if (!employeeTable.containsKey(id) && !employeeTable.containsValue(name)) {
            employeeTable.put(id, name);
            System.out.println("Employee added successfully");
        } else {
            System.out.println("ID/Employee already exists.");
        }
    }

    public static void removeEmployee(int id) {
        if (employeeTable.containsKey(id)) {
            String name = employeeTable.remove(id);
            System.out.println(name + " removed successfully.");
        } else {
            System.out.println("Employee with ID " + id + "does not exist.");
        }
    }


    public static void searchEmployee() {
        Scanner input = new Scanner(System.in);
        Scanner searchinput = new Scanner(System.in);

        System.out.println("1. Search Employee by ID ");
        System.out.println("2. Search Employee by Name ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter Employee ID: ");
                int employeeid = searchinput.nextInt();
                if (employeeTable.containsKey(employeeid)) {
                    String employeename = employeeTable.get(employeeid);
                    System.out.println(employeename);
                } else {
                    System.out.println("ID does not exist. ");
                }
                break;

            case 2:
                System.out.println("Enter Employee Name: ");
                String employeeName = searchinput.nextLine();
                Integer key = null;
                for (Map.Entry<Integer, String> entry : employeeTable.entrySet()) {
                    if (entry.getValue().equalsIgnoreCase(employeeName)) {
                        key = entry.getKey();
                        break;
                    }
                }

                if (key != null) {
                    System.out.println(key);
                } else {
                    System.out.println("Employee does not exist. ");
                }

        }
    }


    public static void displayEmployeeTable() {
        String[] namearray = new String[employeeTable.size()];
        int[] idarray = new int[employeeTable.size()];

        System.out.println("Employee Register: ");
        System.out.println("--------------------------------");
        System.out.println("ID \t |  \tName");
        System.out.println("--------------------------------");

        for (Map.Entry<Integer, String> entry : employeeTable.entrySet()) {
            int id = entry.getKey();
            String name = entry.getValue();

            System.out.println(id + " \t | \t " + name);
        }
        System.out.println("--------------------------------");

        int i = 0;
        for (Map.Entry<Integer, String> entry : employeeTable.entrySet()) {
            idarray[i] = entry.getKey();
            namearray[i] = entry.getValue();
            i++;

            String csvFilepath = "data.csv";
            try (FileWriter writer = new FileWriter(csvFilepath)) {
                for (int count = 0; count < idarray.length; count++) {
                    writer.append(String.valueOf(idarray[count]));
                    writer.append(",");
                    writer.append(namearray[count]);
                    writer.append("\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void displayMenu() {


        System.out.println("Employee Management System");
        System.out.println("1. Add Employee");
        System.out.println("2. Remove Employee");
        System.out.println("3. Save and Display Employee Register");
        System.out.println("4. Search Employee");
        System.out.println("0. Exit");
        System.out.print("Enter your option: ");
    }

    public static void main(String[] args) {

        String csvFile = "data.csv";
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(csvSplitBy);
                if (data.length == 2) {
                    int key = Integer.parseInt(data[0]);
                    String value = data[1];
                    employeeTable.put(key, value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            displayMenu();
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    addEmployee(id, name);
                    System.out.println("Enter any key to go back. ");
                    String s = scanner.next();
                    break;


                case 2:
                    System.out.print("Enter employee ID to remove: ");
                    int removeID = scanner.nextInt();
                    removeEmployee(removeID);
                    System.out.println("Enter any key to go back. ");
                    s = scanner.next();
                    break;

                case 3:
                    displayEmployeeTable();
                    Scanner answeropt = new Scanner(System.in);
                    System.out.println("Sort table by: (1) ID or (2) Name or Any other number to go back. ");
                    int sortoption = answeropt.nextInt();

                    List<Map.Entry<Integer, String>> entries = new ArrayList<>(employeeTable.entrySet());
                    Comparator<Map.Entry<Integer, String>> comparator;
                    if (sortoption == 1) {
                        comparator = Comparator.comparing(Map.Entry::getKey);
                        Collections.sort(entries, comparator);
                        System.out.println("Sorted Employee Table (by ID): ");
                    } else if (sortoption ==2){
                        comparator = Comparator.comparing(Map.Entry::getValue);
                        Collections.sort(entries, comparator);
                        System.out.println("Sorted Employee Table (by Name): ");
                    } else {
                        break;
                    }

                    Map<Integer, String> sortedTable = new LinkedHashMap<>();
                    for (Map.Entry<Integer, String> entry : entries) {
                        sortedTable.put(entry.getKey(), entry.getValue());
                    }
                    displayEmployeeTable();
                    System.out.println("Enter any key to go back. ");
                    s = scanner.next();
                    break;


                case 4:
                    searchEmployee();
                    System.out.println("Enter any key to go back. ");
                    s = scanner.next();
                    break;

                case 0:
                    System.out.println("Exiting......");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again. ");
            }
        }
    }

}
