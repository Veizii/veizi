package eserciziLab;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Es19 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int m, n;
        System.out.println("inserire quante parole vuoi");
        n = in.nextInt();
        System.out.println("inserire la lunghezza");
        m = in.nextInt();
        String[] parola = new String[n];
        String[] inverso = new String[n];
        char[] carattere = new char[m];
        Random random = new Random();

        System.out.println("");
        //generazione parole
        for (int i = 0; i < parola.length; i++) {
            for (int j = 0; j < carattere.length; j++) {
                carattere[j] = (char) (random.nextInt(26) + 'a');
                parola[i] = new String(carattere);
            }
        }
        System.out.println("Parole:");
        System.out.println(Arrays.toString(parola));
        //salvataggio in ordine inverso
        for (int i = 0; i < inverso.length; i++) {
            inverso[i] = parola[(parola.length - 1)-i];
            
        }
        System.out.println("");

        System.out.println("Vettore in senso inverso:");
        System.out.println(Arrays.toString(inverso));
    }

}
