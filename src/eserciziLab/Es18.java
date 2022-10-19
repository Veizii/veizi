/*
Scrivere un programma che, dati 6 numeri interi che rappresentano: giorno, mese e anno di due date, 
stabilisca se le date sono valide e ne calcoli la differenza in anni.
 */
package eserciziLab;

import java.util.Scanner;

public class Es18 {

    public static Scanner in = new Scanner(System.in);

    public static boolean Data(int giorno, int mese, int anno) {
        boolean corretta = true;
        switch (mese) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (giorno > 31) {
                    corretta = false;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (giorno > 30) {
                    corretta = false;
                }
                break;
            case 2:
                if (giorno > 29) {
                    corretta = false;
                }
                break;

        }
        return corretta;
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
        int giorno, giorno1, mese, mese1, anno, anno1, diff = 0;
        boolean corretta;

        System.out.println("Prima data");
        System.out.println("Inserire il giorno");
        giorno = in.nextInt();

        System.out.println("Inserire il mese");
        mese = in.nextInt();

        System.out.println("Inserire l'anno");
        anno = in.nextInt();

        System.out.println("Seconda data");
        System.out.println("Inserire il giorno");
        giorno1 = in.nextInt();

        System.out.println("Inserire il mese");
        mese1 = in.nextInt();

        System.out.println("Inserire l'anno");
        anno1 = in.nextInt();

        if (Data(giorno, mese, anno) && Data(giorno1, mese1, anno1)) {
            System.out.println("date corrette");
        } else {
            System.out.println("date non corrette");
        }

        if (anno > anno1) {
            diff = anno - anno1;
        } else {
            diff = anno1 - anno;
        }
        System.out.println("la differenza in anni è:" + diff);
    }

}
