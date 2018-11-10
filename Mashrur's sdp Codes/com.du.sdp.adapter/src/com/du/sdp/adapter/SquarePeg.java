/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.sdp.adapter;

/**
 *
 * @author mashrur
 */
public class SquarePeg {
    private double width;

    public SquarePeg() {
    }

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
    
    public double getSquare() {
        return (width*width);
    }
    
}
