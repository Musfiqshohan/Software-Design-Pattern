/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.lmemento;

/**
 *
 * @author musfiq
 */
public class MementoSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        
        Originator originator= new Originator();
        CareTaker careTaker= new CareTaker();
        
        originator.setState("State1");
        originator.setState("State2");     
        careTaker.addState(originator.save());
        originator.setState("State3");
        careTaker.addState(originator.save());
        
        
        originator.setState("State4");
        originator.restore(careTaker.getStateFromMemento(1));
        
                
        
        
        
        
      
        
        
        
        
        
        
    }
    
}
