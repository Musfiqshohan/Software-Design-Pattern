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
public class ThickCrust extends Pizza {

    @Override
    public float cost() {
        return (float) 1178.25;
    }
    
    @Override
    public String getDescription() {
        return "Thick Crust Pizza\n";
    }
    
}
