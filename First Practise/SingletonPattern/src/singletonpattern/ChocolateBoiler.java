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
public class ChocolateBoiler {
    
    private boolean empty;
    private boolean boiled;
    private int fcount=0;
    private int bcount=0;
    private int dcount=0;
    
    
    private static volatile ChocolateBoiler uniqueInstance;
    
    
    private ChocolateBoiler(){
        
        empty=true;
        boiled=false;
        
    }
    
    
    public static ChocolateBoiler getInstance(){
        
        if(uniqueInstance==null){
            synchronized(ChocolateBoiler.class){
                if(uniqueInstance==null){
                    uniqueInstance=new ChocolateBoiler();
                    System.out.println("created");
                }
            }
        }
       
        return uniqueInstance;
    }
    
    
    public void fill(){
        if(isEmpty()){
            empty=false;
            boiled=false;
            System.out.println("Filling the boiler"+fcount++);
//            empty=false;
           
        }
        
    }
    
    
    public void boil(){
        
        if(!isEmpty() && !isBoiled()){
            boiled=true;
            System.out.println("Boiling in boiler"+bcount++);
            
            
        }
        
    }
    
    public void drain(){
        
        if(isBoiled() && !isEmpty()){
            empty=true;
            boiled=false;
            System.out.println("Draining boiler"+dcount++);
            
        }
        
    }
    
    
    public boolean isEmpty(){
        return empty;
    }
    
    public boolean isBoiled(){
        return boiled;
    }
    
    
     
    
}
