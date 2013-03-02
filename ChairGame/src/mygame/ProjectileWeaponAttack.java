/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.jme3.math.Quaternion;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;

/**
 *
 * @author Alex
 */
public class ProjectileWeaponAttack extends WeaponAttack {
    
    private int damage;
    private float speed; 
    
    public ProjectileWeaponAttack(Weapon weapon) {
        super(weapon);
    }
    
    public void update(float tpf) {
        
    }
    public void use() {
        Vector3f vel = new Vector3f(0, 0, -1);
        
        float angle = getWeapon().getOwner().getAngle();
        float[] angles = {0, angle, 0};
        Quaternion rot = new Quaternion(angles);
        vel = rot.mult(vel);
        Projectile shot = new Projectile(getWeapon().getOwner().getBoundingCircle().getPosition(), new Vector2f(vel.getX(), vel.getZ()), damage);
        getWeapon().getOwner().getLevel().spawnProjectile(shot);
        System.out.println("SHOT");
    }
    
}
