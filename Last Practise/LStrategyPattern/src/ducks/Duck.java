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
    QuackBehaviour quackBehaviour;
    
    
    public void setflyBehaviour(FlyBehaviour fb){
        this.flyBehaviour=fb;
    }
    
    
    public void setquackBehaviour(QuackBehaviour qb){
        this.quackBehaviour=qb;        
    }
    
    
    public abstract void display();
    
    public void perforFly(){
        flyBehaviour.fly();
        
    }
    
     public void perforQuack(){
        quackBehaviour.quack();
    }
     
     public void swim(){
         System.out.println("I am swimming");
     }
    
    
    
    
    
}
