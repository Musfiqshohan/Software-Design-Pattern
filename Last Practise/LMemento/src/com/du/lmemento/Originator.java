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
public class Originator {
    
    private String state;
   
    public void setState(String state){
        
        System.out.println("Originator: Setting state to"+state);
        this.state=state;
        
    }
    
       
    public Memento save(){
        
        System.out.println("Originator: Saving to Memento "+state);
        return new Memento(state);
    }
    
    
    
    public void restore(Memento memento){
        
        state= memento.getState();
        System.out.println("Originator:From Memento list Restoring to "+state);
        
    }
   
    
    
}
