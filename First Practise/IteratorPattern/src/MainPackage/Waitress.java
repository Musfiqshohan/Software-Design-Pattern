/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import Menu.Menu;
import java.util.Iterator;

/**
 *
 * @author musfiq
 */
public class Waitress {
    
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    
    
    public void printMenu(){
        
        Iterator pancakeIterator=pancakeHouseMenu.createIterator();
        Iterator dinerIterator=dinerMenu.createIterator();
        
        System.out.println("Breakfast");
        printMenu(pancakeIterator);
        
        System.out.println("Launch");
        printMenu(dinerIterator);
    }
    
    
    public void printMenu(Iterator iterator){
       
        while(iterator.hasNext())
        {
            MenuItem menuItem= (MenuItem)iterator.next();
            
            System.out.println(menuItem.getName()+" "+menuItem.getDescription()+" "+menuItem.getPrice());
            
            
        }
        
        
    }
    
    
    
    
    
}
