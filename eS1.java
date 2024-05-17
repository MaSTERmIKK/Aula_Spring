import java.util.HashMap;
import java.util.Scanner;

public class SimpleLoginSystem {
    private static HashMap<String, String> userDatabase = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Benvenuto! Seleziona un'opzione: [1] Registrazione [2] Login [3] Esci");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                registerUser();
            } else if (choice == 2) {
                if (loginUser()) {
                    performMathFunction();
                }
            } else {
                System.out.println("Grazie per aver usato il nostro sistema!");
                break;
            }
        }
    }

    private static void registerUser() {
        System.out.println("Inserisci username:");
        String username = scanner.nextLine();
        System.out.println("Inserisci password:");
        String password = scanner.nextLine();

        userDatabase.put(username, password);
        System.out.println("Registrazione completata con successo!");
    }

    private static boolean loginUser() {
        System.out.println("Inserisci username:");
        String username = scanner.nextLine();
        System.out.println("Inserisci password:");
        String password = scanner.nextLine();

        if (password.equals(userDatabase.get(username))) {
            System.out.println("Login effettuato con successo!");
            return true;
        } else {
            System.out.println("Username o password errati!");
            return false;
        }
    }

    private static void performMathFunction() {
        System.out.println("Inserisci un numero per calcolare il suo quadrato:");
        int number = scanner.nextInt();
        System.out.println("Il quadrato di " + number + " è " + (number * number));
        scanner.nextLine(); // Consume newline
    }
}
