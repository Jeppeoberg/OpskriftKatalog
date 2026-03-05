package UI;

import java.util.ArrayList;
import java.util.Scanner;

public class OpskriftKatalog {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> recipes = new ArrayList<>();

    public static void main(String[] args){

        boolean running = true;

        while(running) {
            printMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1": addRecipes(); break;
                case "2": removeRecipes(); break;
                case "3": showRecipes(); break;
                case "4": editRecipes(); break;
                case "5":
                    running = false;
                    System.out.println("Programmet afsluttes");
                    break;
                default:
                    System.out.println("Ugyldigt valg");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n1. Tilføj opskrift");
        System.out.println("2. Fjern opskrift");
        System.out.println("3. Vis opskrifter");
        System.out.println("4. Rediger opskrifter");
        System.out.println("5. Afslut program");
        System.out.print("Dit valg: ");
    }

    private static void addRecipes() {
        System.out.print("Indtast opskriftens navn: ");
        String recipe = scanner.nextLine();
        recipes.add(recipe);
        System.out.println("Opskrift tilføjet");
    }

    private static void showRecipes() {
        if(recipes.isEmpty()) {
            System.out.println("Ingen opskrifter endnu.");
            return;
        }

        for (int i = 0; i < recipes.size(); i++) {
            System.out.println((i+1) + ". " + recipes.get(i));
        }
    }

    static void removeRecipes(){
        showRecipes();
        System.out.print("Hvilken opskrift vil du slette? ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if(index > 0 && index <= recipes.size()){
            recipes.remove(index - 1);
            System.out.println("Opskrift slettet.");
        } else {
            System.out.println("Ugyldigt nummer.");
        }
    }

    static void editRecipes(){
        showRecipes();
        System.out.print("Hvilken opskrift vil du redigere? ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if(index > 0 && index <= recipes.size()){
            System.out.print("Nyt navn: ");
            String newName = scanner.nextLine();
            recipes.set(index - 1, newName);
            System.out.println("Opskrift opdateret.");
        } else {
            System.out.println("Ugyldigt nummer.");
        }
    }
}