import java.util.Random;

public class Estrazione extends Thread {
    
    private int[][] numeri = new int[10][10];
    private Random random = new Random();
    private int[] vincitori = new int[3];
    private int numeroVincitori = 0;

    public Estrazione() {
        
    }

    public void stampaMatrice() {
        System.out.println("Numeri estratti:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(numeri[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void stampaVincitori() {
        System.out.println("Giocatori vincitori:");
        if (numeroVincitori == 0) {
            System.out.println("Nessun vincitore in questa estrazione.");
        } else {
            for (int i = 0; i < numeroVincitori; i++) {
                System.out.println("Giocatore " + vincitori[i] + " ha vinto!");
            }
        }
    }

    public void verifica(int numero, int idGiocatore) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (numero == numeri[i][j]) {
                    System.out.println("Giocatore " + idGiocatore + " hai scelto il numero " + numero + " e hai vinto!");
                    vincitori[numeroVincitori++] = idGiocatore;
                    return;
                }
            }
        }
        System.out.println("Giocatore " + idGiocatore + " hai perso!");
    }

    public void run() {
        System.out.println("INIZIO ESTRAZIONE!");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                numeri[i][j] = random.nextInt(1000);
            }
        }

        stampaMatrice();

        System.out.println("FINE ESTRAZIONE!");
    }
}
