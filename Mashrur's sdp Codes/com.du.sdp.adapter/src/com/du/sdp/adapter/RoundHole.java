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
public class RoundHole {
    private double rad;

    public RoundHole() {
    }

    public RoundHole(double rad) {
        this.rad = rad;
    }

    public double getRad() {
        return rad;
    }
    
    public boolean fits(RoundPeg peg) {
        return (boolean) (this.getRad() >= peg.getRad());
    }
    
}
