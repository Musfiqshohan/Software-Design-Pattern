/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packW;

import packX.ClassA;

/**
 *
 * @author musfiq
 */
public class ClassD extends ClassA{
        
    
    public  ClassD(double a, double b){
        
        this.a=a;
        this.b=b;
        
    }
    
     public double compute(){
        
        return a/b;
        
    }
    
}
