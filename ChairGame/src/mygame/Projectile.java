/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.jme3.math.Vector3f;
import com.jme3.math.Quaternion;

/**
 *
 * @author Alex
 */
public class Projectile extends GameObject {
    
    private int damage;
    private float angle;
    private float speed;
    
    private Vector3f direction;
    
    public Projectile(Vector3f location, int damage, float angle, float speed) {
        this.damage = damage;
        this.angle = angle;
        this.speed = speed;
        
        direction = new Vector3f(0, 0, 1);
        Quaternion q = new Quaternion(0, angle, 0, 0);
        direction = q.mult(direction);
        
        Vector3f movement = new Vector3f(direction);
        movement.mult(speed);
        
        rigidBody.setLinearVelocity(movement);
        
    }
    
    public int getDamage() {
        return this.damage;
    }
    
    public void update(float tpf) {
       
    }
    
}
