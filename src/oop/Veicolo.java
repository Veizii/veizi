/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author loris.veizi
 */
public class Veicolo {

    //proprietà
    public int ruote;
    public String telaio;
    public int marcia;
    public boolean isFreniDisco;

    public Veicolo() {
    }

    public Veicolo(int ruote, String telaio, int marcia, boolean isFreniDisco) {
        this.ruote = ruote;
        this.telaio = telaio;
        this.marcia = marcia;
        this.isFreniDisco = isFreniDisco;
    }
    
    
}
