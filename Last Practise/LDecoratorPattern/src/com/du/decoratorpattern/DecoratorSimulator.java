/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.decoratorpattern;

import concretecomponent.BeverageComponent;
import concretecomponent.Espresso;
import decorators.Milk;
import decorators.Mocha;
import decorators.Soy;
import decorators.Whip;

/**
 *
 * @author musfiq
 */
public class DecoratorSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BeverageComponent beverageComponent= new Espresso();
        
        beverageComponent= new Milk(beverageComponent);
        beverageComponent= new Mocha(beverageComponent);
        beverageComponent= new Soy(beverageComponent);
        beverageComponent= new Whip(beverageComponent);
        
        System.out.println(beverageComponent.getDescription());
        System.out.println(beverageComponent.cost());
        
        
    }
    
}
