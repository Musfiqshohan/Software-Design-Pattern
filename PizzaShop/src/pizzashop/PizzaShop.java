/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzashop;

import PizzaConcreteComponent.SushiPizza;
import PizzaConcreteDecorator.Toppings1;
import PizzaConcreteDecorator.Toppings2;
import PizzaConcreteDecorator.Toppings3;
import PizzaConcreteDecorator.Toppings4;
import PizzaConcreteDecorator.Toppings5;
import PizzaConcreteDecorator.Toppings6;
import PizzaConcreteDecorator.Toppings7;
import PizzaConcreteDecorator.Toppings8;
import PizzaDecoration.PizzaClass;

/**
 *
 * @author musfiq
 */
public class PizzaShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        PizzaClass pizzaClass = new SushiPizza();

        pizzaClass = new Toppings1(pizzaClass, 1);
        pizzaClass = new Toppings2(pizzaClass, 2);
        pizzaClass = new Toppings3(pizzaClass, 3);
        pizzaClass = new Toppings4(pizzaClass, 4);
        pizzaClass = new Toppings5(pizzaClass, 5);
        pizzaClass = new Toppings6(pizzaClass, 6);
        pizzaClass = new Toppings7(pizzaClass, 7);
        pizzaClass = new Toppings8(pizzaClass, 8);
        
        System.out.println(pizzaClass.details);
        System.out.println(pizzaClass.cost());

    }

}
