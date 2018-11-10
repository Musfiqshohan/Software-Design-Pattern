/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import com.du.sdp.iterator.MenuItem;
import java.util.Iterator;

/**
 *
 * @author mashrur
 */
public interface Menu {
    public void addItem(String name, String description, boolean vegeterian, double price);
    public Iterator createIterator();
}
