import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Giocatore extends Thread{
    // attributi
    private int idGiocatore;
    private String nome;
    private Estrazione estrazione;
    private Random random = new Random();

    public Giocatore(int idGiocatore, String nome, Estrazione estrazione) {
        this.idGiocatore = idGiocatore;
        this.nome = nome;
        this.estrazione = estrazione;
    }

    public void run() {
        System.out.println("il giocatore:"+ idGiocatore + " INIZIO");
        int numeroScelto = random.nextInt(0,1000);
        for(int i = 3; i > 0; i--){
            System.out.println(i);
            try {
                this.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Giocatore.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        estrazione.verifica(numeroScelto, idGiocatore);
        System.out.println("Giocatore ID:"+idGiocatore+" ho verificato il numero - FINE");

    }
}