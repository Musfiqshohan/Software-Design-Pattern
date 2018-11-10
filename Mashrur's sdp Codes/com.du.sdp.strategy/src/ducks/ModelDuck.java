/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ducks;

import flybehaviour.FlyNoWay;
import quackbehaviour.Quack;

/**
 *
 * @author mashrur
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        setFlybehaviour(new FlyNoWay());
        setQuackbehaviour(new Quack());
    }
    
    @Override
    void display() {
        System.out.println("I am a Model Duck");
    }
    
}
