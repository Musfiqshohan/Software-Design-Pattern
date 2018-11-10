/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ducks;

import flybehaviour.FlyWithRocket;
import flybehaviour.FlyWithWings;
import quackbehaviour.FakeQuack;
import quackbehaviour.Quack;

/**
 *
 * @author musfiq
 */
public class FactoryDuck extends Duck{

    public FactoryDuck() {
          setFlyBehaviour(new FlyWithRocket());
        setQuackBehaviour(new FakeQuack());
        
    }
    
      @Override
    public void display() {
        System.out.println("I am a Factory duck");
     }
    
    
    
}
