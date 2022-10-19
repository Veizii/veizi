/*
Scrivere un programma che esegua la ricerca binaria in
un vettore di interi.
 */
package eserciziLab;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Es22 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int nElementi = 10, min, temp = 0, inizio = 0, fine = nElementi - 1, centro, ricerca, cella = 0;
        boolean trovato = false;
        int[] vettNumeri = new int[nElementi];
        Random r = new Random();

        for (int i = 0; i < nElementi; i++) {
            vettNumeri[i] = r.nextInt(100) + 1;
        }

        Arrays.sort(vettNumeri);
        System.out.println("Vettore ordinato");
        System.out.println(Arrays.toString(vettNumeri));

        System.out.println("inserisci il valore da cercare");
        ricerca = in.nextInt();
        for (int i = 0; i < nElementi; i++) {
            centro = (inizio + fine) / 2;
            if (vettNumeri[centro] == ricerca) {
                cella = centro;
                trovato = true;
            } else if (ricerca > vettNumeri[centro]) {
                inizio = centro + 1;
            } else {
                fine = centro - 1;
            }
        }
        if (trovato) {
            System.out.println("Il valore da cercare è stato trovato nella cella n°:" + cella);
        }else{
            System.out.println("Valore non trovato!");
        }

    }
}
