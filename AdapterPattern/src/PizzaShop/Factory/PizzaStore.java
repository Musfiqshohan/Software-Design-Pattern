/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzaShop.Factory;

import PizzaShop.Object.Pizza;

/**
 *
 * @author musfiq
 */
public abstract class PizzaStore {
    
    
        public Pizza orderPizza(String type){
            Pizza pizza;
            
            pizza= createPizza(type);
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
            
            return pizza;           
            
        }
        
        abstract Pizza createPizza(String type);
    
}
