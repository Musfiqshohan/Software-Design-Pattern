/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonpattern;

/**
 *
 * @author musfiq
 */
public class Singleton {
    
    private volatile static  Singleton uniqueInstance;
//    Declaring a volatile Java variable means:
//The value of this variable will never be cached thread-locally: all reads and writes will go straight to "main memory";
//Access to the variable acts as though it is enclosed in a synchronized block, synchronized on itself.
    
    private Singleton(){}
    
    
    public static Singleton getInstance(){
        
        if(uniqueInstance==null){
            
            synchronized(Singleton.class){
                if(uniqueInstance==null)
                    uniqueInstance=new Singleton();
            }
            
        }
        return uniqueInstance;
                
    }
            
    
}
