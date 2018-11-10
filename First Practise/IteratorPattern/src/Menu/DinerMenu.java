/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import MainPackage.MenuItem;
import iterators.DinerMenuIterator;
import java.util.Iterator;

/**
 *
 * @author musfiq
 */
public class DinerMenu implements Menu{
    
    static final int MAX_ITEMS =6;
    int numberOfItems=0;
    MenuItem[] menuItems;

    public DinerMenu() {
       menuItems =new MenuItem[MAX_ITEMS];
       
        addItem("m1", "dd1", true, 90);
        addItem("m2", "dd2", true, 900);
        addItem("m3", "dd3", true, 9000);
        addItem("m4", "dd4", true, 90000);
       
        
    }
    
    
     public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem= new MenuItem(name, description, vegetarian, price);
        
        if(numberOfItems>=MAX_ITEMS)
             System.out.println("Not enough space");
        else{
            menuItems[numberOfItems]=menuItem;
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        
        return new DinerMenuIterator(menuItems);
        
     }

//    @Override
//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }
    
    
    
    
    
}
