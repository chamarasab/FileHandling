import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //file creation
        try {
            File myObj = new File("C:\\Users\\Chamara\\Documents\\Java\\hello.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //file edit
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\Chamara\\Documents\\Java\\hello.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //read file
        try {
            File myObj = new File("C:\\Users\\Chamara\\Documents\\Java\\hello.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //delete file
        File myObj = new File("C:\\Users\\Chamara\\Documents\\Java\\hello.txt"); 
        if (myObj.delete()) { 
          System.out.println("Deleted the file: " + myObj.getName());
        } else {
          System.out.println("Failed to delete the file.");
        } 
    }
}
