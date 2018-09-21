/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumToIter;

/**
 *
 * @author musfiq
 */
public class Student {
    
    String name;
    int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", roll=" + roll + '}';
    }
    
    
    
    
    
}
