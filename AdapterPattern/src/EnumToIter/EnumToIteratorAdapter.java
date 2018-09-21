/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumToIter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 *
 * @author musfiq
 */
public class EnumToIteratorAdapter implements Iterator {

    Enumeration eNum;

    public EnumToIteratorAdapter(Enumeration eNum) {
        this.eNum = eNum;
    }

    @Override
    public boolean hasNext() {
        return eNum.hasMoreElements();
    }

    @Override
    public Object next() {
        return eNum.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

}
