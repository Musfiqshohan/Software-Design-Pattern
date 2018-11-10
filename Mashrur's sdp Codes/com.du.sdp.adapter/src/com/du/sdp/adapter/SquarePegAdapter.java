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
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }
    
    @Override
    public double getRad() {
        double ret;
        ret = Math.sqrt(peg.getSquare()/2.0f);
        return ret;
    }
    
}
