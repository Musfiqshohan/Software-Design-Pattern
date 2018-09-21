/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzaConcreteComponent;

import PizzaDecoration.PizzaClass;
import javax.xml.soap.Detail;

/**
 *
 * @author musfiq
 */
public class GarlicFingers extends PizzaClass{

    public GarlicFingers() {
         details="This is GarlicFingers =500";
    }
    
     
     
    
     @Override
     public double cost(){
         
         return 500;
     }
    
}
