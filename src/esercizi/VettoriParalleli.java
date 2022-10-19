package esercizi;

import java.util.Scanner;

public class VettoriParalleli {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        Integer numElementi = 2;

        String[] vettNomi = new String[numElementi];
        Integer[] vettEta = new Integer[numElementi];
        String nome;
        Integer eta;

        //caricamento
        for (int i = 0; i < numElementi; i++) {
            System.out.println("inserire il nome: ");
            nome = input.next();

            System.out.println("inserire l'età: ");
            eta = input.nextInt();

            vettNomi[i] = nome;
            vettEta[i] = eta;

        }
        //visualizzazione
        for (int i = 0; i < numElementi; i++) {
            System.out.println(vettNomi[i] + "  " + vettEta[i]);

        }

        //ricerca
        System.out.println("inserire il valore da cercare: ");
        String ricerca = input.next();

        for (int i = 0; i < numElementi; i++) {
            if (ricerca.equalsIgnoreCase(vettNomi[i])) {
                System.out.println(vettNomi[i] + " " + vettEta[i]);

            }

        }
        Integer somma = 0;
        Float media = 0f;

        for (int i = 0; i < numElementi; i++) {
            somma += vettEta[i];
            
            media = (float)somma / (float)numElementi;
            
            System.out.println("media");

        }

    }

}
