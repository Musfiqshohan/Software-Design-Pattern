/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.sdp.decorator;

import java.util.Scanner;
import pizzaBase.FlatbreadCrust;
import pizzaBase.Focaccia;
import pizzaBase.StuffedCrust;
import pizzaBase.ThickCrust;
import pizzaBase.ThinCrust;
import pizzaTopping.Bacon;
import pizzaTopping.Mushrooms;
import pizzaTopping.Sausage;

/**
 *
 * @author mashrur
 * 
 * Name: Mashrur Rashik
 * Roll: 29
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pizza PizzaBase;
        String pizzas[] = {"FlatbreadCrust", "Focaccia", "StuffedCrust", "ThickCrust", "ThinCrust"};

        System.out.println("Please Select The Type of Pizza: ");
        String type = sc.next();

        if (type.equals("FlatbreadCrust")) {
            PizzaBase = new FlatbreadCrust();
        } else if (type.equals("Focaccia")) {
            PizzaBase = new Focaccia();
        } else if (type.equals("StuffedCrust")) {
            PizzaBase = new StuffedCrust();
        } else if (type.equals("ThickCrust")) {
            PizzaBase = new ThickCrust();
        } else {
            PizzaBase = new ThinCrust();
        }

        System.out.println("Now Adding Some Toppings: ");

        Bacon toppingOne = new Bacon(PizzaBase);
        Mushrooms toppingTwo = new Mushrooms(toppingOne);
        Sausage toppingThree = new Sausage(toppingTwo);
        
        System.out.println(toppingThree.getDescription());
        System.out.println("Your Bill is: " + toppingThree.cost());
    }
}
