/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.du.lmediator;

import components.*;

/**
 *
 * @author musfiq
 */
public interface IMediator {
    
    public boolean set(IComponent component, double value);
    public void setComponent(IComponent component);
    
}
