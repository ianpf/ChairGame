package mygame;

import com.jme3.math.FastMath;

public class PointF {
	
	private float itsX;
	private float itsY;
	
	public PointF() {
		itsX = 0;
		itsY = 0;
	}
	public PointF(float x, float y) {
		itsX = x;
		itsY = y;
	}
	
	public float getX() {
		return itsX;
	}
	public float getY() {
		return itsY;
	}
	
	public void setX(float value) {
		itsX = value;
	}
	public void setY(float value) {
		itsY = value;
	}
	
	public float distanceFrom(PointF target) {
		float x = FastMath.abs(itsX - target.getX());
		float y = FastMath.abs(itsY - target.getY());
		return FastMath.sqrt((x * x) + (y * y));
	}
	
}