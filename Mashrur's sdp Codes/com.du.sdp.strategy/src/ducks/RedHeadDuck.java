/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ducks;

import flybehaviour.FlyWithWings;
import quackbehaviour.Quack;

/**
 *
 * @author mashrur
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        setFlybehaviour(new FlyWithWings());
        setQuackbehaviour(new Quack());
    }
    
    
    @Override
    void display() {
        System.out.println("I am a Red Headed Duck");
    }
    
}
