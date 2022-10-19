package esercizi;

import java.util.Scanner;

public class Es01 {

    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int doppio;
        
        System.out.println("Inserire il numero da raddopiare:");
        numero = input.nextInt();
        
        doppio= numero*2;
        
        //String doppioTesto = String.valueOf(doppio);
        
        System.out.println("numero raddoppiato:" + doppio);
    }
    
}
