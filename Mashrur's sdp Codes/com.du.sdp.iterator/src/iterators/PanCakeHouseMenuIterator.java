/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterators;

import com.du.sdp.iterator.MenuItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mashrur
 */
public class PanCakeHouseMenuIterator implements Iterator {

    ArrayList menu;
    int pos;

    public PanCakeHouseMenuIterator(ArrayList menu) {
        pos = 0;
        this.menu = menu;
    }

    @Override
    public boolean hasNext() {
        if (pos >= menu.size() || menu.get(pos) == null || menu.size() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem item = (MenuItem) menu.get(pos);
        pos += 1;
        return item;
    }

    @Override
    public void remove() {
        if (pos < 0) {
            try {
                throw new Exception();
            } catch (Exception ex) {
                Logger.getLogger(PanCakeHouseMenuIterator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (pos<menu.size() && menu.get(pos) != null) {
            menu.remove(pos);
        }
    }

}
