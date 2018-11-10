/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ducks;

import flybehaviour.FlyNoWay;
import flybehaviour.FlyWithWings;
import quackbehaviour.Quack;
import quackbehaviour.Squeek;

/**
 *
 * @author musfiq
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }
    
    
    
    
     @Override
    public void display() {
        System.out.println("I am a Mallard duck");
     }
    
}
