package esercizi;

import java.util.Scanner;

public class Es03 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int eta1;
        int eta2;
        int eta3;
        double media;

        System.out.println("Inserisci eta1:");
        eta1 = input.nextInt();

        System.out.println("Inserisci eta2:");
        eta2 = input.nextInt();

        System.out.println("Inserisci eta3:");
        eta3 = input.nextInt();

        media = (double)(eta1 + eta2 + eta3) / 3;

        System.out.println("media:" + media);
    }

}
