import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PiattoSpeciale {
    private static final double BASE_PRICE = 1.00;
    private ArrayList<String> ingredientiPrivati;
    private ArrayList<String> ingredientiPubblici;
    private static final Map<String, Double> ingredientiPrezzi;

    static {
        ingredientiPrezzi = new HashMap<>();
        ingredientiPrezzi.put("Lattuga", 0.50);
        ingredientiPrezzi.put("Pomodoro", 0.75);
        ingredientiPrezzi.put("Formaggio", 1.00);
        ingredientiPrezzi.put("Panino Normale", 0.50);
        ingredientiPrezzi.put("Panino Sesamo", 0.75);
        ingredientiPrezzi.put("Prosciutto", 1.50);
        ingredientiPrezzi.put("Bacon", 1.25);
    }

    public PiattoSpeciale() {
        this.ingredientiPrivati = new ArrayList<>();
        this.ingredientiPubblici = new ArrayList<>();
    }

    public void aggiungiIngredientePrivato(String ingrediente) {
        if (ingredientiPrezzi.containsKey(ingrediente)) {
            ingredientiPrivati.add(ingrediente);
        } else {
            System.out.println("Ingrediente privato non valido.");
        }
    }

    public void aggiungiIngredientePubblico(String ingrediente) {
        if (ingredientiPrezzi.containsKey(ingrediente)) {
            ingredientiPubblici.add(ingrediente);
        } else {
            System.out.println("Ingrediente pubblico non valido.");
        }
    }

    public double calcolaPrezzoTotale() {
        double totale = BASE_PRICE;
        for (String ingrediente : ingredientiPrivati) {
            totale += ingredientiPrezzi.get(ingrediente);
        }
        for (String ingrediente : ingredientiPubblici) {
            totale += ingredientiPrezzi.get(ingrediente);
        }
        return totale;
    }

    public static void stampaIngredientiDisponibili() {
        System.out.println("Ingredienti disponibili:");
        for (String ingrediente : ingredientiPrezzi.keySet()) {
            System.out.println(ingrediente + ": " + ingredientiPrezzi.get(ingrediente) + " euro");
        }
    }
}
