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
public abstract class BeverageComponent {
    
    protected String description;
    protected double price;

    public abstract double cost();
    
    public String getDescription(){
        return description;
    }
    
}
