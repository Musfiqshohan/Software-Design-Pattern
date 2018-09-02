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
public class Soy extends CondimentDecorator{

       Beverage beverage;
      public Soy(Beverage b) {
        beverage=b;
    }
    
    @Override
    int cost() {
        return beverage.cost()+7; //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
    
    
    
}
