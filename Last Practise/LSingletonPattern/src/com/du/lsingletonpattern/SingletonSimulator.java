/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.lsingletonpattern;

/**
 *
 * @author musfiq
 */
public class SingletonSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        ChocolateBoiler x= ChocolateBoiler.getInstance();
        ChocolateBoiler y= ChocolateBoiler.getInstance();
            
        System.out.println("1st server");
        x.fill();
        y.fill();
        x.boil();
        y.boil();
        x.drain();
        y.drain();
        
        System.out.println("2nd server");
        
        y.fill();
        x.fill();
        y.boil();
        x.boil();
        y.drain();
        x.drain();
        
        
        
    }
    
}
