// import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
// import java.nio.file.Files;
import java.io.FileWriter;
import java.io.File;

public class samplefile {
    public static void main(String[] args) {
        Scanner susan = new Scanner(System.in);
        try {
          File myObj = new File("E:\\filename.txt");
          if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
          } else {
            System.out.println("File already exists.");
          }
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
        try{
        FileWriter myWriter = new FileWriter("E:\\filename.txt");
        myWriter.write("Files in Java might be tricky, but it is fun enough!");
        String a = susan.next();
        myWriter.write("\n" + a);
        // myWriter.write("hi sir");
        myWriter.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
      susan.close();
    }
  }