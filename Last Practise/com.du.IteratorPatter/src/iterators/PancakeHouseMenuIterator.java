/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterators;

import com.du.iteratorpatter.MenuItem;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author musfiq
 */
public class PancakeHouseMenuIterator implements Iterator{
    
    private ArrayList<MenuItem> menuItems;
    int currentPos;

    public PancakeHouseMenuIterator(ArrayList m) {
        menuItems= m;
        currentPos=0;
    }
    
    

    @Override
    public boolean hasNext() {
        
        if(currentPos>=menuItems.size() || menuItems.get(currentPos)==null)
            return false;
        return true;
        
        
    }

    @Override
    public Object next() {
        
        MenuItem m= menuItems.get(currentPos);
        currentPos++;
        return m;
        
    }
    
    
    public void remove(){
        
        if(currentPos>=0 && currentPos<menuItems.size() &&  menuItems.get(currentPos)!=null){
            menuItems.remove(currentPos);
            
        }
        else{
            try{
                throw new Exception();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
    }
    
}
