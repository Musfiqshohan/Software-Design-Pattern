/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import mediatorpattern.IMediator;

/**
 *
 * @author musfiq
 */
public class Hub implements IComponent{
    
    private final IMediator mediator;
    private int radius;

    public Hub(IMediator mediator) {
        this.mediator = mediator;
        this.mediator.setComponent(this);
    }
    
    
     public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    
    
    public boolean changeRadius(int radius){
        return this.mediator.set(this, radius);
                
    }

    @Override
    public String toString() {
        return "Hub{" + "radius=" + radius + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
