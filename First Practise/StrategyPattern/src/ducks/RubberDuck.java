/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ducks;

import flybehaviour.FlyNoWay;
import quackbehaviour.MuteQuack;
import quackbehaviour.Squeek;

/**
 *
 * @author musfiq
 */
public class RubberDuck extends Duck{

    public RubberDuck() {
        
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Squeek());
    }

    @Override
    public void display() {
        System.out.println("I am a rubber duck");
     }
    
    
    
}
