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
 * @author musfiq
 */
public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
        
        setflyBehaviour(new FlyWithWings());
        setquackBehaviour(new Quack());
    }
    
    
    
      public void display(){
        System.out.println("I am Red Head duck");
    }
    
}
