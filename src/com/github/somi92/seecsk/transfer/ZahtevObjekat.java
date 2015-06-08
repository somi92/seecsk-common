/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.transfer;

import com.github.somi92.seecsk.domain.Uplata;
import com.github.somi92.seecsk.util.SistemskeOperacije;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author milos
 */
public class ZahtevObjekat implements Serializable {
    
    private SistemskeOperacije sistemskaOperacija;
    private Object parametar;
    private List<String> kriterijumPretrage;
    private boolean ucitajListe;
    private List<Uplata> uplateZaBrisanje;

    public ZahtevObjekat() {
    }

    public ZahtevObjekat(SistemskeOperacije so, Object parametar) {
        this.sistemskaOperacija = so;
        this.parametar = parametar;
    }
    
    public SistemskeOperacije getSistemskaOperacija() {
        return sistemskaOperacija;
    }

    public void setSistemskaOperacija(SistemskeOperacije sistemskaOperacija) {
        this.sistemskaOperacija = sistemskaOperacija;
    }

    public <T> T getParametar() {
        return (T) parametar;
    }

    public <T> void setParametar(T parametar) {
        this.parametar = parametar;
    }

    public List<String> getKriterijumPretrage() {
        return kriterijumPretrage;
    }

    public void setKriterijumPretrage(List<String> kriterijumPretrage) {
        this.kriterijumPretrage = kriterijumPretrage;
    }

    public boolean isUcitajListe() {
        return ucitajListe;
    }

    public void setUcitajListe(boolean ucitajListe) {
        this.ucitajListe = ucitajListe;
    }

    public List<Uplata> getUplateZaBrisanje() {
        return uplateZaBrisanje;
    }

    public void setUplateZaBrisanje(List<Uplata> uplateZaBrisanje) {
        this.uplateZaBrisanje = uplateZaBrisanje;
    }

    @Override
    public String toString() {
        return "ZahtevObjekat{" + "sistemskaOperacija=" + sistemskaOperacija + ", parametar=" + parametar + '}';
    }
    
}
