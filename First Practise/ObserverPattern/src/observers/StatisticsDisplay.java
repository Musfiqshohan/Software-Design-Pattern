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
public class StatisticsDisplay implements DisplayElement, Observer{
    
    
    private Subject weatherData;
    private double temperature, avgTemp;
    private double humidity, avgHum;
    private double pressure, avgPre;
    
    private int days;
    

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }
    
    
      public void display(){
          
          System.out.println("Statistics Display:"
          +"\nAverage:"+avgTemp+", "+avgHum+","+avgPre);         
     }

    @Override
    public void update(double temp, double humidity, double pressure) {
         this.temperature=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        
        avgTemp= (avgTemp*days+temp)/(days+1);
        avgHum= (avgHum*days+humidity)/(days+1);
        avgPre= (avgPre*days+pressure)/(days+1);
        
        days++;
                
    }
    
}
