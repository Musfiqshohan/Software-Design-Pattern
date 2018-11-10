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
public class Main {

    public static void main(String[] args) {
        ChocolateBoiler x = ChocolateBoiler.getInstance();
        ChocolateBoiler y = ChocolateBoiler.getInstance();
        
        System.out.println(x);
        
        x.fill();
        y.fill();
        x.boil();
        x.drain();
        
        System.out.println(x);
        
        y.fill();
        x.drain();
        y.boil();
        y.drain();
        
        System.out.println(y);
        
    }
}
