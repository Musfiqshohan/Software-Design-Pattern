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
public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(3);
        RoundPeg rpeg = new RoundPeg(5);
        
        if(hole.fits(rpeg)) {
            System.out.println("Round peg of radius " + rpeg.getRad() + " fits round hole of radius " + hole.getRad());
        }
        else {
            System.out.println("Round peg of radius " + rpeg.getRad() + " doesnot fit round hole of radius " + hole.getRad());
        }
        
        SquarePeg peg1 = new SquarePeg(4);
        SquarePegAdapter pegAdap = new SquarePegAdapter(peg1);
        
        if(hole.fits(pegAdap)) {
            System.out.println("Square peg of width " + peg1.getWidth() + " can fit a hole of radius " + hole.getRad());
        }
        else {
            System.out.println("Square peg of width " + peg1.getWidth() + " can not fit a hole of radius " + hole.getRad());
        }
    }
}
