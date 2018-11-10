/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.decoratorpattern;

import concretecomponents.BeverageComponent;
import concretecomponents.DarkRoast;
import concretedecorators.Milk;
import concretedecorators.Mocha;
import concretedecorators.Soy;
import concretedecorators.Whip;

/**
 *
 * @author musfiq
 */
public class DecoratorSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BeverageComponent beverage= new DarkRoast();
        
        beverage= new Milk(beverage);
        beverage= new Mocha(beverage);
        beverage= new Whip(beverage);
        beverage= new Soy(beverage);
        
        
        System.out.println(beverage.getDescription());
        System.out.println(beverage.cost());
        
        
        
    }
    
}
