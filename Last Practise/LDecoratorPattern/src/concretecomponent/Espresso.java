/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretecomponent;

/**
 *
 * @author musfiq
 */
public class Espresso extends BeverageComponent{
    
    
      public Espresso() {
        
        description="Espresso"+":100.00";
    }
    
    
    
    
    public double cost(){
        return 100.00;
    }
    
  
    
}
