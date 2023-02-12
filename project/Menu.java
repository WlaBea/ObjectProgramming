package project;
import project.SystemOperations;
public class Menu {
    public static void mainList(){
        System.out.println("Wybierz z listy co chcesz zrobić:");
        System.out.println("1. Wyświetl listę kotów");
        System.out.println("2. Wyświetl listę zadań do zrobienia");
        System.out.println("3. Dodaj kota do listy");
        System.out.println("4. Zakończ dyżur");
        SystemOperations.enterIntKey=SystemOperations.userInput.nextInt();
        while((SystemOperations.enterIntKey != 1) && (SystemOperations.enterIntKey != 2)&&(SystemOperations.enterIntKey != 3)&&(SystemOperations.enterIntKey != 4)){
            System.out.println("Błędny numer zadania! Wybierz jeszcze raz\n");
            SystemOperations.enterIntKey=SystemOperations.userInput.nextInt();
        }
        switch(SystemOperations.enterIntKey){
            case 1:
            System.out.println("1. Wyświetl listę kotów");
            CatsList.showList();
            break;
            case 2:
            System.out.println("2. Wyświetl listę zadań do zrobienia");
            TasksList.showList();
            break;
            case 3:
            AddCat.addNewCat();
            break;
            case 4:
            System.out.println("Do zobaczenia!");
            break;
        }
    }
}
