package persona;

/**
 * La classe Persona definisce alcune caratteristiche comuni di un essere umano
 *
 * @author Loris Veizi 4INC
 */
public class Persona {
    public Double altezza;
    public String cognome;
    public String dataDiNascita;
    public String nome;
    public Float  peso;
    
    /**
     * Costruttore della classe Persona senza parametri
     * Per impostare i parametri si possono usare i seguenti metodi:
     * setAltezza(Double altezza)
     * setCognome(String cognome)
     * setDataDiNascita(String dataDiNascita)
     * setNome(String nome)
     * setCognome(String cognome)
     */
    public Persona() {
    }
    
    /**
     * Costruttore parametrizzato
     * @param altezza
     * @param cognome
     * @param dataDiNascita
     * @param nome
     * @param peso 
     */
    public Persona(Double altezza, String cognome, String dataDiNascita, String nome, Float peso) {
        this.altezza = altezza;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.nome = nome;
        this.peso = peso;
    }
    
    /**
     * Restituisce l'altezza della Persona
     * 
     * @return altezza
     */
    public Double getAltezza() {
        return this.altezza;
    }
    
    /**
     * Imposta l'altezza della persona
     * @param altezza 
     */
    public void setAltezza(Double altezza) {
        this.altezza = altezza;
    }
    
    /**
     * Restituisce il cognome della persona
     * 
     * @return cognome
     */
    public String getCognome() {
        return this.cognome;
    }
    
    /**
     * Imposta il cognome della persona
     * 
     * @param cognome 
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    /**
     * Restituisce la data di nascita della Persona
     * 
     * @return 
     */
    public String getDataDiNascita() {
        return this.dataDiNascita;
    }
    /**
     * Imposta la data di nascita della persona
     * @param dataDiNascita 
     */
    
    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
    
    /**
     * Restituisce il nome della persona
     * 
     * @return nome
     */
    public String getNome() {
        return this.nome;
    }
    
    /**
     * Imposta il nome della persona
     * 
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /**
     * Restituisce il peso della persona
     * 
     * @return persona
     */
    public Float getPeso() {
        return this.peso;
    }
    /**
     * Imposta il peso della persona
     * 
     * @param peso 
     */
    public void setPeso(Float peso) {
        this.peso = peso;
    }
    
    /**
     * Restituisce le caratteristiche della persona
     * 
     * @return Riepilogo caratteristiche
     */
    public String info(){
        String testo="";
        
        testo= "Altezza        : " +this.altezza       +"\n"+
               "Cognome        : " +this.cognome       +"\n"+
               "Data di nascita: " +this.dataDiNascita +"\n"+
               "Nome           : " +this.nome       +"\n"+
               "Peso           : " +this.peso          +"\n";
               
        
        return testo;
    }
          
    
}
