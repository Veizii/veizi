/*
classe Moto
 */
package classeMoto;

/**
 *
 * @author loris.veizi
 */
public class Moto {

    private String marca;
    private String modello;
    private String colore;
    private Integer cilindrata;
    private Integer marcia;
    private Integer nMarce;
    private Float velocita = 0f;
    private Integer velocitaMax;
    private Integer cavalli;
    private Boolean isAcceso = false;

    /**
     * Costruttore
     */
    public Moto() {
    }

    /**
     * Costruttore parametrizzato
     *
     * @param marca
     * @param modello
     * @param colore
     * @param cilindrata
     * @param marcia
     * @param nMarce
     * @param velocitaMax
     * @param cavalli
     */

    public Moto(String marca, String modello, String colore, Integer cilindrata, Integer marcia, Integer nMarce, Integer velocitaMax, Integer cavalli) {
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
        this.cilindrata = cilindrata;
        this.marcia = marcia;
        this.nMarce = nMarce;
        this.velocitaMax = velocitaMax;
        this.cavalli = cavalli;
    }

    public String getMarca() {
        this.marca = marca;
        return colore;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        this.modello = modello;
        return colore;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getColore() {
        this.colore = colore;
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public Integer getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(Integer cilindrata) {
        this.cilindrata = cilindrata;
    }

    public Integer getMarcia() {
        return marcia;
    }

    public void setMarcia(Integer marcia) {
        this.marcia = marcia;
    }

    public Integer getnMarce() {
        return nMarce;
    }

    public void setnMarce(Integer nMarce) {
        this.nMarce = nMarce;
    }

    public Float getVelocita() {
        return velocita;
    }

    public void setVelocita(Float velocita) {
        this.velocita = velocita;
    }

    public Integer getVelocitaMax() {
        return velocitaMax;
    }

    public void setVelocitaMax(Integer velocitaMax) {
        this.velocitaMax = velocitaMax;
    }

    public Integer getCavalli() {
        return cavalli;
    }

    public void setCavalli(Integer cavalli) {
        this.cavalli = cavalli;
    }

    /**
     * Inserire la marcia desidderata
     *
     * @param marcia
     * @return
     */
    public Boolean cambiaMarcia(Integer marcia) {
        if (marcia == null) {
            return false;
        }

        if (marcia >= -1 && marcia <= nMarce) {
            this.marcia = marcia;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Inserire la velocita desiderata
     *
     * @param velocita
     */
    public void accelera(Float velocita) {
        if (velocita != null) {
            if (velocita >= 0 && velocita <= velocitaMax) {
                this.velocita = velocita;
            }
        }
    }
    public void accendiMotore(Boolean isAcceso){
        this.isAcceso = true;
    }


    public String info() {
        String testo;

        testo = "marca          :   " + this.marca       + "\n"+
                "modello        :   " + this.modello     + "\n"+
                "colore         :   " + this.colore      + "\n"+
                "cilindrata     :   " + this.cilindrata  + "\n"+
                "marcia         :   " + this.marcia      + "\n"+
                "numero marce   :   " + this.nMarce      + "\n"+
                "velocita       :   " + this.velocita    + "\n"+
                "velocitaMax    :   " + this.velocitaMax + "\n"+
                "cavalli        :   " + this.cavalli     + "\n"+
                "motore acceso  :   " + this.isAcceso    + "\n";

        return testo;
    }
}
