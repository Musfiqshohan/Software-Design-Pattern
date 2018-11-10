/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.sdp.memento;

import java.util.ArrayList;

/**
 *
 * @author mashrur
 */
public class Caretaker {
    private ArrayList<Memento> mementos;

    public Caretaker() {
        mementos = new ArrayList<>();
    }
    
    public void addMemento(Memento m) {
        mementos.add(m);
    }
    
    public Memento getMemento(int pos) throws Exception {
        if(pos>=mementos.size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return mementos.get(pos);
    } 
    
}
