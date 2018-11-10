/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretedecorators;

import concretecomponents.BeverageComponent;

/**
 *
 * @author musfiq
 */
public class Whip extends CondimentDecorator{
    
     BeverageComponent beverage;
    
    
    public Whip(BeverageComponent bc) {
        this. beverage=bc;
        this.description="Whip";
        this.price=20.0;
    }
    
    
    
       @Override
    public double cost() {
        
        return price+ beverage.cost();
     }
    
        @Override
    public String getDescription() {
        return beverage.getDescription()+"\nTopping: "+description+":"+price;
    }
    
}
