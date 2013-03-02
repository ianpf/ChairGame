package mygame;

import com.jme3.math.FastMath;

public class CircleF {
	
	private float itsX;
	private float itsY;
	private float itsRadius;
	
	public CircleF() {
		itsX = 0;
		itsY = 0;
		itsRadius = 0;
	}
	public CircleF(float x, float y, float radius) {
		itsX = x;
		itsY = y;
		itsRadius = radius;
	}
	
	public float getX() {
		return itsX;
	}
	public float getY() {
		return itsY;
	}
	public float getRadius() {
		return itsRadius;
	}
	
	public void setX(float value) {
		itsX = value;
	}
	public void setY(float value) {
		itsY = value;
	}
	public void setRadius(float value) {
		itsRadius = value;
	}
	
	public boolean collidesWithCircle(CircleF target) {
		float distanceX = FastMath.abs(itsX - target.getX());
		float distanceY = FastMath.abs(itsY - target.getY());
		float distance = FastMath.sqrt((itsX * itsX) + (itsY * itsY));
		return distance < (itsRadius + target.getRadius());
	}
	public boolean collidesWithRect(RectF target) {
		float left = itsX - itsRadius;
		float right = itsX + itsRadius;
		float bottom = itsY - itsRadius;
		float top = itsY + itsRadius;
		if ((itsY > target.getBottom()) && (itsY < target.getTop())) {
			if ((left < target.getRight()) && (left > target.getLeft()))
				return true;
			if ((right < target.getRight()) && (right > target.getLeft()))
				return true;
		}
		if ((itsX > target.getLeft()) && (itsX < target.getRight())) {
			if ((bottom < target.getTop()) && (bottom > target.getLeft()))
				return true;
			if ((top < target.getTop()) && (top > target.getLeft()))
				return true;
		}
		PointF center = new PointF(itsX, itsY);
		PointF a = new PointF(target.getLeft(), target.getTop());
		PointF b = new PointF(target.getRight(), target.getTop());
		PointF c = new PointF(target.getLeft(), target.getBottom());
		PointF d = new PointF(target.getRight(), target.getBottom());
		if (center.distanceFrom(a) < itsRadius)
			return true;
		if (center.distanceFrom(b) < itsRadius)
			return true;
		if (center.distanceFrom(c) < itsRadius)
			return true;
		if (center.distanceFrom(d) < itsRadius)
			return true;
		return false;
	}
	
}