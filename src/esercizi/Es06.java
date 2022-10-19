package esercizi;

import java.util.Scanner;

public class Es06 {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int consumo;
        float costo;

        System.out.println("Inserisci il consumo:");
        consumo = input.nextInt();

        if (consumo > 100) {
            costo = (float) (100 * 2.5) + ((consumo - 100) * 4) + 20;

        }else{
           costo = (float) (consumo * 2.5) + 20;   
    }
        System.out.println("il costo è:"+costo);
}

}