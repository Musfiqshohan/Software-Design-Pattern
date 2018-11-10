/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mementopattern;

/**
 *
 * @author musfiq
 */
public class MementoPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Caretaker caretaker= new Caretaker();
        Originator originator= new Originator();
        
        
        originator.setState("state1");
        originator.setState("state2");
        
        caretaker.addMemento(originator.save());
        
        originator.setState("state3");
        
        caretaker.addMemento(originator.save());
        
        originator.setState("state4");
        
        
//        here i have a doubt
        originator.restore(caretaker.getStateFromMemento(0));
        originator.restore(caretaker.getStateFromMemento(1));
        
        
    }
    
}
