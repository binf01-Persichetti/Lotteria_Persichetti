import java.util.logging.Level;
import java.util.logging.Logger;

public class Lotteria {
    public static void main(String[] args) {
        
        Estrazione e = new Estrazione();
        e.start();

        try {
            e.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        Giocatore g1 = new Giocatore(1, "Mario", e);
        Giocatore g2 = new Giocatore(2, "Luigi", e);
        Giocatore g3 = new Giocatore(3, "Peach", e);

        g1.start();
        g2.start();
        g3.start();

        try {
            g1.join();
            g2.join();
            g3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Lotteria.class.getName()).log(Level.SEVERE, null, ex);
        }

        e.stampaVincitori();

        System.out.println("FINE GIOCO");
    }
}
