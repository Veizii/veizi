/*
Scrivere un programma
che, dati in input due numeri, visualizzi, a scelta dell’utente, il risultato
di una delle quattro operazioni fondamentali (addizione, sottrazione,
moltiplicazione e divisione) con i rispettivi simboli. L’operazione deve essere
chiesta in caso si effettui una scelta errata.

 */
package eserciziLab;

import java.util.Scanner;

public class Es09 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double num1,num2,risultato;
        String operazione;
        
        System.out.println("inserisci il primo numero");
        num1 = input.nextDouble();
        System.out.println("inserisci il secondo numero:");
        num2 = input.nextDouble();
        System.out.println("inserisci + per addizione - sottrazione * moltiplicazione / divisione:");
        operazione = input.next();
        switch (operazione) {
            case "+":

                risultato = num1 + num2;
                System.out.println("addizione=" + risultato);
                break;
            case "-":

                risultato = num1 - num2;
                System.out.println("sottrazione=" + risultato);
                break;
            case "*":

                risultato = num1 * num2;
                System.out.println("moltiplicazione=" + risultato);
                break;
            case "/":

                risultato = num1 / num2;
                System.out.println("divisione=" + risultato);
                break;

            default:

                System.out.println("\"operazione errata\"");
                ;
                break;
        }
    }
}
