/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecsk.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author milos
 */
public class Config {
    
    private Properties props;
    private FileInputStream fis;
    private FileOutputStream fos;
    private static Config INSTANCA;
    
    private Config() {
        props = new Properties();
    }
    
    public static Config vratiInstancu() {
        if(INSTANCA == null) {
            INSTANCA = new Config();
        }
        return INSTANCA;
    }
    
    public String vratiVrednost(String kljuc) {
        try {
            fis = new FileInputStream("config.properties");
            props.load(fis);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return props.getProperty(kljuc);
    }
    
    public void postaviVrednost(String kljuc, Object vrednost) {
        try {
            fos = new FileOutputStream("config.properties");
            props.put(kljuc, vrednost);
            props.store(fos, null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
