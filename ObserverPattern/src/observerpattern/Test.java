/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author musfiq
 */
public class Test {
    
    
    Test(){
            System.out.println("inside test");
    }
    
  void method(double x){
      System.out.println(x);
  }
    
}


class B extends Test{
    
    
    
     B(){
            System.out.println("inside B");
    }
  
    void method(int x){
        System.out.println(x);
    }
    
    
      void method(String z){
        System.out.println(z);
    }
    
    
    
}
