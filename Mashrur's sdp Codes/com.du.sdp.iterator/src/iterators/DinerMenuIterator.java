/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterators;

import com.du.sdp.iterator.MenuItem;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mashrur
 */
public class DinerMenuIterator implements Iterator {

    MenuItem[] menu;
    int pos;

    public DinerMenuIterator(MenuItem[] menu) {
        pos = 0;
        this.menu = menu;
    }

    @Override
    public boolean hasNext() {
        if (pos >= menu.length || menu[pos] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem item = menu[pos];
        pos += 1;
        return item;
    }

    @Override
    public void remove() {
        if (pos < 0) {
            try {
                throw new Exception();
            } catch (Exception ex) {
                Logger.getLogger(DinerMenuIterator.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (pos>0 && menu[pos - 1] != null) {
            for (int i = pos - 1; i < (menu.length - 1); i++) {
                menu[i] = menu[i + 1];
            }
            menu[menu.length - 1] = null;
      
        }
        else if(pos == 0) {
            pos = pos + 1;
        }
    }

}
