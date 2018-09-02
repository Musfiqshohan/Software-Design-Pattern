/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.Jawad;

/**
 *
 * @author musfiq
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void change(NewClass f)
    {
        System.out.println("vitore "+f.a);
        f.a="zaoad";
        f=new NewClass();
        f.a="keshob";
    }
    public static void main(String[] args) {
        NewClass t=new NewClass();
        t.a="musfiq";
        change(t);
        System.out.println("baire"+t.a);
        // TODO code application logic here
    }
    
}
