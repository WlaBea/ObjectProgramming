package project.createLists;
import java.io.FileOutputStream;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.ObjectOutputStream;

import project.lists.CatsList;
import project.mainComponents.SystemOperations;
import project.mainObjects.Cats;

import java.io.EOFException;
import java.io.File;  // Import the File class
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;
import project.createLists.AppendingObjectOutputStream;

public class AddCat {

    public static void addNewCat(){
        int id=addID();
        boolean isInCage;
        SystemOperations.enterkey=SystemOperations.userInput.nextLine();
        System.out.println("Podaj imię kota:");
        String catName=SystemOperations.userInput.nextLine();
        System.out.println("Podaj wiek kota:");
        int catAge=SystemOperations.userInput.nextInt();
        System.out.println("Czy kot jest w klatce? Jeśli tak wpisz 1, jeśli nie, wpisz 0:");
        SystemOperations.enterkey=SystemOperations.userInput.nextLine();
        SystemOperations.enterIntKey=SystemOperations.userInput.nextInt();
        while((SystemOperations.enterIntKey != 1) && (SystemOperations.enterIntKey != 0)){
            System.out.println("Błędny wpis! Spróbuj jeszcze raz\n");
            SystemOperations.enterIntKey=SystemOperations.userInput.nextInt();
        }
        if(SystemOperations.enterIntKey == 1){
            isInCage=true;
        }
        else{
            isInCage=false;
        }
        addCat(id, catName, catAge, isInCage);
    }
    public static int addID(){
        int counter=0;
        try {
            FileInputStream fileStream = new FileInputStream("project/files/cats.txt");
            ObjectInputStream objStream = new ObjectInputStream(fileStream);
            Object obj;
            while((obj=objStream.readObject())!=null)  {    
            counter++;}
          } catch (EOFException eof) {
            return (counter+1);
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
        System.out.println("");
        return counter;
    }
    public static void addCat(int id, String catName, int catAge, boolean isInCage){
    Cats newCat = new Cats(id,catName, catAge, isInCage);
    try {
        FileOutputStream myWriter = new FileOutputStream("project/files/cats.txt", true);
        ObjectOutputStream writer = new AppendingObjectOutputStream(myWriter);
        writer.writeObject(newCat);
        writer.close();
        System.out.println("Kot dodany!");
        CatsList.showList();
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
    }
}
