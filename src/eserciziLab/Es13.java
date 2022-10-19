/*
Scrivere un programma che visualizzi la tabella pitagorica
10 x 10 mettendo in colonna i numeri. (cicli annidati)
 */
package eserciziLab ;

public class Es13 {

    public static void main(String[] args) {
        // TODO code application logic here
        int prodotto;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                prodotto = i * j;
                if (prodotto < 10) {
                    System.out.print("   ");
                } else if (prodotto < 100) {
                    System.out.print("  ");
                } else {
                    System.out.print(" ");
                }

                System.out.print(prodotto);
            }
            System.out.println();
        }

    }
}
