package eserciziLab;

import java.util.Random;
import java.util.Scanner;

public class Es16 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here

        int numeroElementi = 10, n;
        boolean k = false;
        Integer vettoreInteri[] = new Integer[10];

        Random r = new Random();

        //inserimento
        for (int i = 0; i < numeroElementi; i++) {
            vettoreInteri[i] = r.nextInt(10) + 1;

        }
        //visualizzazione
        for (int i = 0; i < numeroElementi; i++) {
            System.out.println(vettoreInteri[i]);
        }
        //ricerca
        System.out.println("Inserire il valore da cercare: ");
        Integer valore = input.nextInt();
        n=valore;
        for (int i = 0; i < numeroElementi; i++) {
           if (vettoreInteri[i] == valore) {
                System.out.println("Il valore cercato è stato trovato nella posizione n." + i);
                k = true;
            }

        }
        if (k == false) {
            System.out.println("valore inesistente");
        }

    }
}
