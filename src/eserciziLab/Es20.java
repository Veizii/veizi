package eserciziLab;

import java.util.Random;
import java.util.Scanner;

public class Es20 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int nElementi = 10, min, temp = 0;

        int[] vettNumeri = new int[nElementi];
        Random r = new Random();
        
        System.out.println("Numeri:");
        
        for (int i = 0; i < nElementi; i++) {
            vettNumeri[i] = r.nextInt(100) + 1;
            System.out.println(vettNumeri[i]);
        }
        System.out.println("");
        System.out.println("Ordine Crescente:");
        
        for (int i = 0; i < nElementi; i++) {
            min=i;
            for (int j = i + 1; j < nElementi; j++) {
                if (vettNumeri[j] <= vettNumeri[min]) {
                    min = j;
                }
            }
            temp = vettNumeri[min];
            vettNumeri[min] = vettNumeri[i];
            vettNumeri[i] = temp;
            System.out.println(vettNumeri[i]);
        }

    }
}
