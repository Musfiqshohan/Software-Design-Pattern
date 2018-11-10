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
public abstract class CondimentDecorator extends BeverageComponent{
    
    
    BeverageComponent beverageComponent;
    
    public abstract String getDescription();
    
    
}
