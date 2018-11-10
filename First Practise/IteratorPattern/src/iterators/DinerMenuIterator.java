/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterators;


import MainPackage.MenuItem;
import java.util.Iterator;

/**
 *
 * @author musfiq
 */
public class DinerMenuIterator  implements Iterator{

    MenuItem[] list;
    int position=0;
    
    
    
    public DinerMenuIterator(MenuItem[] list) {
        this.list= list;
    }

   

    @Override
    public boolean hasNext() {
        
        if(position >= list.length  || list[position]==null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = list[position];
        position=position+1;
        return menuItem;
    }
    
    
 
    public void remove()
    {
        if(position<=0)
        {
            throw new IllegalStateException("No entry");
        }
        
        if(list[position-1]!=null){
            for(int i=position-1 ; i<(list.length-1); i++){
                list[i]=list[i+1];
            }
            list[list.length-1]=null;
        }
    }
    
    
    
}
