/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaBase;

import com.du.sdp.decorator.Pizza;

/**
 *
 * @author mashrur
 * 
 * Name: Mashrur Rashik
 * Roll: 29
 */
public class StuffedCrust extends Pizza {

    @Override
    public float cost() {
        return (float) 2000.0;
    }
    
    @Override
    public String getDescription() {
        return "Stuffed Crust Pizza\n";
    }
    
}
