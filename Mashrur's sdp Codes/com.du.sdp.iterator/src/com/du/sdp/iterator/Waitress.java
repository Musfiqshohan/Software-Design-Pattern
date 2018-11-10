/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.sdp.iterator;

import java.util.Iterator;
import menu.Menu;

/**
 *
 * @author mashrur
 */
public class Waitress {
    Menu dinerMenu;
    Menu panMenu;
    
    public Waitress(Menu panMenu, Menu dinerMenu) {
        this.panMenu = panMenu;
        this.dinerMenu = dinerMenu;
    }
    
    public void printMenu() {
        Iterator diner = dinerMenu.createIterator();
        Iterator pan = panMenu.createIterator();
        
        System.out.println("\n---------Breakfast---------\n");
        printMenu(pan);
        
        System.out.println("\n-------Lunch-----------\n");
        printMenu(diner);
    }
    
    private void printMenu(Iterator it) {
        while(it.hasNext()) {
            MenuItem item = (MenuItem) it.next();
            System.out.println("Name: " + item.getName() + " Description: " + item.getDescrition() + " Price: " + item.getPrice());
        }
    }
    
}
