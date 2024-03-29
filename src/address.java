
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class address {

    public static void main(String [] args) {

        try {
            File file = new File("/Users/Ankit Dubey/IdeaProjects/HelloWorld/src/address.txt");
            List<String> linesList = Files.readAllLines(Path.of(file.getPath()));

            Object[] linesArray = linesList.toArray();
            Object[] linesArrayCleaned = Arrays.stream(linesArray).filter(o -> o.toString().length() > 0).toArray();

            String output = "";

            for(int i = 0; i < linesArrayCleaned.length; i++){
                String lineConvertedToString = linesArrayCleaned[i].toString();
                if((i+1)%3 > 0){
                    if((i+2)%3 == 0){
                        output += (lineConvertedToString + ", ");
                    } else {
                        String[] name = lineConvertedToString.split(" ");
                        output += (name[1] + ", " + name[0] + ", ");
                    }
                } else {
                    String[] address = lineConvertedToString.split(" ");
                    output += (address[0] + " " + address[1] + ", " + address[2] + "\n");
                }
            }

            System.out.print(output);


//        String nameLine1 = Files.readAllLines(Paths.get("/Users/Ankit Dubey/IdeaProjects/HelloWorld/src/address.txt")).get(0);
//            String[] name1 = nameLine1.split(" ");
//            String address1l1 = Files.readAllLines(Paths.get("/Users/Ankit Dubey/IdeaProjects/HelloWorld/src/address.txt")).get(1);
//            String address1l2 = Files.readAllLines(Paths.get("/Users/Ankit Dubey/IdeaProjects/HelloWorld/src/address.txt")).get(2);
//            String[] address1 = address1l2.split(" ");
//            System.out.println(name1[1] + ", " + name1[0] + ", " + address1l1 + ", " + address1[0] + " " + address1[1] + ", " + address1[2] );
//
//            String nameLine2 = Files.readAllLines(Paths.get("/Users/Ankit Dubey/IdeaProjects/HelloWorld/src/address.txt")).get(4);
//            String[] name2 = nameLine2.split(" ");
//            String address2l1 = Files.readAllLines(Paths.get("/Users/Ankit Dubey/IdeaProjects/HelloWorld/src/address.txt")).get(5);
//            String address2l2 = Files.readAllLines(Paths.get("/Users/Ankit Dubey/IdeaProjects/HelloWorld/src/address.txt")).get(6);
//            String[] address2 = address2l2.split(" ");
//            System.out.println(name2[1] + ", " + name2[0] + ", " + address2l1 + ", " + address2[0] + " " + address2[1] + ", " + address2[2] );
//
//            String nameLine3 = Files.readAllLines(Paths.get("/Users/Ankit Dubey/IdeaProjects/HelloWorld/src/address.txt")).get(8);
//            String[] name3 = nameLine3.split(" ");
//            String address3l1 = Files.readAllLines(Paths.get("/Users/Ankit Dubey/IdeaProjects/HelloWorld/src/address.txt")).get(9);
//            String address3l2 = Files.readAllLines(Paths.get("/Users/Ankit Dubey/IdeaProjects/HelloWorld/src/address.txt")).get(10);
//            String[] address3 = address3l2.split(" ");
//            System.out.println(name3[1] + ", " + name3[0] + ", " + address3l1 + ", " + address3[0] + " " + address3[1] + ", " + address3[2] );


        }catch (FileNotFoundException e) {
        System.out.println("File not found");
        }catch (IOException e) {
            System.out.println("Unexpected Error occured");
        }

    }

}
