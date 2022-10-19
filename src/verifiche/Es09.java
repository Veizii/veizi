package verifiche;

import java.util.Arrays;
import java.util.Random;

public class Es09 {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeri = new int[10];
        int temp;
        Random r = new Random();
        for (int i = 0; i < numeri.length; i++) {
            numeri[i] = r.nextInt(100) + 1;
        }
        System.out.println("Vettore:");
        System.out.println(Arrays.toString(numeri));
        for (int i = 0; i < numeri.length - 1; i++) {
            for (int j = i + 1; j < numeri.length; j++) {
                if (numeri[i] > numeri[j]) {
                    temp = numeri[i];
                    numeri[i] = numeri[j];
                    numeri[j] = temp;
                }
            }
        }
        System.out.println("Vettore in ordine:");
        System.out.println(Arrays.toString(numeri));
    }

}
