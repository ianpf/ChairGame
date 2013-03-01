/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.jme3.math.Vector3f;

/**
 *
 * @author Alex
 */
public abstract class WeaponAttack {
    
    public abstract void use(Level level, Vector3f location, float angle);
    
}
