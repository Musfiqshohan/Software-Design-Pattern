/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.sdp.strategy;

import ducks.DecoyDuck;
import ducks.MallardDuck;
import ducks.ModelDuck;
import ducks.RubberDuck;
import flybehaviour.FlyRocketPowered;

/**
 *
 * @author mashrur
 */
public class Main {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        RubberDuck rubber = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();
        
        ModelDuck model = new ModelDuck();
        
        mallard.performQuack();
        rubber.performQuack();
        decoy.performQuack();
        
        model.performFly();
        model.setFlybehaviour(new FlyRocketPowered());
        model.performFly();
        
    }
}
