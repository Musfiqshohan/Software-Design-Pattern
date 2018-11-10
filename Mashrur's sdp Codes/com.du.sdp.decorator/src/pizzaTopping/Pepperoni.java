/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaTopping;

import com.du.sdp.decorator.CondimentDecorator;
import com.du.sdp.decorator.Pizza;

/**
 *
 * @author mashrur
 * 
 * Name: Mashrur Mashrur
 * Roll: 29
 */
public class Pepperoni extends CondimentDecorator {

    Pizza component;

    public Pepperoni(Pizza component) {
        this.component = component;
    }

    @Override
    public float cost() {
        return (float) (8.4 + component.cost());
    }
    
    @Override
    public String getDescription() {
        return "Topping: Pepperoni\n" + component.getDescription();
    }
    
}
