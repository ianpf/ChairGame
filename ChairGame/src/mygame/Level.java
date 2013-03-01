package mygame;

import com.jme3.asset.AssetManager;
import com.jme3.bullet.PhysicsSpace;
import com.jme3.bullet.collision.PhysicsCollisionEvent;
import com.jme3.bullet.collision.PhysicsCollisionListener;
import com.jme3.scene.Node;
import java.util.LinkedList;

/**
 *
 * @author Charlie
 */
public class Level implements PhysicsCollisionListener {
    
    PhysicsSpace physicsSpace;
    Node rootNode;
    AssetManager assetManager;
    
 
    //Remove these from PhysicsSpace at the beginning of an update.
    LinkedList<GameObject> killUs;
    
    public Level(Node root, AssetManager manager){
        rootNode = root;
        assetManager = manager;
        killUs = new LinkedList<GameObject>();
        

    }
    
    
    /**
     *
     * @param shot
     */
    public void spawnProjectile(Projectile shot){
        //This will do stuff.
    }
    
    /**
     *
     * @param requestor
     */
    public void removeSelf(GameObject requestor){
        killUs.add(requestor);
    }
    
    /**
     *
     * @param event
     */
    @Override
    public void collision(PhysicsCollisionEvent event){
        
    }
    
    /**
     *
     * @param tpf
     */
    public void update(float tpf){
        for(GameObject g : killUs){
            physicsSpace.removeAll(g.objectModel);
            switch (g.type){
                case ACTOR: 
                    rootNode.detachChild(g.objectModel);
                    break;
                case PROJECTILE:
                    break;
                case OBSTACLE:
                    break;
                default:
            }
            killUs.remove(g);
        }
    }
    
    
    
}
