/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import com.du.iteratorpatter.MenuItem;
import iterators.DinerMenuIterator;
import java.util.Iterator;

/**
 *
 * @author musfiq
 */
public class DinerMenu implements Menu {

    private MenuItem[] menuItems;
    private final int MAX_COUNT;
    private int currentPos;

    public DinerMenu() {
        this.MAX_COUNT = 10;
        menuItems = new MenuItem[MAX_COUNT];
        
        

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {

        MenuItem m = new MenuItem(name, description, vegetarian, price);
        if (currentPos < MAX_COUNT) {
            menuItems[currentPos] = m;
            currentPos++;
        } else {
            System.out.println("Not enough space");
        }

    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
