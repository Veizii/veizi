package esercizi;

import java.util.Scanner;

public class Es05 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int giorno;
        int mese;
        int anno;

        System.out.println("Inserisci un giorno:");
        giorno = input.nextInt();

        System.out.println("Inserisci un mese:");
        mese = input.nextInt();

        System.out.println("Inserisci un anno:");
        anno = input.nextInt();

        if (giorno > 0 && giorno < 31) {
            if (mese > 0 && mese < 13) {
                if (anno > 0 && anno < 2022) {
                    System.out.println("data valida");
                } else {
                    System.out.println("anno invalido");
                }
                    
                     System.out.println("mese invalido");
                }
        
        }
    }
}