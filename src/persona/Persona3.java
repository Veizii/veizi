package persona;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * La classe persona indica alcune caratteristiche dell'essere umano
 *
 * @author loris.veizi
 * @version 1.0 del 28/09/22
 */
public class Persona3 {

    public Double altezza;
    public String cognome;
    public String dataDiNascita;
    public String nome;
    public Float peso;

    /**
     * Costruttore della classe persona senza i parametri per impostare i
     * parametri si possono usare i seguenti metodi:
     * {@link #setAltezza(Double altezza)} <br>
     * {@link #setCognome(String cognome)} <br> {@link #setNome(String nome)}
     * <br> {@link #setPeso(Float peso)} <br>
     * {@link #setDataDiNascita(String dataDiNascita)}
     */
    public Persona3() {
    }

    /**
     *
     * @param altezza
     * @param cognome
     * @param dataDiNascita
     * @param nome
     * @param peso
     * @param eta
     */

    public Persona3(Double altezza, String cognome, String dataDiNascita, String nome, Float peso) {
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
     *
     * @param altezza
     */

    public void setAltezza(Double altezza) {
        if (altezza != null) {
            if (altezza <= 2.0) {
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
        if (cognome != null || cognome.length() > 1) {
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

        Boolean verifica = true;
        String[] splitted = dataDiNascita.split("/");
        int v[] = new int[splitted.length];
        for (int i = 0; i < splitted.length; i++) {
            v[i] = Integer.parseInt(splitted[i]);
        }
        for (int i = 0; i < splitted.length; i++) {
            if (i == 0) {
                if (31 < v[i]) {
                    verifica = false;
                }
                if (v[1] == 2 && v[i] > 29) {
                    verifica = false;
                }
                if (v[1] == 4 && v[i] == 31 || v[1] == 6 && v[i] == 31 || v[1] == 9 && v[i] == 31 || v[1] == 11 && v[i] == 31) {
                    verifica = false;
                }
            }
            if (i == 1) {
                if (v[i] > 12) {
                    verifica = false;
                }
            }
            if (i == 2) {
                if (v[i] < 1000) {
                    verifica = false;
                }
            }
            if (verifica == true) {
                this.dataDiNascita = dataDiNascita;
            }

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && nome.length() > 3) {
            this.nome = nome;
        }
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        if (peso != null && peso > 20) {
            this.peso = peso;
        }
    }


    public Integer calcolaEta() {
        int giorno = 0,mese = 0,anno = 0,giornoCorrente,meseCorrente,annoCorrente,eta;
        String[] splitted = dataDiNascita.split("/");
        int v[] = new int[splitted.length];

        ZonedDateTime dataCorrente = ZonedDateTime.now();
        
        
        v[0]=giorno;
        v[1]=mese;
        v[2]=anno;
        
        giornoCorrente=dataCorrente.getDayOfMonth();
        meseCorrente=dataCorrente.getMonthValue();
        annoCorrente=dataCorrente.getYear();
        
        eta=annoCorrente-anno;
        
        return eta;
        
    }

    public String info() {
        String testo = "";
        testo = "Cognome        : " + this.cognome + "\n"
                + "Nome           : " + this.nome + "\n"
                + "Altezza        : " + this.altezza + "\n"
                + "peso           : " + this.peso + "\n"
                + "data di nascita: " + this.dataDiNascita + "\n";
        return testo;
    }

}
