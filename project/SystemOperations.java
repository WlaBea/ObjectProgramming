package project;
import java.util.Scanner;

public final class SystemOperations{
        public static Scanner userInput = new Scanner(System.in);
        public static String enterkey;
        public static int enterIntKey;
        public static void pressEnter(){            
            System.out.println("Wciśnij Enter");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            while(!scanner.equals("")){
            System.out.println("Wciśnij Enter");
            scanner.nextLine();
        }

    }        
}