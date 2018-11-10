/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.lstrategypattern;

import ducks.DecoyDuck;
import ducks.MallardDuck;
import ducks.RubberDuck;

/**
 *
 * @author musfiq
 */
public class StrategySimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        mallardDuck.display();
        mallardDuck.perforFly();
        mallardDuck.perforQuack();
        mallardDuck.swim();

        rubberDuck.display();
        rubberDuck.perforFly();
        rubberDuck.perforQuack();
        rubberDuck.swim();

        decoyDuck.display();
        decoyDuck.perforFly();
        decoyDuck.perforQuack();
        decoyDuck.swim();

    }

}
