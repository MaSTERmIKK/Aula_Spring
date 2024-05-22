public class PannaCottaCioccolato extends PannaCotta {
    private double percentualeCioccolato;

    public PannaCottaCioccolato(String nome, ArrayList<String> ingredienti, double prezzo, double percentualeCioccolato) {
        super(nome, ingredienti, prezzo);
        this.percentualeCioccolato = percentualeCioccolato;
    }

    public double getPercentualeCioccolato() {
        return percentualeCioccolato;
    }

    public void setPercentualeCioccolato(double percentualeCioccolato) {
        this.percentualeCioccolato = percentualeCioccolato;
    }
}
