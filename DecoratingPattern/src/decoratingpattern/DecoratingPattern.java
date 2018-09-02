/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratingpattern;

/**
 *
 * @author musfiq
 */
public class DecoratingPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Beverage b1= new Espresso();
        
        Beverage b2= new Milk(b1);
        
        System.out.println(b2.cost());
        Beverage b3= new Soy(b2);
        
        System.out.println(b3.cost());
        
        
    }
    
}
