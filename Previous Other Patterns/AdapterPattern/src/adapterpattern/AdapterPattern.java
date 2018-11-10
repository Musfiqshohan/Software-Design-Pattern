/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

/**
 *
 * @author musfiq
 */
public class AdapterPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Student ob1= null;//new Student(5, "shohan", "14/12/1997", "3.81");
       // Student ob1= new Student(5, "shohan", "14/12/1997", "3.81");
        
        if(ob1!=null){
         StudentEntity ob2= new StudentEntity(ob1);     
        System.out.println(ob2.toString());
        }
        
    }
    
}
