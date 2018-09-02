/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.designpattern;

import java.util.ArrayList;

/**
 *
 * @author musfiq
 */
public class WeatherData implements Subject{

    
    private double currTemperature,currHumidity, currPressure;
    private ArrayList<Observer> observerList = new ArrayList<Observer>();
 
    
    
    @Override
    public void registerObserver(Observer o) {
        
        observerList.add(o);
        
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeObserver(Observer o) {
        
        observerList.remove(o);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyObserver() {
        
        
        for(int i=0;i<observerList.size();i++)
            observerList.get(i).update(this);
        
        
       //To change body of generated methods, choose Tools | Templates.
    }

  
  
    
    double getTemperature(){
        
        return currTemperature;
    }
    
    double getHumidity(){
        
        return currHumidity;
    }
    
    double getPressure(){
        return currPressure;
    }
    
    void measurementChanged(){
        
    }
    
    
    
}
