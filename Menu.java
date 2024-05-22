public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;

        while (continua) {
            PiattoSpeciale piatto = new PiattoSpeciale();

            System.out.println("Benvenuti nel nostro ristorante!");

            PiattoSpeciale.stampaIngredientiDisponibili();

            System.out.println("Seleziona ingredienti pubblici dal menu (inserisci 'fine' per terminare):");
            while (true) {
                System.out.print("Ingrediente pubblico: ");
                String ingredientePubblico = scanner.nextLine();
                if (ingredientePubblico.equalsIgnoreCase("fine")) {
                    break;
                }
                piatto.aggiungiIngredientePubblico(ingredientePubblico);
            }

            System.out.println("Inserisci ingredienti privati dal menu (inserisci 'fine' per terminare):");
            while (true) {
                System.out.print("Ingrediente privato: ");
                String ingredientePrivato = scanner.nextLine();
                if (ingredientePrivato.equalsIgnoreCase("fine")) {
                    break;
                }
                piatto.aggiungiIngredientePrivato(ingredientePrivato);
            }

            double totale = piatto.calcolaPrezzoTotale();
            System.out.println("Il prezzo totale del piatto speciale è: " + totale + " euro");

            System.out.print("Vuoi ordinare un altro piatto speciale? (s/n): ");
            String risposta = scanner.nextLine();
            if (risposta.equalsIgnoreCase("n")) {
                continua = false;
            }
        }
        scanner.close();
    }
}
