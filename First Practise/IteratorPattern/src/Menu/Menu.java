/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import MainPackage.MenuItem;
import java.util.Iterator;

/**
 *
 * @author musfiq
 */
public interface Menu {
    
    
    
    public Iterator createIterator();
    public void addItem(String name, String description, boolean vegeterian, double price);
//    public MenuItem[] getMenuItems();
    
}
