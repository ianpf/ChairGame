package mygame;

import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import chair.input.*;
import com.jme3.scene.Spatial;
import com.jme3.bullet.objects.PhysicsRigidBody;
import com.jme3.math.Quaternion;

/**
 * @author Ian Fisher
 */
public class OfficeChair extends GameActor {
    
    private float angle;
    private int health = 100;
    private Level gameLevel;
    private Weapon playerWeapon;
    private InputController playerInput;
    
    public OfficeChair(Level gameLevel, Vector2f startPosition, float angle,
            InputController playerInput, Spatial objectModel) {
        super(new CircleF(startPosition, 1));
        this.type = GameObjectType.ACTOR;
        this.health = health;
        this.objectModel = objectModel;
        this.angle = angle;
        this.gameLevel = gameLevel;
        this.playerInput = playerInput;
        this.playerWeapon = new Weapon(this, "", null, null);
    }
    
    public float getAngle(){
        return angle;
    }

    public Level getLevel() {
        return this.gameLevel;
    }
    
    public void onCollision(GameObject object) {
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
        System.out.println("Health: " + this.getHealth());
    }

    // Get the health of the player
    public void update(float tpf)
    {
        super.update(tpf);
        Vector3f directionVector = playerInput.getLeftAxisVector();
        this.velocity.x = directionVector.getX();
        this.velocity.y = directionVector.getZ();
        
        XboxController controller = (XboxController)playerInput;
        
        if(controller.isLeftBumper())
        {
            secondaryAttack();
        }
        else if(controller.isRightBumper())
        {
            primaryAttack();
        }
        
        float[] angles = {0, playerInput.getRightAxisDirection(), 0};
        Quaternion rot = new Quaternion(angles);
        objectModel.setLocalRotation(rot);
    }
    

    int getHealth() {
        return this.health;
    }
}