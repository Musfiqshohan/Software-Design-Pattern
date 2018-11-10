/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.iteratorpatter;

import java.util.Iterator;
import menu.DinerMenu;
import menu.PancakeHouseMenu;

/**
 *
 * @author musfiq
 */
public class Waitress {
    
    private DinerMenu dinerMenu;
    private PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }
    

   public void printMenu(){
       
       Iterator dinerMenuIterator= dinerMenu.createIterator();
       Iterator pancakeHouseMenuIterator= pancakeHouseMenu.createIterator();
       
       System.out.println("BreakFast Menu:");
       printMenu(pancakeHouseMenuIterator);
       
       System.out.println("Lunch Menu:");
       printMenu(dinerMenuIterator);
       
       
       
   }
   
   public void printMenu(Iterator e){
       
       while(e.hasNext()){
           MenuItem m= (MenuItem)e.next();
           
           System.out.println(m.getName()+" "+m.getDescription()+" "+m.getPrice());
       }
   }
    
    
    
}
