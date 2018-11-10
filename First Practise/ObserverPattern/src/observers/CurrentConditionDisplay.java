/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observers;

import subject.Subject;

/**
 *
 * @author musfiq
 */
public class CurrentConditionDisplay implements DisplayElement, Observer{
    
    private Subject weatherData;
    private double temperature;
    private double humidity;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    
    
    
    public void display(){
        System.out.println("CurrentCondition: \n"+"temperature:"+temperature+
                "\nHumidity: "+humidity);
         
     }

    @Override
    public void update(double temp, double humidity, double pressure) {
        this.temperature=temp;
        this.humidity=humidity;
    }
     
     
    
}
