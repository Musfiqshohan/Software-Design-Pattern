/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ducks;

import flybehaviour.FlyNoWay;
import quackbehaviour.MuteQuack;



/**
 *
 * @author musfiq
 */
public class DecoyDuck extends Duck{

    public DecoyDuck() {
        
        
        setflyBehaviour(new FlyNoWay());
        setquackBehaviour(new MuteQuack());
    }
    
    
    
    
    public void display(){
        System.out.println("I am decoy duck");
    }
    
    
    
}
