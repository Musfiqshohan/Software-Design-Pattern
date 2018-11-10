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
public class Spoke implements IComponent {
    
    
     private Mediator mediator;
    private double size;

    public Spoke(Mediator mediator) {
        this.mediator = mediator;
        mediator.setComponent(this);
    }
    
    

 public double getSize() {
        return size;
    }

    public void setsize(double size) {
        this.size = size;
    }
    
    
    
    public boolean changesize(double size){
        return mediator.set(this, size);
    }

    @Override
    public String toString() {
        return "Spoke{" + "size=" + size + '}';
    }
    
}
