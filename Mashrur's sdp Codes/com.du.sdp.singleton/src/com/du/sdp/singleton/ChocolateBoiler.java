/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.sdp.singleton;

/**
 *
 * @author mashrur
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    
    public static ChocolateBoiler getInstance() {
        if(uniqueInstance == null) {
            synchronized(ChocolateBoiler.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler();
                }
            }
        }
        return uniqueInstance;
    }
    
    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
        }
    }
    
    public void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
        }
    }
    
    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }
    
    public boolean isEmpty() {
        return empty;
    }
    
    public boolean isBoiled() {
        return boiled;
    }
    
    public String toString() {
        return "Empty: " + isEmpty() + " Boiled: " + isBoiled();
    }
    
}
