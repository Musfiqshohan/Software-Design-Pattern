/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementopattern;



public class Originator {
    
    
    String state;
    
    public void setState(String state){
        System.out.println("Originator: Setting to state:"+state);
        this.state=state;
    }
    
    
    public Memento save(){
        
        System.out.println("Originator: Saving to memento:"+state);
        return new Memento(state);
        
    }
    
    
    
    
    public void restore(Memento memento){
        
        state= memento.getState();
        System.out.println("Originator: State after restoreing from memento"+state);
        
    }
    
    
    
    
    
    
    
}
