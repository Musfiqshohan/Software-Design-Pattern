/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.iteratorpatter;

import menu.DinerMenu;
import menu.PancakeHouseMenu;

/**
 *
 * @author musfiq
 */
public class IteratorSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DinerMenu dinerMenu= new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu= new PancakeHouseMenu();
        
        dinerMenu.addItem("N1", "D1", true, 100);
        dinerMenu.addItem("N2", "D2", false, 200);
        dinerMenu.addItem("N3", "D3", true, 300);
        dinerMenu.addItem("N4", "D4", true, 400);
        
        
        pancakeHouseMenu.addItem("M1", "E1", false, 150);
        pancakeHouseMenu.addItem("M2", "E2", false, 250);
        pancakeHouseMenu.addItem("M3", "E3", true, 350);
        pancakeHouseMenu.addItem("M4", "E4", true, 450);
        
        
        Waitress waitress= new Waitress(dinerMenu, pancakeHouseMenu);
        
        
        waitress.printMenu();
        
        
    }
    
}
