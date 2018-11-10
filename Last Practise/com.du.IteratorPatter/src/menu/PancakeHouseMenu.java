/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import com.du.iteratorpatter.MenuItem;
import iterators.DinerMenuIterator;
import iterators.PancakeHouseMenuIterator;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author musfiq
 */
public class PancakeHouseMenu implements Menu{
    
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        
        menuItems = new ArrayList<MenuItem>();

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {

        MenuItem m = new MenuItem(name, description, vegetarian, price);
        menuItems.add(m);

    }

    @Override
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }

    
}
