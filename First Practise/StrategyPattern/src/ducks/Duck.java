/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ducks;

import flybehaviour.FlyBehaviour;
import quackbehaviour.QuackBehaviour;

/**
 *
 * @author musfiq
 */
public abstract class Duck {
    
    FlyBehaviour flyBehaviour;
    QuackBehaviour qucakBehaviour;
    
    
     void setFlyBehaviour(FlyBehaviour fb){
         this.flyBehaviour=fb;
        
    }
    
    void setQuackBehaviour(QuackBehaviour qb){
        this.qucakBehaviour=qb;
        
    }
    
    
    
    
   abstract void display();
           
    
   public void performQuack(){
       qucakBehaviour.quack();
        
    }
    
    
   public void performFly(){
        flyBehaviour.fly();
    }
    
    
   public void swim(){
           System.out.println("The duck is currently swimming");
    }
   
    
    
    
    
}
