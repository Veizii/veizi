/*
 Scrivere un programma che, dato un numero intero,
visualizzi tutti i suoi divisori e il numero di tali divisori. FOR
 */
package eserciziLab;

import java.util.Scanner;

public class Es12 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int num, risultato, resto, ndivisori = 0;
        
        System.out.println("inserisci numero  ");
        num = input.nextInt();
        
        for (int i=1; i<=num; i=i+1) {
     
            if (num % i== 0) {
                ndivisori = ndivisori + 1;
                System.out.println("divisori:" + i);
            }
        }
        System.out.println("I divisori per questo numero sono:" + ndivisori);
    }
}
