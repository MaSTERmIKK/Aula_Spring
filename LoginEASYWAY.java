import java.util.Scanner;

public class SimpleLoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String registeredUsername = "";
        String registeredPassword = "";

        while (true) {
            System.out.println("Benvenuto! Seleziona un'opzione: [1] Registrazione [2] Login [3] Esci");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consuma newline

            if (choice == 1) {
                // Registrazione
                System.out.println("Inserisci un nuovo username:");
                registeredUsername = scanner.nextLine();
                System.out.println("Inserisci una nuova password:");
                registeredPassword = scanner.nextLine();
                System.out.println("Utente registrato con successo!");
            } else if (choice == 2) {
                // Login
                System.out.println("Inserisci il tuo username:");
                String username = scanner.nextLine();
                System.out.println("Inserisci la tua password:");
                String password = scanner.nextLine();

                if (username.equals(registeredUsername) && password.equals(registeredPassword)) {
                    System.out.println("Login effettuato con successo!");
                    // Funzione matematica
                    System.out.println("Inserisci un numero per calcolare il suo quadrato:");
                    int number = scanner.nextInt();
                    System.out.println("Il quadrato di " + number + " è " + (number * number));
                    scanner.nextLine(); // Consuma newline
                } else {
                    System.out.println("Username o password errati!");
                }
            } else {
                System.out.println("Grazie per aver usato il nostro sistema!");
                break;
            }
        }
    }
}
