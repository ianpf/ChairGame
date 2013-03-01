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
public class ProjectileWeaponAttack extends WeaponAttack {
    
    private int damage;
    private float speed; 
    
    public void update(float tpf) {
        
    }
    public void use(Level level, Vector3f location, float angle) {
        Projectile shot = new Projectile(location, damage, angle, speed);
        level.spawnProjectile(shot);
    }
    
}
