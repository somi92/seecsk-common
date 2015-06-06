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
public class OdgovorObjekat implements Serializable {
    
    private Object podaci;
    private int statusOperacije;
    private Exception greska;

    public OdgovorObjekat() {
    }

    public OdgovorObjekat(Object podaci, int statusOperacije, Exception greska) {
        this.podaci = podaci;
        this.statusOperacije = statusOperacije;
        this.greska = greska;
    }

    public <T> T getPodaci() {
        return (T) podaci;
    }

    public <T> void setPodaci(T podaci) {
        this.podaci = podaci;
    }

    public int getStatusOperacije() {
        return statusOperacije;
    }

    public void setStatusOperacije(int statusOperacije) {
        this.statusOperacije = statusOperacije;
    }

    public Exception getGreska() {
        return greska;
    }

    public void setGreska(Exception greska) {
        this.greska = greska;
    }
}
