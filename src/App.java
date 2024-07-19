import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        // File creation
        try {
            File myObj = new File("C:\\Users\\RND\\Documents\\Java\\FileHandling\\hello.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Delay for 10 seconds before updating the file
        try {
          Thread.sleep(10000); // 10000 milliseconds = 30 seconds
      } catch (InterruptedException e) {
          System.out.println("An error occurred during the sleep period.");
          e.printStackTrace();
      }

        // File edit
        try {
            FileWriter myWriter = new FileWriter("C:\\Users\\RND\\Documents\\Java\\FileHandling\\hello.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Read file
        try {
            File myObj = new File("C:\\Users\\RND\\Documents\\Java\\FileHandling\\hello.txt");
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

        // Delay for 30 seconds before deleting the file
        try {
            Thread.sleep(10000); // 30000 milliseconds = 30 seconds
        } catch (InterruptedException e) {
            System.out.println("An error occurred during the sleep period.");
            e.printStackTrace();
        }

        // Delete file
        File myObj = new File("C:\\Users\\RND\\Documents\\Java\\FileHandling\\hello.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
