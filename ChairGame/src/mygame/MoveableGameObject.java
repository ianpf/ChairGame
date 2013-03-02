package mygame;

public class MoveableGameObject extends GameObject {
	
	protected CircleF boundingCircle;
	protected Vector2f velocity;
	
	public MoveableGameObject(CircleF boundingCircle) {
		super();
		this.boundingCircle = boudningCircle;
	}
	
	public void update(float tpf) {
		boundingCircle.getPosition().add(velocity.mult(tpf));
		moveToLocation(new Vector3f(boundingCircle.getPosition().getX(), 0, boundingCircle.getPosition().getY());
	}
	
}