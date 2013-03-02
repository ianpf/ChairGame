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
    
    private Weapon weapon;
    
    public WeaponAttack(Weapon weapon) {
        this.weapon = weapon;
    }
    
    public Weapon getWeapon() {
        return this.weapon;
    }
    
    public abstract void use();
    
}
