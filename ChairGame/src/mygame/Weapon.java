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
    
    private Level level;
    private String name;
    protected WeaponAttack primaryAttack;
    protected WeaponAttack secondaryAttack;
    
    public Weapon(Level level, String name, WeaponAttack primaryAttack, WeaponAttack secondaryAttack) {
        this.level = level;
        this.name = name;
        this.primaryAttack = primaryAttack;
        this.secondaryAttack = secondaryAttack;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void usePrimary(Vector3f location, float angle) {
        this.primaryAttack.use(level, location, angle);
    }
    public void useSecondary(Vector3f location, float angle) {
        this.secondaryAttack.use(level, location, angle);
    }
    
}
