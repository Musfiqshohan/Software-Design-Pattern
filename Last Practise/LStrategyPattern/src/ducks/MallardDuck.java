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
public class MallardDuck extends Duck{

    public MallardDuck() {
        
        setflyBehaviour(new FlyWithWings());
        setquackBehaviour(new Quack());
    }
    
    

    
      public void display(){
        System.out.println("I am Mallard duck");
    }
}
