/*
Scrivere un programma che dati tre vettori paralleli
contenenti nome, cognome e valore del colesterolo di n pazienti. Visualizzare
tutti i pazienti con il colesterolo maggiore o uguale ad un determinato valore
impostato dall’utente. Gli utenti con il valore più basso e più alto di
colesterolo e gli omonimi.
 */
package eserciziLab;

import java.util.Scanner;

public class Es17 {
private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        Integer numElementi = 5;
        Integer valColesterolo;
        
        System.out.println("inserire il valore del colesterolo");
        valColesterolo=input.nextInt();

        String[] vettNomi = new String[numElementi];
        Integer[] vettEta = new Integer[numElementi];
        Integer[] vettCol = new Integer[valColesterolo];
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

            media = (float) somma / (float) numElementi;

            System.out.println("media");

        }

    }

}
