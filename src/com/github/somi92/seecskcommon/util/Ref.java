/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.somi92.seecskcommon.util;

import java.io.Serializable;

/**
 *
 * @author milos
 */
public class Ref<T> implements Serializable {
    
    private T ref;
    
    public Ref(T initial) {
        ref = initial;
    }
    
    public void set(T value) {
        ref = value;
    }
    
    public T get() {
        return ref;
    }
}
