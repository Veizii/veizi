/*
Chiedere all’utente tre numeri interi che rappresentano rispettivamente: giorno, mese e anno di una data. Verificare che la data inserita sia valida sapendo, per semplificazione, che un anno è bisestile quando è divisibile per 4.
 */
package verifiche;

import java.util.Scanner;

public class Es05 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int giorno, mese, anno;
        boolean valida = false;

        System.out.print("inserire il giorno: ");
        giorno = input.nextInt();

        System.out.print("inserire il mese: ");
        mese = input.nextInt();

        System.out.print("inserire il anno: ");
        anno = input.nextInt();

        if (anno >= 1000 && anno <= 9999) {
            switch (mese) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (giorno >= 1 && giorno <= 31) {
                        valida = true;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (giorno >= 1 && giorno <= 30) {
                        valida = true;
                    }
                    break;
                case 2:
                    if (anno % 400 == 0 || (anno % 4 == 0 && anno % 100 != 0)) {
                        if (giorno >= 1 && giorno <= 29) {
                            valida = true;
                        }
                    } else if (giorno >= 1 && giorno <= 28) {
                        valida = true;
                    }
            }

        }
        if (valida) {
            System.out.println("data corretta");
        } else {
            System.out.println("data non corretta");
        }
    }
}
