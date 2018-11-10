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
public class SquarePegAdapter extends RoundPeg {
    
    SquarePeg peg;


    
    

    public SquarePegAdapter(SquarePeg peg, int radius) {
        super(radius);
        this.peg = peg;
        super.radius=getRadius();
    }

    
    
    @Override
    public double getRadius() {
        double r= peg.getWidth()* Math.sqrt(2)/2;   
        return r; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    

    
    
    
    
}
