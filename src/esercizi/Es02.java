package esercizi;

import java.util.Scanner;

public class Es02 {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int ora;
        int min;
        int sec;
        int tot;
        
        System.out.println("Inserisci l'ora:");
        ora = input.nextInt();
        
        System.out.println("Inserisci i minuti:");
        min = input.nextInt();
        
        System.out.println("Inserisci i secondi:");
        sec = input.nextInt();
        
        tot = ora*3600+min*60+sec;
        
        System.out.println("totale:" + tot);
    }
    
}
