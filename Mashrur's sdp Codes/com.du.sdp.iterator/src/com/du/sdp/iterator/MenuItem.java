/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.sdp.iterator;

/**
 *
 * @author mashrur
 */
public class MenuItem {
    private String name;
    private String descrition;
    private boolean vegeterian;
    private double price;

    public MenuItem(String name, String descrition, boolean vegeterian, double price) {
        this.name = name;
        this.descrition = descrition;
        this.vegeterian = vegeterian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescrition() {
        return descrition;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public double getPrice() {
        return price;
    }
    
}
