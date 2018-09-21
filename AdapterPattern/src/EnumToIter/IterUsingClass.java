/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumToIter;

import java.util.Iterator;

/**
 *
 * @author musfiq
 */
public class IterUsingClass {
    
    
    
    public static void showStudentInfo(Iterator  iterator ){
        
        System.out.println(iterator.toString());
        for( ; iterator.hasNext(); ){
            
            Student st= (Student)iterator.next();
            System.out.println(st.name+" "+st.roll);
          //  System.out.println("->"+ iterator.next().getClass().getName());
        }
        
        
    }
    
    
    public static void main(String[] args) {
        
        
        EnumUsingClass enUse= new EnumUsingClass();
        enUse.addStudent(new Student("shohan", 89));
        enUse.addStudent(new Student("Minar", 90));
        enUse.addStudent(new Student("Masud", 88));
        
        EnumToIteratorAdapter enumToIter= new EnumToIteratorAdapter(enUse.getAllStudent());
        
        showStudentInfo(enumToIter);
        
        
        
        
        
    }
    
    
}
