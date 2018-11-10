/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretecomponents;

/**
 *
 * @author musfiq
 */
public class Espressor extends BeverageComponent{
    
    
      public Espressor() {
        
        description ="Espressor Coffee";
        price=100.00;
        
    }
    
     @Override
    public double cost() {
         return price;
    }

    @Override
    public String getDescription() {
        return description+":"+price; //To change body of generated methods, choose Tools | Templates.
    }
    
}
