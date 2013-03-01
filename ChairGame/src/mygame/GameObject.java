package mygame;

import com.jme3.scene.Spatial;

/**
 *
 * @author Louis
 */
abstract class GameObject {
    private Spatial objectModel;

    abstract void update(float tpf);
}
