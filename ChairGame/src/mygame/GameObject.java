package mygame;

import com.jme3.scene.Spatial;
import com.jme3.bullet.objects.PhysicsRigidBody;

/**
 *
 * @author Louis
 */
abstract class GameObject {
    protected Spatial objectModel;
    protected PhysicsRigidBody rigidBody;

    abstract void update(float tpf);
}
