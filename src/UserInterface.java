import java.util.Scanner;

//Isak
public class UserInterface {
    private String opskrift;
    private Scanner scanner;

    public UserInterface(Scanner scanner, String opskrift){
        this.opskrift = opskrift;
        this.scanner = scanner;
    }

    System.out.println("Velkommen til Opskrifts Kataloget!");
    System.out.println("------------------------------------------");
    System.out.println("Hvad ønsker du at foretage dig?\n1. Tilføje en ny opskrift? (tilføj)\n2. Søge en opskrift frem? (søg)");

}




