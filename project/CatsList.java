package project;
import java.io.EOFException;
import java.io.File;  // Import the File class
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files
import project.Cats;

public class CatsList {
    public static void showList() {
        Cats inCat = new Cats();
        int count=0;
        try {
          FileInputStream fileStream = new FileInputStream("./project/cats.txt");
          ObjectInputStream objStream = new ObjectInputStream(fileStream);
          Object obj;
          while((obj=objStream.readObject())!=null)  {    
          inCat = (Cats)obj;
                System.out.println(inCat.showName());}
        } catch (EOFException eof) {
            System.out.println("Wciśnij enter, aby powrócić do Menu.");
            SystemOperations.enterkey=SystemOperations.userInput.nextLine();
            SystemOperations.enterkey=SystemOperations.userInput.nextLine();
            while(!SystemOperations.enterkey.equals("")){
            System.out.println("Wciśnij Enter");
            SystemOperations.enterkey=SystemOperations.userInput.nextLine();
            }
            Menu.mainList();
        }
         catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
      }
}
