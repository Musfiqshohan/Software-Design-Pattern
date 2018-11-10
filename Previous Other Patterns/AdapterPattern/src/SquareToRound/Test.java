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
public class Test {
    
    
    public static void main(String[] args) {
        
        RoundHole rh= new RoundHole(5.0);
        
        SquarePeg sp= new SquarePeg(20);
        
        SquarePegAdapter sa= new SquarePegAdapter(sp, 0);
        
        System.out.println(rh.fits(sa));
        
        
        
        
    }
    
}
