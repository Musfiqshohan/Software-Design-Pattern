/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observers;

/**
 *
 * @author mashrur
 */
public interface Observer {
    public void update(float temperature, float pressure, float humidity);
}
