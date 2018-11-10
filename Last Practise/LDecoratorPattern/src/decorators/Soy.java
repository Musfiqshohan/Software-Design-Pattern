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
public class Soy extends CondimentDecorator{
    
    
       public Soy(BeverageComponent bc) {
        this.beverageComponent=bc;
        description="Soy";
    }
    
    
    

    @Override
    public String getDescription() {
        
        return beverageComponent.getDescription()+"\nTopping: "+description+":20.00";
    }

    @Override
    public double cost() {
        
        return beverageComponent.cost()+20.00;
    }
    
}
