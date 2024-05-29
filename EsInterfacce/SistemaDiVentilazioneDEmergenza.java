public class SistemaDiVentilazioneDEmergenza implements DispositivoDiSicurezza {
    private boolean attivo;

    public SistemaDiVentilazioneDEmergenza() {
        this.attivo = false;
    }

    @Override
    public void attiva() {
        attivo = true;
        System.out.println("Sistema di ventilazione d'emergenza attivato.");
    }

    @Override
    public void disattiva() {
        attivo = false;
        System.out.println("Sistema di ventilazione d'emergenza disattivato.");
    }

    @Override
    public boolean verificaStato() {
        // In un caso reale, qui ci sarebbero controlli più complessi
        System.out.println("Stato sistema di ventilazione d'emergenza: " + (attivo ? "Funzionante" : "Non funzionante"));
        return attivo;
    }
}
