/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import Menu.DinerMenu;
import Menu.Menu;
import Menu.PancakeHouseMenu;

/**
 *
 * @author musfiq
 */
public class IteratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu diner = new DinerMenu();
        
        
        
        diner.addItem("Rice", "Plain Rice", true, 100f);
        diner.addItem("Rice", "Fried Rice", true, 101.4f);
        diner.addItem("Chicken", "Hybrid", false, 200f);
        
        Menu panMenu = new PancakeHouseMenu();
        panMenu.addItem("Cake", "Chocolate Cake", true, 500f);
        panMenu.addItem("Roll", "Chicken", false, 400f);
        panMenu.addItem("Pizza", "Vegetable", true, 500f);
        
        Waitress waiter = new Waitress(panMenu, diner);
        waiter.printMenu();
        
    }
    
}
