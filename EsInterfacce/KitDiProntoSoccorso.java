public class KitDiProntoSoccorso implements DispositivoDiSicurezza {
    private boolean attivo;
    private boolean medicinaliValidi;

    public KitDiProntoSoccorso(boolean medicinaliValidi) {
        this.medicinaliValidi = medicinaliValidi;
        this.attivo = false;
    }

    @Override
    public void attiva() {
        attivo = true;
        System.out.println("Kit di pronto soccorso attivato.");
    }

    @Override
    public void disattiva() {
        attivo = false;
        System.out.println("Kit di pronto soccorso disattivato.");
    }

    @Override
    public boolean verificaStato() {
        System.out.println("Stato kit di pronto soccorso: " + (medicinaliValidi ? "Medicinali validi" : "Medicinali scaduti"));
        return medicinaliValidi;
    }

    public boolean isMedicinaliValidi() {
        return medicinaliValidi;
    }

    public void setMedicinaliValidi(boolean medicinaliValidi) {
        this.medicinaliValidi = medicinaliValidi;
    }
}
