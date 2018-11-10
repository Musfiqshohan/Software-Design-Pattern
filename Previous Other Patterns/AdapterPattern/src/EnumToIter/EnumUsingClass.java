/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumToIter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

/**
 *
 * @author musfiq
 */
public class EnumUsingClass {
    
    private ArrayList<Student>arrayList;

    public EnumUsingClass() {
        
        arrayList= new ArrayList<>();
        
        arrayList.add(new Student("A",05));
        arrayList.add(new Student("B",17));
        arrayList.add(new Student("C",23));
    }
    
    public void addStudent(Student s){
        
        arrayList.add(s);       
    }
    
    
    public Enumeration getAllStudent(){
        Enumeration<Student>eNum= Collections.enumeration(arrayList);  
        return eNum;
    }
    
    

}
