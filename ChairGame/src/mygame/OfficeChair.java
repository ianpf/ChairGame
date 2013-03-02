package mygame;

import com.jme3.math.Vector3f;
import chair.input.*;
import com.jme3.scene.Spatial;
import com.jme3.bullet.objects.PhysicsRigidBody;

/**
 * @author Ian Fisher
 */
public class OfficeChair extends GameActor {
    private float angle;
    private int health = 100;
    private Vector3f position = new Vector3f();
    private Level gameLevel;
    private Weapon playerWeapon;
    private InputController playerInput;
    private float maxSpeed = 0.1f;

    public OfficeChair(Level gameLevel, Vector3f startPosition, float angle,
            InputController playerInput, Spatial objectModel, PhysicsRigidBody
                    rigidBody) {
        this.type = GameObjectType.ACTOR;
        this.health = health;
        this.rigidBody = rigidBody;
        this.objectModel = objectModel;
        this.angle = angle;
        this.position = startPosition;
        this.gameLevel = gameLevel;
        this.playerInput = playerInput;
    }
    
    public Vector3f getPosition(){
        return position;
    }
    
    public float getAngle(){
        return angle;
    }

    public Level getLevel() {
        return this.gameLevel;
    }
    
    public void onCollision(GameObject object) {
    }

    public void movement(Vector3f movementInput) {
        rigidBody.setLinearVelocity(movementInput);
    }

    public void setWeapon(Weapon playerWeaponTemp) {
        this.playerWeapon = playerWeaponTemp;
    }

    public void primaryAttack() {
        this.playerWeapon.usePrimary();
    }

    public void secondaryAttack() {
        this.playerWeapon.useSecondary();
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    // Get the health of the player
    void update(float tpf) {
        Vector3f mult = playerInput.getLeftAxisVector().mult(maxSpeed);
        System.out.println(mult.x + " " + mult.y + " " + mult.z);
        this.movement(playerInput.getLeftAxisVector().mult(maxSpeed));
        Vector3f local = this.objectModel.worldToLocal(this.rigidBody.getPhysicsLocation(), new Vector3f());
        this.objectModel.setLocalTranslation(local);
        angle = playerInput.getRightAxisDirection();
    }

    int getHealth() {
        return this.health;
    }
}