public class AllarmeAntincendio implements DispositivoDiSicurezza {
    private boolean attivo;

    public AllarmeAntincendio() {
        this.attivo = false;
    }

    @Override
    public void attiva() {
        attivo = true;
        System.out.println("Allarme antincendio attivato.");
    }

    @Override
    public void disattiva() {
        attivo = false;
        System.out.println("Allarme antincendio disattivato.");
    }

    @Override
    public boolean verificaStato() {
        // In un caso reale, qui ci sarebbero controlli più complessi
        System.out.println("Stato allarme antincendio: " + (attivo ? "Attivo" : "Non attivo"));
        return attivo;
    }
}
