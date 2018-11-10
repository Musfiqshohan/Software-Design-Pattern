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
public class ThinCrust extends Pizza {

    @Override
    public float cost() {
        return (float) 1950.75;
    }
    
    @Override
    public String getDescription() {
        return "Thin Crust Pizza\n";
    }
    
}
