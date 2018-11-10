/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ducks;

import flybehaviour.FlyNoWay;
import quackbehaviour.Squeak;

/**
 *
 * @author mashrur
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlybehaviour(new FlyNoWay());
        setQuackbehaviour(new Squeak());
    }
    
    @Override
    void display() {
        System.out.println("I am a Rubber Duck");
    }
    
}
