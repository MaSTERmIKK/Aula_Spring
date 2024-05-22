import java.util.Scanner;

public class GestioneFabbrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fabbrica fabbrica = new Fabbrica();
        boolean continua = true;

        while (continua) {
            System.out.println("Gestione Fabbrica di Panna Cotta");
            System.out.println("1. Aggiungi Panna Cotta");
            System.out.println("2. Visualizza Panna Cotta");
            System.out.println("3. Cerca Panna Cotta");
            System.out.println("4. Esci");
            System.out.print("Scegli un'opzione: ");
            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il newline

            switch (scelta) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    ArrayList<String> ingredienti = new ArrayList<>();
                    System.out.print("Prezzo: ");
                    double prezzo = scanner.nextDouble();
                    scanner.nextLine(); // Consuma il newline
                    System.out.print("Tipo (1. Frutta, 2. Cioccolato): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // Consuma il newline
                    if (tipo == 1) {
                        System.out.print("Tipo di Frutta: ");
                        String tipoFrutta = scanner.nextLine();
                        fabbrica.aggiungiPannaCotta(new PannaCottaFrutta(nome, ingredienti, prezzo, tipoFrutta));
                    } else if (tipo == 2) {
                        System.out.print("Percentuale di Cioccolato: ");
                        double percentualeCioccolato = scanner.nextDouble();
                        scanner.nextLine(); // Consuma il newline
                        fabbrica.aggiungiPannaCotta(new PannaCottaCioccolato(nome, ingredienti, prezzo, percentualeCioccolato));
                    }
                    break;
                case 2:
                    fabbrica.visualizzaPannaCotta();
                    break;
                case 3:
                    System.out.print("Nome della Panna Cotta: ");
                    String nomeCerca = scanner.nextLine();
                    PannaCotta pannaCotta = fabbrica.cercaPannaCotta(nomeCerca);
                    if (pannaCotta != null) {
                        System.out.println("Trovata: " + pannaCotta.getNome() + " al prezzo di " + pannaCotta.getPrezzo() + " euro");
                    } else {
                        System.out.println("Panna Cotta non trovata.");
                    }
                    break;
                case 4:
                    continua = false;
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }
        scanner.close();
    }
}
