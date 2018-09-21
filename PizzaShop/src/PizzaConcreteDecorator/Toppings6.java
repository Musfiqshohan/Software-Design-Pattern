/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzaConcreteDecorator;

import PizzaDecoration.PizzaClass;

/**
 *
 * @author musfiq
 */
public class Toppings1 extends Decorator{
    
    PizzaClass pizzaClass;
    int count;

    public Toppings1(PizzaClass pizzaClass, int count) {
        this.pizzaClass = pizzaClass;
        this.count=count;
        
        
        String add="Toppings1*"+count+" -> "+" 1.00*"+count+" = "+1.00*count;
        details=pizzaClass.details+"\n"+add;
        
    }
    
    
    public double cost(){
        
        return pizzaClass.cost()+ 1.00*count;
    }
    
    
    
}
