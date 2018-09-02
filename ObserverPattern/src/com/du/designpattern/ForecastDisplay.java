/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.designpattern;

/**
 *
 * @author musfiq
 */
public class ForecastDisplay implements Observer,DisplayElement{
    
        private double currTemperature,currHumidity, currPressure;
    
    @Override
    public void update(Subject s) {
        
        if(s instanceof WeatherData){
            WeatherData w= (WeatherData)s;
                
                currTemperature=w.getTemperature();
                currHumidity=w.getHumidity();
                currPressure=w.getPressure();
        }
    }
        
        

    @Override
    public void display() {
        
        System.out.println(currTemperature+" "+currHumidity+" "+ currPressure);
        
      }
    
    
    
}
