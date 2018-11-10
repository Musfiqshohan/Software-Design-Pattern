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
public abstract class BeverageComponent {
    
    public String description;
    public abstract double cost();
    
    public String getDescription(){
        return description;
    }
    
}
