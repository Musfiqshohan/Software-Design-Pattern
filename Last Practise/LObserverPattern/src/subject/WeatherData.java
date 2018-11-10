/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subject;

import java.util.ArrayList;
import observers.Observer;

/**
 *
 * @author musfiq
 */
public class WeatherData implements Subject{
    
    ArrayList observers;
    
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        this.observers = new ArrayList<Observer>();
    }
    
    
    

    @Override
    public void registerObserver(Observer o) {
        
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        
        for(int i=0;i<observers.size();i++){
            Observer ob=(Observer)observers.get(i);
            ob.update(temperature, humidity, pressure);
        }
            
   }
    
    
    private void measurementChanged(){
        notifyObservers();
    }
    
    public void setMeasurements(double temp, double humidity, double pressure){
        this.temperature=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        
        measurementChanged();
        
    }
    
    
}
