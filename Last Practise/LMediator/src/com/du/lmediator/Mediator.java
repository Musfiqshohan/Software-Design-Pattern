/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.lmediator;

import components.*;

/**
 *
 * @author musfiq
 */
public class Mediator implements IMediator{
    
    private Tire tire;
    private Spoke spoke;
    private Hub hub;

    public Mediator() {
    }
    
    
    
    

    @Override
    public boolean set(IComponent component, double value) {
        if(component instanceof Tire)
            return setRadius((Tire)component,value);
        if(component instanceof Hub)
            return setRadius((Hub)component,value);
        if(component instanceof Spoke)
            return setSize((Spoke)component,value);
            
        return false;
    }

    @Override
    public void setComponent(IComponent component) {
        
        if(component instanceof Tire)
            tire=(Tire)component;
        if(component instanceof Hub)
            hub=(Hub)component;
        if(component instanceof Spoke)
            spoke=(Spoke)component;
               
    }
    
    
    public boolean setRadius(Tire tire, double value){
        
        if(hub==null || hub.getRadius()<value)
        {
            tire.setRadius(value);
            spoke.setsize(tire.getRadius()-hub.getRadius());
            return true;
        }
        
       return false;
        
    }
    
      public boolean setRadius(Hub hub, double value){
          
          if(tire==null || tire.getRadius()>value){
              hub.setRadius(value);
              spoke.setsize(tire.getRadius()-hub.getRadius());
              
              return true;
          }
          return false;
        
        
     
          
    }
          
      
        public boolean setSize(Spoke spoke, double value){
            
            if(tire==null || hub==null || tire.getRadius()-hub.getRadius()==value)
            {
                spoke.setsize(value);
                return true;
            }
            
            return false;
    
    }
        
        
                
    
}
