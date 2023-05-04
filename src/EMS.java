import java.io.*;
import java.util.*;

public class EMS {



    public static Map<Integer,String> employeeTable = new HashMap<>();



    public static void addEmployee(int id, String name) {
        if (!employeeTable.containsKey(id) && !employeeTable.containsValue(name)) {
            employeeTable.put(id, name);
            System.out.println("Employee added successfully");
        }else {
            System.out.println("ID/Employee already exists.");
        }
    }
    public static void removeEmployee(int id) {
        if (employeeTable.containsKey(id)) {
            String name = employeeTable.remove(id);
            System.out.println( name + " removed successfully.");
        } else {
            System.out.println("Employee with ID " + id + "does not exist.");
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


    public static void main(String [] args) {

        String csvFile = "data.csv";
        String line;
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile)))

        {
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


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Employee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. Save and Display Employee Register");
            System.out.println("0. Exit");
            System.out.print("Enter your option: ");
            int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter employee ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter employee name: ");
                String name = scanner.nextLine();
                addEmployee(id,name);
                break;

            case 2:
                System.out.print("Enter employee ID to remove: ");
                int removeID = scanner.nextInt();
                removeEmployee(removeID);
                break;

            case 3:

                displayEmployeeTable();
                break;

            case 0:
                System.out.println("Exiting......");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again. ");
        }
        System.out.println();
        }
    }
}
