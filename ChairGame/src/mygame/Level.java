package mygame;

import chair.input.XboxController;
import chair.input.XboxInputListener;
import com.jme3.asset.AssetManager;
import com.jme3.bounding.BoundingBox;
import com.jme3.bullet.PhysicsSpace;
import com.jme3.bullet.collision.PhysicsCollisionEvent;
import com.jme3.bullet.collision.PhysicsCollisionListener;
import com.jme3.bullet.collision.shapes.BoxCollisionShape;
import com.jme3.bullet.objects.PhysicsRigidBody;
import com.jme3.input.InputManager;
import com.jme3.math.Vector3f;
import com.jme3.scene.Node;
import com.jme3.scene.Spatial;
import java.util.LinkedList;

/**
 *
 * @author Charlie
 */
public class Level implements PhysicsCollisionListener {
    
    PhysicsSpace physicsSpace;
    Node rootNode;
    AssetManager assetManager;
    InputManager inputManager;
    
 
    //Remove these from PhysicsSpace at the beginning of an update.
    LinkedList<GameObject> killUs;
    
    public Level(Node root, AssetManager assets, InputManager input){
        //We REALLY should implement a singleton...
        rootNode = root;
        assetManager = assets;
        inputManager = input;
        killUs = new LinkedList<GameObject>();
        
        XboxInputListener controllerListener = new XboxInputListener(input);
        Spatial chairSpatial = 
                assetManager.loadModel("Models/Angry Chair/Angry Chair.j3o");
        rootNode.attachChild(chairSpatial);
        Vector3f chairHalfExtent = 
                ((BoundingBox) chairSpatial.getWorldBound())
                    .getExtent(new Vector3f());
        chairHalfExtent = chairHalfExtent.mult(0.5f);
        PhysicsRigidBody chairBody = new PhysicsRigidBody(
                new BoxCollisionShape(chairHalfExtent));
        physicsSpace.addCollisionObject(chairBody);
        
        OfficeChair chair= new OfficeChair(
                this, 
                new Vector3f(0.0f, 0.0f, 0.0f),
                0.0f, 
                (XboxController) controllerListener.getInputControllers()[0], 
                chairSpatial,
                chairBody);
        
        
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
