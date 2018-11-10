/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorpattern;

import components.Hub;
import components.IComponent;
import components.Spoke;
import components.Tire;

/**
 *
 * @author musfiq
 */
public class Mediator implements IMediator {

    private Tire tire;
    private Hub hub;
    private Spoke spoke;

    @Override
    public void setComponent(IComponent component) {
        if (component instanceof Tire) {
            this.tire = (Tire) component;
        }

        if (component instanceof Hub) {
            this.hub = (Hub) component;
        }

        if (component instanceof Spoke) {
            this.spoke = (Spoke) component;
        }
    }

    @Override
    public boolean set(IComponent component, int value) {

        if (component instanceof Tire) {
            return setRadius((Tire) component, value);
        }

        if (component instanceof Hub) {
            return setRadius((Hub) component, value);
        }

        if (component instanceof Spoke) {
            return setSize((Spoke) component, value);
        }

        return false;

    }

    public boolean setRadius(Tire tire, int radius) {

        if (hub == null || radius > hub.getRadius()) {
            tire.setRadius(radius);
            spoke.setSize(tire.getRadius() - hub.getRadius());
            return true;
        }

        return false;

    }

    public boolean setRadius(Hub hub, int radius) {
        
        if(tire==null || radius<tire.getRadius()){
            hub.setRadius(radius);
             spoke.setSize(tire.getRadius() - hub.getRadius());
             return true;
        }
        return false;         
        
    }

    public boolean setSize(Spoke spoke, int size) {

        if(hub==null || tire==null || tire.getRadius()-hub.getRadius()==size){
               spoke.setSize(size);
               return true;
                       
        }
        
        return false;
    }

}
