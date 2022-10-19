package eserciziLab;

import java.util.Scanner;

public class Es07 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int max = 0, min = 10000, i = 0, num, n = 10;

        while (i < n) {
            System.out.println("Inserisci un numero");
            num = input.nextInt();
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
            i++;
        }
        System.out.println("min=" + min);
        System.out.println("max=" + max);
        
    }

}
