package mygame;

import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;

public abstract class MoveableGameObject extends GameObject {
	
	protected CircleF boundingCircle;
	protected Vector2f velocity;
        protected float maxSpeed = 1f;
	
	public MoveableGameObject(CircleF boundingCircle) {
		super();
		this.boundingCircle = boundingCircle;
                this.velocity = new Vector2f(0, 0);
	}
	
	public void update(float tpf) {
		boundingCircle.setPosition(boundingCircle.getPosition().add(velocity.mult(tpf*maxSpeed)));
                objectModel.setLocalTranslation(new Vector3f(boundingCircle.getPosition().getX(), boundingCircle.getPosition().getY(), 0));
                //System.out.println(boundingCircle.getPosition().getX() + " " + boundingCircle.getPosition().getY() + "\n");
               //System.out.println(this.objectModel.getLocalTranslation().getX() + " " + this.objectModel.getLocalTranslation().getY() + "\n");
	}
	
}