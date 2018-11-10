/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterators;

import com.du.iteratorpatter.MenuItem;
import java.util.Iterator;

/**
 *
 * @author musfiq
 */
public class DinerMenuIterator implements Iterator{
    
    MenuItem menuItems[];
    private int currentPos;
    

    public DinerMenuIterator(MenuItem mItem[]) {
        menuItems= mItem;
    }
    
    

    @Override
    public boolean hasNext() {
        
        if(currentPos>=menuItems.length || menuItems[currentPos]==null)
            return false;
        return true;
        
    }

    @Override
    public Object next() {
        
        MenuItem m= menuItems[currentPos];
        currentPos++;
        return m;
    }
    
    
    public void remove(){
        
        if(currentPos-1>=0 && menuItems[currentPos-1]!=null){
            
            for(int i=currentPos-1;i<menuItems.length;i++){
                menuItems[i]= menuItems[i+1];
            }
            menuItems[menuItems.length-1]=null;
           
        }
        else if(currentPos<0){
            try{
                throw new ArrayIndexOutOfBoundsException();
            }catch(Exception e){
                System.out.println(e);
            }
                
            
        }
        else if(currentPos==0){
            menuItems[currentPos]=null;
        } 
            
        
        
        
        
        
    }
    
    
}
