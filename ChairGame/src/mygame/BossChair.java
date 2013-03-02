package mygame;
import com.jme3.math.Vector3f;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian
 */
public class BossChair extends GameActor {
    private float angle;
    private int health = 5000;
    private Vector3f position;
    private Level gameLevel;
    private float maxSpeed = 0.11f;
    public void update(float tpf) {
    }
    
    public BossChair (CircleF circle){
        super(circle);
    }

    public void takeDamage(int damage) {
        health -= damage;
    }
    
    public void BossChair(){
        this.type = GameObjectType.ACTOR;    
    }
    public void onCollision(GameObject object){
    }
}