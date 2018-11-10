/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretecomponents;

import com.sun.org.glassfish.gmbal.Description;

/**
 *
 * @author musfiq
 */
public class DarkRoast extends BeverageComponent{

    public DarkRoast() {
        
        description ="DarkRoast Coffee";
        price=60;
        
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
