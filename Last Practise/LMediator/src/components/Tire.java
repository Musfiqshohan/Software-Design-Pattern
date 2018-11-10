/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import com.du.lmediator.Mediator;

/**
 *
 * @author musfiq
 */
public class Tire implements IComponent{
    
      private Mediator mediator;
    private double radius;

    public Tire(Mediator mediator) {
        this.mediator = mediator;
        mediator.setComponent(this);
    }
    
    

   public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    
    public boolean changeRadius(double radius){
        return mediator.set(this, radius);
    }

    @Override
    public String toString() {
        return "Tire{" + "radius=" + radius + '}';
    }
    
}
