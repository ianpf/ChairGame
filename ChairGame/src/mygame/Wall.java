package mygame;

import com.jme3.math.Vector2f;
import com.jme3.scene.Spatial;

/**
 *
 * @author Charlie
 */
public class Wall extends StaticGameObject {
    
    public Wall(Spatial model, float left, float bottom, float width, float height){
        super(new RectF(left, bottom, width, height));
        this.objectModel = model;
        this.type = GameObjectType.OBSTACLE;
    }
    
    public void onCollision(GameObject other){}
    
}
