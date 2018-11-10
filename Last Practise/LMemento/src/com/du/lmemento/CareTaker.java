/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.lmemento;

import java.util.ArrayList;

/**
 *
 * @author musfiq
 */
public class CareTaker {
    
    private ArrayList<Memento> mementos;

    public CareTaker() {
        
        mementos= new ArrayList<Memento>();
    }
    
    
    public void addState(Memento memento){
        
        mementos.add(memento);
        
    }
    
    
    public Memento getStateFromMemento(int index) throws Exception{
        
        if(index>=mementos.size())
            throw new ArrayIndexOutOfBoundsException();
        else 
            return mementos.get(index);
        
        
    }
    
    
    
    
    
    
    
    
}
