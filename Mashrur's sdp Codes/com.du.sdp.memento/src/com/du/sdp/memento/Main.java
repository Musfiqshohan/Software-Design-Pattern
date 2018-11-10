/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.sdp.memento;

/**
 *
 * @author mashrur
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Originator orig = new Originator();
        Caretaker care = new Caretaker();
        
        orig.setState("state 1");
        orig.setState("state 2");
        
        care.addMemento(orig.save());
        
        orig.setState("state 3");
        care.addMemento(orig.save());
        
        orig.setState("state 4");
        orig.restore(care.getMemento(1));
        
        
    }
}
