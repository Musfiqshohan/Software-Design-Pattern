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
public class Toppings5 extends Decorator{
    
    PizzaClass pizzaClass;
    int count;

    public Toppings5(PizzaClass pizzaClass, int count) {
        this.pizzaClass = pizzaClass;
        this.count=count;
        
        
        String add="Toppings5*"+count+" -> "+" 5.00*"+count+" = "+5.00*count;
        details=pizzaClass.details+"\n"+add;
        
    }
    
    
    public double cost(){
        
        return pizzaClass.cost()+ 5.00*count;
    }
    
    
    
}
