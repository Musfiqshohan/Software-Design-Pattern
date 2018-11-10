/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.strategypattern;

import ducks.FactoryDuck;
import ducks.MallardDuck;
import ducks.RubberDuck;

/**
 *
 * @author musfiq
 */
public class StrategySimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MallardDuck mallardDuck= new MallardDuck();
        RubberDuck rubberDuck= new RubberDuck();
        FactoryDuck factoryDuck= new FactoryDuck();
        
        
        mallardDuck.performFly();
        rubberDuck.performFly();
        factoryDuck.performFly();
        
        mallardDuck.performQuack();
        rubberDuck.performQuack();
        factoryDuck.performQuack();
        
        mallardDuck.display();
        rubberDuck.display();
        factoryDuck.display();
        
    }
    
}
