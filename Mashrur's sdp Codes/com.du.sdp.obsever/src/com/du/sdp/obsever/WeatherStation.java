/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.sdp.obsever;

import observable.WeatherData;
import observers.CurrentConditionDisplay;
import observers.ForecastDisplay;
import observers.HeatIndexDisplay;
import observers.StatisticsDisplay;

/**
 *
 * @author mashrur
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weather = new WeatherData();
        CurrentConditionDisplay curdis = new CurrentConditionDisplay(weather);
        ForecastDisplay foredis = new ForecastDisplay(weather);
        StatisticsDisplay statdis = new StatisticsDisplay(weather);
        HeatIndexDisplay heatdis = new HeatIndexDisplay(weather);

        weather.setMeasurements(32, 30.5f, 65);
        weather.setMeasurements(31, 30.6f, 69);
        weather.setMeasurements(30, 30.7f, 61);
    }
}
