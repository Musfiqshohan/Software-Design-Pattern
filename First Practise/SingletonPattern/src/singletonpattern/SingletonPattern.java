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
public class SingletonPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        WorkerThread t1= new WorkerThread("Shohan1");
        WorkerThread t2= new WorkerThread("SHohan2");
        
        t1.start();
        t2.start();
                
        
    }
    
}
