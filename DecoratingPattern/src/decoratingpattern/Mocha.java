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
public class Mocha extends CondimentDecorator{
    
    
      Beverage beverage;
        
     public Mocha(Beverage b) {
        beverage=b;
    }
    
    @Override
    int cost() {
        return super.cost()+6; //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
    
    
    
}
