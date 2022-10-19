package eserciziLab;

import java.util.Scanner;

public class Es06 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int max = 0, min = 10000, med = 0, i = 0, num, n = 3;

        while (i < n) {
            System.out.println("Inserisci un numero");
            num = input.nextInt();
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            } else {
                med = num;
            }

            i++;
        }
        System.out.println("ordine crescente");
        System.out.println(min);
        System.out.println(med);
        System.out.println(max);

        System.out.println("ordine decrescente");
        System.out.println(max);
        System.out.println(med);
        System.out.println(min);
    }
}
