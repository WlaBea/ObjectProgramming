package project;
import java.io.EOFException;
import java.io.File;  // Import the File class
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.Scanner; 

public class TasksList {
    public static void showList() {
        Task inTask1 = new Task();
        Task inTask2 = new Task();
        Task inTask3 = new Task();
        int maxID=1;
        try {
          FileInputStream fileStream = new FileInputStream("./project/task.txt");
          ObjectInputStream objStream = new ObjectInputStream(fileStream);
          Object obj;   
          obj=objStream.readObject();
          inTask1 = (Task)obj;
          obj=objStream.readObject();
          inTask2 = (Task)obj;
          obj=objStream.readObject();
          inTask3 = (Task)obj;
            System.out.println("Zadania wykonane");
            if(inTask1.isDone==true){System.out.println(inTask1.showTask());}
            if(inTask2.isDone==true){System.out.println(inTask2.showTask());}
            if(inTask3.isDone==true){System.out.println(inTask3.showTask());}
            System.out.println("Zadania do wykonania");
            if(inTask1.isDone==false){System.out.println(inTask1.showTask());}
            if(inTask2.isDone==false){System.out.println(inTask2.showTask());}
            if(inTask3.isDone==false){System.out.println(inTask3.showTask());}
            obj=objStream.readObject();
        } catch (EOFException eof) {
            System.out.println("Wpisz 0, aby powrócić do Menu lub wpisz, które zadanie oznaczyć jako wykonane.");
            SystemOperations.enterkey=SystemOperations.userInput.nextLine();
            SystemOperations.enterIntKey=SystemOperations.userInput.nextInt();
            while(SystemOperations.enterIntKey>3){
            System.out.println("Niepoprawna wartość");
            SystemOperations.enterIntKey=SystemOperations.userInput.nextInt();
            }
            if(SystemOperations.enterIntKey==0){
                Menu.mainList();
            }
            else{                
            if(inTask1.id==SystemOperations.enterIntKey){System.out.println(inTask1.taskDone());}
            if(inTask2.id==SystemOperations.enterIntKey){System.out.println(inTask2.taskDone());}
            if(inTask3.id==SystemOperations.enterIntKey){System.out.println(inTask3.taskDone());}
            try {
                FileOutputStream myWriter = new FileOutputStream("./project/task.txt");
                ObjectOutputStream writer = new ObjectOutputStream(myWriter);
                writer.writeObject(inTask1);
                writer.writeObject(inTask2);
                writer.writeObject(inTask3);
                writer.close();
              } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }
            Menu.mainList();
            }
            
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
