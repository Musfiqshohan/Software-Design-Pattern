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
 * @author mashrur
 */
public abstract class Duck {
    private FlyBehaviour flybehaviour;
    private QuackBehaviour quackbehaviour;

    public void setFlybehaviour(FlyBehaviour flybehaviour) {
        this.flybehaviour = flybehaviour;
    }

    public void setQuackbehaviour(QuackBehaviour quackbehaviour) {
        this.quackbehaviour = quackbehaviour;
    }
    
    abstract void display();
    
    public void performFly() {
        flybehaviour.fly();
    }
    
    public void performQuack() {
        quackbehaviour.quack();
    }
    
    public void swim() {
        System.out.println("The Duck is currently swimming");
    }
    
}
