/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.jme3.math.Vector2f;
import com.jme3.math.Quaternion;
import com.jme3.scene.Spatial;

/**
 *
 * @author Alex
 */
public class Projectile extends MoveableGameObject {
    
    private int damage;
    private float angle;
    private float speed;
    
    private Vector2f direction;
    
    public Projectile(Vector2f location, Vector2f velocity, int damage) {
        super(new CircleF(location, 0.5f));
        this.type = GameObjectType.PROJECTILE;
        this.velocity = velocity;
        this.damage = damage;
            
    }
    
    public int getDamage() {
        return this.damage;
    }
    
    public void update(float tpf) {
       super.update(tpf);
    }
    
    public void onCollision(GameObject object) {
        
    }
    
}
