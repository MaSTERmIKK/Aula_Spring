public class Estintore implements DispositivoDiSicurezza {
    private boolean attivo;
    private double pressione;

    public Estintore(double pressione) {
        this.pressione = pressione;
        this.attivo = false;
    }

    @Override
    public void attiva() {
        attivo = true;
        System.out.println("Estintore attivato.");
    }

    @Override
    public void disattiva() {
        attivo = false;
        System.out.println("Estintore disattivato.");
    }

    @Override
    public boolean verificaStato() {
        boolean funzionante = pressione > 5.0; // Supponiamo che la pressione minima per il funzionamento sia 5.0
        System.out.println("Stato estintore: " + (funzionante ? "Funzionante" : "Non funzionante"));
        return funzionante;
    }

    public double getPressione() {
        return pressione;
    }

    public void setPressione(double pressione) {
        this.pressione = pressione;
    }
}
