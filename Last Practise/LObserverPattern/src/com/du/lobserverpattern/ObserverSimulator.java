/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.lobserverpattern;

import observers.CurrentConditionDisplay;
import observers.ForeCastDisplay;
import observers.StatisticsDisplay;
import subject.WeatherData;

/**
 *
 * @author musfiq
 */
public class ObserverSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        WeatherData weatherData= new WeatherData();
        
        CurrentConditionDisplay ccd= new CurrentConditionDisplay(weatherData);
        ForeCastDisplay foreCastDisplay= new ForeCastDisplay(weatherData, 25);
        StatisticsDisplay statisticsDisplay= new StatisticsDisplay(weatherData);
        
        
        weatherData.setMeasurements(30, 40, 50);
        weatherData.setMeasurements(20, 30, 40);
        weatherData.setMeasurements(39, 42, 45);
        
        
    }
    
}
