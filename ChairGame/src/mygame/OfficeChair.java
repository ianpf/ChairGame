package mygame;

import com.jme3.math.Vector3f;
import chair.input.*;

/**
 * @author Ian Fisher
 */
public class OfficeChair extends GameActor {
    
    private float angle;
    private int health = 100;
    private Vector3f position = new Vector3f();
    private Level gameLevel;
    private Weapon playerWeapon;
    private XboxController playerInput;
    public OfficeChair(Level gameLevel, Vector3f startPosition, float angle, 
            XboxController playerInput) {
        this.health = health;
        this.angle = angle;
        this.position = startPosition;
        this.gameLevel = gameLevel;
        this.playerInput = playerInput;
    }

    public void chairCollision() {
    }

    public void movement(Vector3f movementInput) {
        rigidBody.setLinearVelocity(movementInput);
    }

    public void setWeapon(Weapon playerWeaponTemp) {
        this.playerWeapon = playerWeaponTemp;
    }

    public void primaryAttack() {
        this.playerWeapon.usePrimary(position, angle);
    }

    public void secondaryAttack() {
        this.playerWeapon.useSecondary(position, angle);
    }

    public void takeDamage(int damage) {
        health -= damage;
    }

    // Get the health of the player
    void update(float tpf) {
    }

    int getHealth() {
        return this.health;
    }
}