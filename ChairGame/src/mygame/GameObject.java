package mygame;

import com.jme3.scene.Spatial;
import com.jme3.bullet.objects.PhysicsRigidBody;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;

/**
 *
 * @author Louis
 * @author Charlie
 */
public abstract class GameObject {
    protected Spatial objectModel;
    protected GameObjectType type;
    
    void moveToLocation(Vector3f newLocation){
        objectModel.setLocalTranslation(
                objectModel.worldToLocal(newLocation, new Vector3f()));
    }
	
	
    abstract void update(float tpf);
    
    abstract void onCollision(GameObject other);
}

