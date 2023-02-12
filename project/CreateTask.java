package project;
import java.io.FileOutputStream;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.ObjectOutputStream;
import java.io.EOFException;
import java.io.File;  // Import the File class
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

public class CreateTask {
    public static void addTasks(){
        Task newTask1 = new Task(1,"Sprzątanie",1,false); 
        Task newTask2 = new Task(2,"Mycie",1,false); 
        Task newTask3 = new Task(3,"Zabawa",2,false); 
                
        try {
            FileOutputStream myWriter = new FileOutputStream("./project/task.txt");
            ObjectOutputStream writer = new ObjectOutputStream(myWriter);
            writer.writeObject(newTask1);
            writer.writeObject(newTask2);
            writer.writeObject(newTask3);
            writer.close();
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        }
}
