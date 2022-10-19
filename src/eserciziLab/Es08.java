package eserciziLab;

import java.util.Scanner;

public class Es08 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 5, num, i = 1, mul = 0;

        System.out.println("Inserisci un numero");
        num = input.nextInt();
        while (i <= n) {
            mul = num * i;
            System.out.println("multiplo=" + mul);
            i++;
            
        }
        
    }
}
