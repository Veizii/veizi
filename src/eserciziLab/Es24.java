package eserciziLab;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Es24 {

    public static void caricaVettore(int[] vett, int n) {
        int vettore[] = new int[10];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            vett[i] = r.nextInt(100) + 1;
        }
    }

    public static void visualizzaVettore(int vett[]) {
        System.out.print(Arrays.toString(vett));
    }

    public static void ordinaVettore(int vett[], int n) {
        int min, temp;
        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (vett[j] < vett[min]) {
                    min = j;
                }
            }
            temp = vett[min];
            vett[min] = vett[i];
            vett[i] = temp;
        }

    }

    public static boolean ricerca(int vett[], int n, int ricerca) {
        int i, cella = 0;
        boolean trovato = false;
        for (i = 0; i < n; i++) {
            if (vett[i] == ricerca) {
                cella = i;
                i = n;
                trovato = true;
            }
        }
        return trovato;
    }

    public static int cercaElemento(int vett[], int n, int ricerca) {
        int i, cella = 0;
        for (i = 0; i < ricerca; i++) {
            if (vett[i] == ricerca) {
                cella = i;
                i = ricerca;
            }
        }
        return cella;
    }

    public static Scanner in = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        int nElementi, valore, cella;

        System.out.println("Inserire il n° di elementi del vettore: ");
        nElementi = in.nextInt();

        int vettNumeri[] = new int[nElementi];
        caricaVettore(vettNumeri, nElementi);
        ordinaVettore(vettNumeri, nElementi);
        visualizzaVettore(vettNumeri);

        System.out.println("");
        System.out.println("Inserire valore da cercare: ");
        valore = in.nextInt();

        if (ricerca(vettNumeri, nElementi, valore)) {
            System.out.println("Valore trovato nella cella  n°" +(cercaElemento(vettNumeri, nElementi, valore)+1));
        } else {
            System.out.println("Valore non trovato");
        }
        
    }
}
