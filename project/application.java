package project;

import project.SystemOperations;
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
    

