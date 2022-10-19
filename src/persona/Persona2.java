package persona;

/**
 *La classe persona indica alcune caratteristiche dell'essere umano
 * @author loris.veizi
 * @version 1.0 del 28/09/22
 */

public class Persona2 {
    public Double altezza;
    public String cognome;
    public String dataDiNascita;
    public String nome;
    public Float  peso;
    /**
     * Costruttore della classe persona senza i parametri per impostare i parametri
     * si possono usare i seguenti metodi:
     * {@link #setAltezza(Double altezza)} <br>
     * {@link #setCognome(String cognome)} <br> {@link #setNome(String nome)}
     * <br> {@link #setPeso(Float peso)} <br>
     * {@link #setDataDiNascita(String dataDiNascita)}
     */
    public Persona2() {
    }
    /**
     *
     * @param altezza
     * @param cognome
     * @param dataDiNascita
     * @param nome
     * @param peso
     */

    public Persona2(Double altezza, String cognome, String dataDiNascita, String nome, Float peso) {
        setAltezza(altezza);
        this.cognome = cognome;
        this.nome = nome;
        this.peso = peso;
        setDataDiNascita(dataDiNascita);
    }
    /**
     * restituisce l'altezza
     *
     * @return altezza
     */

    public Double getAltezza() {
        return altezza;
    }
    /**
     * imposta l'altezza della persona
     * @param altezza
     */

    public void setAltezza(Double altezza) {
        if(altezza!=null){
        if(altezza<=2.0){
        this.altezza = altezza;
        }
      }
    }
    /**
     * restituisce il cognome
     *
     * @return cognome
     */

    public String getCognome() {
        return cognome;
    }
    /**
     * imposta il cognome della persona
     *
     * @param cognome
     */

    public void setCognome(String cognome) {
         if(cognome != null||cognome.length()>1){
              this.cognome = cognome;
         }
         
    }
    /**
    * Restituisce la data di nascita della Persona
    *
    * @return dataDiNascita
    */

    public String getDataDiNascita() {
        return dataDiNascita;
    }
    /**
    * Imposta la data di nascita della Persona
    *
    * @param dataDiNascita Data di nascita
    */

    public void setDataDiNascita(String dataDiNascita) {
       
        Boolean verifica=true;
        String[] splitted = dataDiNascita.split("/");
        int intero[]=new int[splitted.length];
        for(int i=0; i<splitted.length; i++ ){
        intero[i] = Integer.parseInt(splitted[i]);
        }
        for(int i=0; i<splitted.length; i++ ){
            if (i==0){
                if(31<intero[i]){
                verifica=false;
                }
                if(intero[1]==2&&intero[i]>29){
                    verifica=false;
                }
                if(intero[1]==4&&intero[i]==31||intero[1]==6&&intero[i]==31||intero[1]==9&&intero[i]==31||intero[1]==11&&intero[i]==31){
                    verifica=false;
                }          
            }
            if(i==1){
                if(intero[i]>12){
                   verifica=false;
                }              
            }
            if(i==2){
                if(intero[i]<1000){
                verifica=false;
                }
        }
        if(verifica==true){
            this.dataDiNascita = dataDiNascita;
        }
       
    }
     
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null&&nome.length()>3){
            this.nome = nome;
    }
}

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
    if(peso!=null&&peso>20){
        this.peso = peso;
      }
    }
    public String info(){
        String testo="";
        testo="Cognome        : " + this.cognome       + "\n"
             +"Nome           : " + this.nome          + "\n"
             +"Altezza        : " + this.altezza       + "\n"
             +"peso           : " + this.peso          + "\n"
             +"data di nascita: " + this.dataDiNascita + "\n";
        return testo;
    }
 
}