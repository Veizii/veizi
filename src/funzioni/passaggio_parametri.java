
package funzioni;

public class passaggio_parametri {

    public static void sommaInt(int n){
        n=n+1;
    }
    
    public static void sommaDouble(double n){
        n=n+1;
    }
    
    public static void parola(String a){
        a="bici";
    }
    public static void VoF(boolean k){
        k=false;
    }
    public static void lettera (char a){
        a='a';
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int n=5;
        char lettera='c';
        String  parola="casa";
        boolean k=true;
        
        sommaInt(n);
        
        System.out.println(n);
        //passaggio sempre per valore
        
        sommaDouble(n);
        
        System.out.println(n);
        //passaggio sempre per valore
        
        parola(parola);
        
        System.out.println(lettera);
        //passaggio sempre per valore
        
        VoF(k);
        System.out.println(k);
        //passaggio sempre per valore
        
        lettera(lettera);
        System.out.println(lettera);
        //passaggio per valore
    }
    
}
