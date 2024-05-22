import java.util.ArrayList;

public class Fabbrica {
    private ArrayList<PannaCotta> listaPannaCotta;

    public Fabbrica() {
        this.listaPannaCotta = new ArrayList<>();
    }

    public void aggiungiPannaCotta(PannaCotta pannaCotta) {
        this.listaPannaCotta.add(pannaCotta);
    }

    public void visualizzaPannaCotta() {
        for (PannaCotta pannaCotta : listaPannaCotta) {
            System.out.println("Nome: " + pannaCotta.getNome() + ", Prezzo: " + pannaCotta.getPrezzo() + " euro");
        }
    }

    public PannaCotta cercaPannaCotta(String nome) {
        for (PannaCotta pannaCotta : listaPannaCotta) {
            if (pannaCotta.getNome().equalsIgnoreCase(nome)) {
                return pannaCotta;
            }
        }
        return null;
    }
}
