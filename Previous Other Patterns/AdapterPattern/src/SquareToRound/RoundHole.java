/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SquareToRound;

/**
 *
 * @author musfiq
 */
public class RoundHole {
    
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    
    boolean fits(RoundPeg peg){
        return this.radius>=peg.radius;
    }
    
}
