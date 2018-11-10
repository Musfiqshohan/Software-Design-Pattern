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
 * Name: Mashrur Rashik
 * Roll: 29
 */
public class Bacon extends CondimentDecorator {

    Pizza component;

    public Bacon(Pizza component) {
        this.component = component;
    }

    @Override
    public float cost() {
        return (float) (5.5 + component.cost());
    }
    
    @Override
    public String getDescription() {
        return "Topping: Bacon\n" + component.getDescription();
    }

}
