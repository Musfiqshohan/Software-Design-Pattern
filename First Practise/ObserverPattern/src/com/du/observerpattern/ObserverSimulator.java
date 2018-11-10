/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.observerpattern;

import observers.CurrentConditionDisplay;
import observers.DisplayElement;
import observers.ForecastDisplay;
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
        
        CurrentConditionDisplay currentDisplay= new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statdisplay= new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay= new ForecastDisplay(weatherData);
        
        weatherData.setMeasurements(40, 50, 60);
        weatherData.setMeasurements(60, 70, 80);
        weatherData.setMeasurements(55, 55, 65);
        
        currentDisplay.display();
        statdisplay.display();
        forecastDisplay.display();
    }
    
}
