/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotteria;

import java.util.Random;

/**
 *
 * @author gradassi tommaso
 */
public class Estrazione extends Thread {
    // attributi
    private int matrice[];
    private int n;
    private int vincitori[];
    private int numeroVincitori = 3;
    private int numero;
    
    /**
     * 
     * Metodo costruttore
     */   
    public Estrazione() {
        // popolamento matrice numeri estratti
        // inizializzazione array vincitori

    }

    /**
    * 
    * Metodo per visualizzare la matrice dei numeri estratti
    */
    public void stampaMatrice() {
       // stampa matrice dei numeri estratti
    }
    
    /**
    * 
    * Metodo per visualizzare i vincitori dell'estrazione
    */
    public void stampaVincitori() {
        // stampa array dei vincitori
        }

    /**
    * 
    * Metodo per verificare il numero scelto dal giocatore e determinare i vincitori
    */
    public void verifica(int numero, int idGiocatore) {
        
           if(numero==this.numero){
               System.out.println("Complimenti giocatore " + idGiocatore + " hai vinto scegliendo il numero " + numero +"!");
               
           } else {
               System.out.println("Che peccato giocatore " + idGiocatore + " il numero " + numero +" non era vincente!");
           }
    }

    /**
    * 
    * Metodo per eseguire il thread
    */
    public void run() {
        // stampa iniziale
        // estrazione dei numeri
        // stampa matrice
        // stampa finale
    }
}


