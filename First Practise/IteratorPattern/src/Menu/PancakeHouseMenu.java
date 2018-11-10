/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import MainPackage.MenuItem;
import iterators.PancakeHouseMenuIterator;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author musfiq
 */
public class PancakeHouseMenu implements Menu{
    
    ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems= new ArrayList<MenuItem>();
        
        addItem("n1", "d1", true, 10);
        addItem("n2", "d2", true, 100);
        addItem("n3", "d3", true, 1000);
        addItem("n4", "d4", true, 10000);
        
    }
    
    
    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem= new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

//    @Override
//    public ArrayList getMenuItems() {
//        
//        return menuItems;
//       }
    
    
    
    
    
    
    
    
    
    
    
    
}
