/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author musfiq
 */
public class JavaApplication1 {

    static void m(){
        int data=50/0;
        
    }
    
    static void n(){
        m();
    }
    static void p(){
       
        n();
       
    }
    
   public static void main(String args[]){  
       
       try{
       p();
       }catch(Exception e) {System.out.println(e);}
       
       System.out.println("haha");
   }
  
}
