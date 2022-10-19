/*
  Scrivere un programma che dato un vettore di n
elementi di tipo stringa, sia caricato con testo di m caratteri casuali.
 */
package eserciziLab;

import java.util.Scanner;

public class Es15 {
public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int nElementi;
        System.out.println("quante parole vuoi?");
        nElementi=in.nextInt();
        String[] vettParole = new String[nElementi];
        
        for (int i=0;i<nElementi;i++){
            System.out.println("inserisci la parola");
            vettParole[i]=in.next();  
        }
        System.out.println();
        for (int i=0;i<nElementi;i++){
            System.out.println(vettParole[i]); 
            
        }
        System.out.println();
        for (int a=nElementi-1;a<nElementi;a--){
           System.out.println(vettParole[a]);  
        }
        
    }
}
