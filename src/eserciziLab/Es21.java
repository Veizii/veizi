/*
Scrivere un programma che esegua la ricerca di un dato
in un vettore facendo in modo che la ricerca si fermi al primo elemento trovato.
 */
package eserciziLab;

import java.util.Arrays;
import java.util.Scanner;

public class Es21 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int nElementi;
        System.out.println("inserisci quanti nomi vuoi inserire");
        nElementi=in.nextInt();
        
        String[] vettore = new String[nElementi];
        //caricamento
        for (int i = 0; i < nElementi; i++) {
            System.out.println("inserire il nome n°:"+(i+1));
            vettore[i] = in.next();
        }
        System.out.println(Arrays.toString(vettore));
        //ricerca
        System.out.println("inserire il nome da cercare: ");
        String ricerca = in.next();

        for (int i = 0; i < nElementi; i++) {
            if (ricerca.equalsIgnoreCase(vettore[i])) {
                System.out.println("il nome:" +ricerca+ " " + "è stato trovato nella cella n°:"+i);
                i=nElementi;

            }

        }
    }

}
