import java.util.ArrayList;
import java.util.Scanner;

public class NegozioDolci {
    static class Dolce {
        private String nome;
        private double prezzo;

        public Dolce(String nome, double prezzo) {
            this.nome = nome;
            this.prezzo = prezzo;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPrezzo() {
            return prezzo;
        }

        public void setPrezzo(double prezzo) {
            this.prezzo = prezzo;
        }

        @Override
        public String toString() {
            return "Dolce{" +
                    "nome='" + nome + '\'' +
                    ", prezzo=" + prezzo +
                    '}';
        }
    }

    static class Cliente {
        private String idCliente;
        private String nome;
        private ArrayList<Dolce> dolciAcquistati;

        public Cliente(String idCliente, String nome) {
            this.idCliente = idCliente;
            this.nome = nome;
            this.dolciAcquistati = new ArrayList<>();
        }

        public String getIdCliente() {
            return idCliente;
        }

        public void setIdCliente(String idCliente) {
            this.idCliente = idCliente;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void acquistaDolce(Dolce dolce) {
            dolciAcquistati.add(dolce);
        }

        public void elencoAcquisti() {
            System.out.println("Dolci acquistati da " + nome + ":");
            for (Dolce dolce : dolciAcquistati) {
                System.out.println(dolce);
            }
        }
    }

    private ArrayList<Dolce> dolciDisponibili;
    private ArrayList<Cliente> clienti;

    public NegozioDolci() {
        this.dolciDisponibili = new ArrayList<>();
        this.clienti = new ArrayList<>();
    }

    public void aggiungiDolce(Dolce dolce) {
        dolciDisponibili.add(dolce);
    }

    public void rimuoviDolce(Dolce dolce) {
        dolciDisponibili.remove(dolce);
    }

    public void aggiungiCliente(Cliente cliente) {
        clienti.add(cliente);
    }

    public Cliente trovaCliente(String idCliente) {
        for (Cliente cliente : clienti) {
            if (cliente.getIdCliente().equals(idCliente)) {
                return cliente;
            }
        }
        return null;
    }

    public void gestisciAcquisto(String idCliente, Dolce dolce) {
        Cliente cliente = trovaCliente(idCliente);
        if (cliente != null) {
            cliente.acquistaDolce(dolce);
        } else {
            System.out.println("Cliente non trovato.");
        }
    }

    public static void main(String[] args) {
        NegozioDolci negozio = new NegozioDolci();

        // Creazione dolci
        Dolce dolce1 = new Dolce("Tiramisu", 3.50);
        Dolce dolce2 = new Dolce("Cannolo", 2.00);
        Dolce dolce3 = new Dolce("Sfogliatella", 2.50);

        // Aggiunta dolci al negozio
        negozio.aggiungiDolce(dolce1);
        negozio.aggiungiDolce(dolce2);
        negozio.aggiungiDolce(dolce3);

        // Creazione cliente
        Cliente cliente1 = new Cliente("1", "Mario Rossi");

        // Aggiunta cliente al negozio
        negozio.aggiungiCliente(cliente1);

        // Gestione acquisti
        negozio.gestisciAcquisto("1", dolce1);
        negozio.gestisciAcquisto("1", dolce3);

        // Stampa elenco acquisti del cliente
        cliente1.elencoAcquisti();
    }
}
