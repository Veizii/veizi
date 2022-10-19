/*
Scrivere un programma che generi un vettore di 15 numeri reali casuali tra 1 e 10 e poi trovi e stampi a video i valori: minimo, massimo e la media aritmetica.
 */
package verifiche;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Es08 {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        double media = 0.0f, somma = 0.0f, min = 10000, max = 0.0f;
        Float[] vettNumeri = new Float[15];
        Random r = new Random();
        
        for (int i = 0; i < vettNumeri.length; i++) {
            vettNumeri[i] = r.nextFloat() * 10 + 1;
            
            somma = somma + vettNumeri[i];
            
        }
        for (int i = 0; i < vettNumeri.length; i++) {
            if (vettNumeri[i] < min) {
                min = vettNumeri[i];
                
            } else if (vettNumeri[i] > max) {
                max = vettNumeri[i];
            }
            
        }
        media = somma / vettNumeri.length;
        
        System.out.println(Arrays.toString(vettNumeri));
        System.out.println(String.format("min=" + "%.1f" , min));
        System.out.println(String.format("max=" + "%.1f" , max));
        System.out.println(String.format("media=" + "%.1f" , media));
    }
}
