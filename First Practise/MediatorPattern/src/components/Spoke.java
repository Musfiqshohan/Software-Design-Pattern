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
public class Spoke implements IComponent {

    private final IMediator mediator;
    private int size;

    public Spoke(IMediator mediator) {
        this.mediator = mediator;
        this.mediator.setComponent(this);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean changeSize(int radius) {
        return this.mediator.set(this, radius);

    }

    @Override
    public String toString() {
        return "Spoke{" + "size=" + size + '}';
    }
    
    
    

}
