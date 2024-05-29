import java.util.ArrayList;
import java.util.List;

public class GestioneSicurezza {
    private List<DispositivoDiSicurezza> dispositivi;

    public GestioneSicurezza() {
        dispositivi = new ArrayList<>();
    }

    public void aggiungiDispositivo(DispositivoDiSicurezza dispositivo) {
        dispositivi.add(dispositivo);
    }

    public void verificaTuttiIDispositivi() {
        for (DispositivoDiSicurezza dispositivo : dispositivi) {
            dispositivo.verificaStato();
        }
    }

    public static void main(String[] args) {
        GestioneSicurezza gestione = new GestioneSicurezza();
        
        Estintore estintore = new Estintore(6.0);
        AllarmeAntincendio allarme = new AllarmeAntincendio();
        SistemaDiVentilazioneDEmergenza ventilazione = new SistemaDiVentilazioneDEmergenza();
        KitDiProntoSoccorso kit = new KitDiProntoSoccorso(true);
        
        gestione.aggiungiDispositivo(estintore);
        gestione.aggiungiDispositivo(allarme);
        gestione.aggiungiDispositivo(ventilazione);
        gestione.aggiungiDispositivo(kit);
        
        gestione.verificaTuttiIDispositivi();
    }
}
