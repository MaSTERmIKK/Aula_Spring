public class PannaCotta {
    private String nome;
    private ArrayList<String> ingredienti;
    private double prezzo;

    public PannaCotta(String nome, ArrayList<String> ingredienti, double prezzo) {
        this.nome = nome;
        this.ingredienti = ingredienti;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(ArrayList<String> ingredienti) {
        this.ingredienti = ingredienti;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void aggiungiIngrediente(String ingrediente) {
        this.ingredienti.add(ingrediente);
    }
}
