/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.lsingletonpattern;

/**
 *
 * @author musfiq
 */
public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;
    
    
    private static ChocolateBoiler  uniqueInstance;

    public ChocolateBoiler() {
        this.empty=true;
        this.boiled=false;
    }
    
    
    
    
    
    public static ChocolateBoiler getInstance(){
        
        if(uniqueInstance==null){
            synchronized(ChocolateBoiler.class){
                uniqueInstance= new ChocolateBoiler();
                System.out.println("Unique BOiler created");
            }    
            
        }
        
        return uniqueInstance;
        
    }
    
    
    public void fill(){
        
        if(isEmpty() )
        {
            empty=false;
            boiled=false;
            System.out.println("Filling the boiler");
        }
        
        
        
    }
    
    public void boil(){
        
        if(!isEmpty() && !isBoiled()){
            boiled=true;
            System.out.println("Boiling the boiler");
        }
        
    }
    
    public void drain(){
        
        if(!isEmpty() && isBoiled()){
            empty=true;
            boiled=false;
            System.out.println("Draining the boiler");
                    
        }
        
    }

    
    
    
    
    
    
    public boolean isEmpty() {
        return empty;
    }

  

    public boolean isBoiled() {
        return boiled;
    }

   
    
   
    
}
