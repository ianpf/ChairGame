/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.jme3.bullet.objects.PhysicsRigidBody;

/**
 *
 * @author Alex
 */
public class Projectile extends PhysicsRigidBody {
    
    private float x = 0;
    private float z = 0;
    private float speedX = 0;
    private float speedZ = 0;
    
    public Projectile(float x, float z, float speedX, float speedZ) {
        this.x = x;
        this.z = z;
        this.speedX = speedX;
        this.speedZ = speedZ;
    }
    
    public float getX() {
        return this.x;
    }
    public float getZ() {
        return this.z;
    }
    public float getSpeedX() {
        return this.speedX;
    }
    public float getSpeedZ() {
        return this.speedZ;
    }
    
    public void update(float tpf) {
       this.x += speedX * tpf;
       this.z += speedZ * tpf;
       
       //check collisions
       
    }
    
}
