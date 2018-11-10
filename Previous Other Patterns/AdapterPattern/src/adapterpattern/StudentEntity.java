/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author musfiq
 */
public class StudentEntity {
    
     int id;
    String name;
    Date dob;
    Float result;

    public StudentEntity(int id, String name, Date dob, Float result) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.result = result;
    }
    
      public StudentEntity(Student ob) {
           
        this.id = (int)(ob.id);
        this.name = ob.name;
        
        try{
        dob=new SimpleDateFormat("dd/MM/yyyy").parse(ob.dob);
        }catch(Exception e){    System.out.println(e);}
        
        this.result = Float.valueOf(ob.result);
    }

    @Override
    public String toString() {
        return "StudentEntity{" + "id=" + id + ", name=" + name + ", dob=" + dob + ", result=" + result + '}';
    }
      
      
      
      
    
    
    
}
