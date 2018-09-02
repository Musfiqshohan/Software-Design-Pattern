/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packY;

import packX.ClassA;

/**
 *
 * @author musfiq
 */
public class ClassB extends ClassA{
    
    
    public ClassB(double a, double b){
        
        this.a=a;
        this.b=b;
        
    }
    
    public double compute(){
        
        return Math.max(a,b);
        
    }
    
}
