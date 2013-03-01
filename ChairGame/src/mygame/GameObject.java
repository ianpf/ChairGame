package mygame;

import com.jme3.scene.Spatial;
import com.jme3.bullet.objects.PhysicsRigidBody;

/**
 *
 * @author Louis
 * @author Charlie
 */
public abstract class GameObject {
    protected Spatial objectModel;
    protected PhysicsRigidBody rigidBody;
    protected GameObjectType type;


    abstract void update(float tpf);
    
    abstract void onCollision(GameObject other);
}

