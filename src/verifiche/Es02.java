/*
 Scrivere un programma che, date le lunghezze dei tre lati di un triangolo, determini se si tratta di un triangolo equilatero (tutti i lati uguali), isoscele (due lati uguali) o scaleno (tutti i lati diversi).
 */
package verifiche;

import java.util.Scanner;

public class Es02 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double L1;
        double L2;
        double L3;

        System.out.println("Inserisci lato1:");
        L1 = input.nextDouble();
        System.out.println("Inserisci lato2:");
        L2 = input.nextDouble();
        System.out.println("Inserisci lato3:");
        L3 = input.nextDouble();

        if (L1 == L2 && L2 == L3 && L3 == L1) { /* confronto i tre lati se sono uguali equilatero, altrimenti se ce ne sono 2 uguali isoscele altrimenti scaleno*/
            System.out.println("Triangolo equilatero");
        } else if (L1 == L2 || L2 == L3 || L1 == L3 ) {
            System.out.println("Triangolo isoscele");
        } else {
            System.out.println("Triangolo scaleno");
        }
    }

}
