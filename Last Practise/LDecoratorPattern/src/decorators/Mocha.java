/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorators;

import concretecomponent.BeverageComponent;

/**
 *
 * @author musfiq
 */
public class Mocha extends CondimentDecorator{
    
      public Mocha(BeverageComponent bc) {
        this.beverageComponent=bc;
        description="Mocha";
    }
    
    
    

    @Override
    public String getDescription() {
        
        return beverageComponent.getDescription()+"\nTopping: "+description+":15.00";
    }

    @Override
    public double cost() {
        
        return beverageComponent.cost()+15.00;
    }
    
}
