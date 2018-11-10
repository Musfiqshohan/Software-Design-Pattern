/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterators;

import Menu.*;
import MainPackage.MenuItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author musfiq
 */
public class PancakeHouseMenuIterator implements Iterator{
    
     ArrayList<MenuItem> menuItems;
    int pos=0;
    public PancakeHouseMenuIterator(ArrayList<MenuItem> list) {
        pos=0;
        menuItems= list;
    
    }
    


    @Override
    public boolean hasNext() {
        if(menuItems.size()<=0)
            return false;
        else return true;
        
    }

    @Override
    public Object next() {
        MenuItem item= menuItems.get(pos);
        pos++;
        return item;
    }
    
    
    
    @Override
    public void remove(){
        
        if(pos<0)
            System.out.println("No more available");
        else{
            menuItems.remove(pos);
            pos--;
        }
        
    }
    
 
}
