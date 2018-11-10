/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import com.du.iteratorpatter.MenuItem;
import java.util.Iterator;

/**
 *
 * @author musfiq
 */
public interface Menu {
    
    
    void addItem(String name, String description,boolean  vegetarian,double price);
    
    
    public Iterator createIterator();
    
    
    
}
