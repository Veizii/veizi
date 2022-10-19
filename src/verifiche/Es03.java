/*
 Scrivere un programma che visualizzi i primi n numeri interi dispari utilizzando il ciclo while.
 */
package verifiche;

import java.util.Scanner;

public class Es03 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i=0;
        int n;
        int num=0;
        int dispari;

        System.out.println("Inserisci quanti numeri vuoi visualizzare:");
        n = input.nextInt();
        
        while(i<n){
            dispari=(num*2)+1; /*un numero dispari si ottiene facendo 2n+1*/
            System.out.println("-->"+dispari);
            i++; 
            num++; /*incremento il numero di 1 senno otterei lo stesso numero*/
        }
    }
}
