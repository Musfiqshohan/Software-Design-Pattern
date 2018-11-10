/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorpattern;

import components.IComponent;

/**
 *
 * @author musfiq
 */
public interface IMediator {
    
    void setComponent(IComponent component);
    boolean set(IComponent component, int value);
    
}
