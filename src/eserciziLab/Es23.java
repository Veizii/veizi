package eserciziLab;

import java.util.Arrays;
import java.util.Random;


public class Es23 {

    public static void main(String[] args) {
        // TODO code application logic here
        int nElementi = 10, temp = 0;

        int[] vettNumeri = new int[nElementi];
        Random r = new Random();
        boolean scambio;
        for (int i = 0; i < nElementi; i++) {
            vettNumeri[i] = r.nextInt(100) + 1;
        }

        /*do {
            scambio = false;
            for (int i = 0; i < vettNumeri.length - 1; i++) {

                if (vettNumeri[i] > vettNumeri[i + 1]) {
                    temp = vettNumeri[i];
                    vettNumeri[i] = vettNumeri[i + 1];
                    vettNumeri[i + 1] = temp;
                    scambio = true;
                }
            }
        } while (scambio == true);
        
        */
        Arrays.sort(vettNumeri);
        System.out.println("Vettore ordinato");
        System.out.println(Arrays.toString(vettNumeri));
    }

}
