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
public class Whip extends CondimentDecorator{

    
    Beverage beverage;
    
    
      public Whip (Beverage b) {
        beverage=b;
    }
    
    @Override
    int cost() {
        return beverage.cost()+8; //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
    
    
    
}
