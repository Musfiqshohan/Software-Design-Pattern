/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packZ;

import packX.ClassA;

/**
 *
 * @author musfiq
 */
public class ClassC extends ClassA{
        
     public ClassC(double a, double b){
        
        this.a=a;
        this.b=b;
        
    }
        
    public double compute(){
        
        return Math.min(a,b);
        
    }
    
    
}
