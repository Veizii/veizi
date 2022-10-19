package esercizi;

import java.util.Scanner;

public class Es04 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        int resto;
        int doppio;
        int triplo;

        System.out.println("Inserisci un numero:");
        num = input.nextInt();

        resto = num % 2;

        if (resto == 0) {
            System.out.println("numero pari");
            doppio = num * 2;
            System.out.println("doppio=" + doppio);
        } else {
            System.out.println("numero dispari");
            triplo = num * 3;
            System.out.println("triplo=" + triplo);
        }

    }
}
