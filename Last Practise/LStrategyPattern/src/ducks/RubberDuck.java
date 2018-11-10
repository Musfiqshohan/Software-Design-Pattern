/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ducks;

import flybehaviour.FlyNoWay;
import quackbehaviour.Squeek;

/**
 *
 * @author musfiq
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        
        setflyBehaviour(new FlyNoWay());
        setquackBehaviour(new Squeek());
    }
    
    
    
    
    
    
      public void display(){
        System.out.println("I am Rubber duck");
    }
    
}
