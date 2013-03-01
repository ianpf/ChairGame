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
public class Weapon {
    
    private String name;
    protected WeaponAttack primaryAttack;
    protected WeaponAttack secondaryAttack;
    
    public Weapon(String name, WeaponAttack primaryAttack, WeaponAttack secondaryAttack) {
        this.name = name;
        this.primaryAttack = primaryAttack;
        this.secondaryAttack = secondaryAttack;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void usePrimary(Vector3f location, float angle) {
        this.primaryAttack.use(location, angle);
    }
    public void useSecondary(Vector3f location, float angle) {
        this.secondaryAttack.use(location, angle);
    }
    
}
