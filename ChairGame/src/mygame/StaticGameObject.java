package mygame;

import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;

public abstract class StaticGameObject extends GameObject {
	
	protected RectF boundingRect;
	protected Vector2f velocity;
        protected float maxSpeed = 1f;
	
	public StaticGameObject(RectF boundingRect) {
		super();
		this.boundingRect = boundingRect;
                this.velocity = new Vector2f(0, 0);
	}
	
	public void update(float tpf) {
		boundingRect.setCenter(boundingRect.getCenter().add(velocity.mult(tpf*maxSpeed)));
                objectModel.setLocalTranslation(new Vector3f(boundingRect.getCenter().getX(), 0, boundingRect.getCenter().getY()));
                //System.out.println(boundingCircle.getPosition().getX() + " " + boundingCircle.getPosition().getY() + "\n");
               //System.out.println(this.objectModel.getLocalTranslation().getX() + " " + this.objectModel.getLocalTranslation().getY() + "\n");
	}
	
}