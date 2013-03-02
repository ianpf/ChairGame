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
    
    private OfficeChair owner;
    private String name;
    protected WeaponAttack primaryAttack;
    protected WeaponAttack secondaryAttack;
    
    public Weapon(OfficeChair owner, String name, WeaponAttack primaryAttack, WeaponAttack secondaryAttack) {
        this.owner = owner;
        this.name = name;
        this.primaryAttack = new ProjectileWeaponAttack(this);
        this.secondaryAttack = secondaryAttack;
        primaryAttack = new MeleeWeaponAttack(this);
    }
    
    public OfficeChair getOwner() {
        return this.owner;
    }
    public String getName() {
        return this.name;
    }
    
    public void usePrimary() {
        if (this.primaryAttack != null) {
            this.primaryAttack.use();
        }
    }
    public void useSecondary() {
        if (this.secondaryAttack != null) {
            this.secondaryAttack.use();
        }
    }
    
}
