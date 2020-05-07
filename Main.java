import java.io.*;  // Import the File class
import java.util.Scanner; // Import the Scanner class to read text files
public class Main {

   public static void main(String[] args)throws IOException {
      File myObj = new File("input.txt");
      Scanner myReader = new Scanner(myObj);
      Program program = new Program();
         
      while (myReader.hasNextLine()) {
         String data = myReader.nextLine();
         program.newAssignment(data);
      }
      program.display();
      myReader.close();
      
   }
}