public class PannaCottaFrutta extends PannaCotta {
    private String tipoFrutta;

    public PannaCottaFrutta(String nome, ArrayList<String> ingredienti, double prezzo, String tipoFrutta) {
        super(nome, ingredienti, prezzo);
        this.tipoFrutta = tipoFrutta;
    }

    public String getTipoFrutta() {
        return tipoFrutta;
    }

    public void setTipoFrutta(String tipoFrutta) {
        this.tipoFrutta = tipoFrutta;
    }
}
