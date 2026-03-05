import java.util.ArrayList;
import java.util.Scanner;

public class OpskriftKatalog {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> recipes = new ArrayList<>();

        boolean running = true;
        while(running) {
            printMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1": addRecipes(); break;
                case "2": removeRecipes(); break;
                case "3": showRecipes(); break;
                case "4": editRecipes(); break;
                case "5": running = false;
                System.out.println("Programmet afsluttes");
                break;
                default: System.out.println("Ugyldigt valg");
            }
        }
    }
    private static void printMenu() {
        System.out.println("\n1. Tilføj opskrift");
        System.out.println("2. Fjern opskrift");
        System.out.println("3. Vis opskrifter");
        System.out.println("4. Rediger opskriver");
        System.out.println("5. Afslut program");
        System.out.println("Dit valg");
    }

}
