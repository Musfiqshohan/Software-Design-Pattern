/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzaShop.Object;

import java.util.ArrayList;

/**
 *
 * @author musfiq
 */
public abstract class Pizza {
    
    public String name;
    public String dough;
    public String sauce;
    public ArrayList toppings= new ArrayList();
    
    
    void prepare(){
        
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough "+dough);
        System.out.println("Adding sauce: "+sauce);
        System.out.println("Adding topoings : ");
        for(int i=0;i<toppings.size();i++){
            System.out.println("  "+ toppings.get(i));
            
        }
        
    }
    
    
    public void bake(){
        System.out.println("bake for 25 minutes");
    }
    
    void cut(){
        
        System.out.println("CUtting the pizza diagonal");
    }
    
    void box(){
        
        System.out.println("place pizza in official box");
    }

    public String getName() {
        return name;
    }
    
    
           
    
}
