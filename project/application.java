package project;

import project.createLists.AddCat;
import project.createLists.CreateTask;
import project.mainComponents.Menu;
import project.mainComponents.SystemOperations;
public class application {
    public static void main(String []args) throws InterruptedException{
        System.out.println("Witaj! Wciśnij klawisz 'Enter', aby rozpocząć dyżur!");
        SystemOperations.enterkey=SystemOperations.userInput.nextLine();
        while(!SystemOperations.enterkey.equals("")){
            System.out.println("Wciśnij Enter");
            SystemOperations.enterkey=SystemOperations.userInput.nextLine();
        }
        CreateTask.addTasks();
        Menu.mainList();

     }
    }  
    

