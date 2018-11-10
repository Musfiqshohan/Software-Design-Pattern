/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import com.du.sdp.iterator.MenuItem;
import iterators.DinerMenuIterator;
import java.util.Iterator;

/**
 *
 * @author mashrur
 */
public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 15;
    private int pos;
    private MenuItem[] menu;
    
    public DinerMenu() {
        pos = 0;
        menu = new MenuItem[MAX_ITEMS];
    }
    
    @Override
    public void addItem(String name, String description, boolean vegeterian, double price) {
        MenuItem item = new MenuItem(name, description, vegeterian, price);
        if(pos >= MAX_ITEMS) {
            System.out.println("Sorry no space to add new menu");
        }
        else {
            menu[pos] = item;
            pos += 1;
        }
    }
    
    public MenuItem[] getMenuItems() {
        return menu;
    }
    
    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menu);
    }
    
}
