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
    
    public static String[] models = {
        "Models/Angry Chair/Angry Chair.j3o",
        "Models/cowboyChair/cowboyChair.j3o",
        "Models/fezzChair/fezzChair.j3o",
        "Models/fruityChair/fruityChair.j3o",
        "Models/partyChair/partyChair.j3o",
        "Models/stillChair/stillChair.j3o"
    };
    
    public OfficeChair(Level gameLevel, Vector2f startPosition, float angle,
            InputController playerInput, Spatial objectModel) {
        super(new CircleF(startPosition, 1));
        this.type = GameObjectType.ACTOR;
        this.health = health;
        this.objectModel = objectModel;
        this.angle = angle;
        this.gameLevel = gameLevel;
        this.playerInput = playerInput;
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
        
        this.angle = playerInput.getRightAxisDirection();
        float[] angles = {0, angle, 0};
        Quaternion rot = new Quaternion(angles);
        objectModel.setLocalRotation(rot);
    }
    

    int getHealth() {
        return this.health;
    }
}