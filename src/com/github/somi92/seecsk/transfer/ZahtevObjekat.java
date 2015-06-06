/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.transfer;

import java.io.Serializable;

/**
 *
 * @author milos
 */
public class ZahtevObjekat implements Serializable {
    
    private String imeOperacije;
    private Object parametar;

    public ZahtevObjekat() {
    }

    public ZahtevObjekat(String sifraOperacije, Object parametar) {
        this.imeOperacije = sifraOperacije;
        this.parametar = parametar;
    }
    
    public String getImeOperacije() {
        return imeOperacije;
    }

    public void setImeOperacije(String imeOperacije) {
        this.imeOperacije = imeOperacije;
    }

    public <T> T getParametar() {
        return (T) parametar;
    }

    public <T> void setParametar(T parametar) {
        this.parametar = parametar;
    }
}
