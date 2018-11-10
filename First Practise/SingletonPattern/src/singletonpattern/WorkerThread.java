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
public class WorkerThread  extends Thread{

    
    ChocolateBoiler cb;
    String workerName;
    public WorkerThread(String name) {
        workerName=name;
           cb= ChocolateBoiler.getInstance();
    }
    
    
    
    
    
    @Override
    public void run(){
        int cnt=0;
        while(cnt<5){
            cnt++;
//            System.out.println("times:"+cnt);
            System.out.println("Name:"+workerName);
            cb.fill();
            cb.boil();
            cb.drain();
        }
        
        
        
    }
    
    
    
    
    
    
}
