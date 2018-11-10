/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.lmediator;

import components.Hub;
import components.Spoke;
import components.Tire;

/**
 *
 * @author musfiq
 */
public class MediatorSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mediator mediator= new Mediator();
        
        Tire tire= new Tire(mediator);
        Hub hub= new Hub(mediator);
        Spoke spoke= new Spoke(mediator);
        
        tire.changeRadius(100);
        hub.changeRadius(20);
        spoke.changesize(80);
        
        System.out.println(tire.changeRadius(200));
        System.out.println(tire);
        System.out.println(hub);
        System.out.println(spoke);
        
        
        
        
    }
    
}
