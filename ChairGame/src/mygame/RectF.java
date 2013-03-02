package mygame;

import com.jme3.math.FastMath;
import com.jme3.math.Vector2f;

public class RectF {
	
	private float itsLeft;
	private float itsRight;
	private float itsBottom;
	private float itsTop;
	private float itsWidth;
	private float itsHeight;
	
	public RectF() {
		itsLeft = 0;
		itsRight = 0;
		itsBottom = 0;
		itsTop = 0;
		itsWidth = 0;
		itsHeight = 0;
	}
	public RectF(float left, float bottom, float width, float height) {
		itsLeft = left;
		itsBottom = bottom;
		itsWidth = width;
		itsHeight = height;
		itsTop = bottom + height;
		itsRight = left + width;
	}
	
	public float getLeft() {
		return itsLeft;
	}
	public float getRight() {
		return itsRight;
	}
	public float getBottom() {
		return itsBottom;
	}
	public float getTop() {
		return itsTop;
	}
	public float getWidth() {
		return itsWidth;
	}
	public float getHeight() {
		return itsHeight;
	}
	
	public Vector2f getTopLeft() {
		return new Vector2f(itsLeft, itsTop);
	}
	public Vector2f getTopRight() {
		return new Vector2f(itsRight, itsTop);
	}
	public Vector2f getBottomLeft() {
		return new Vector2f(itsLeft, itsBottom);
	}
	public Vector2f getBottomRight() {
		return new Vector2f(itsRight, itsBottom);
	}
	
	public void setLeft(float value) {
		itsLeft = value;
		itsRight = value + itsWidth;
	}
	public void setRight(float value) {
		itsRight = value;
		itsLeft = value - itsWidth;
	}
	public void setBottom(float value) {
		itsBottom = value;
		itsTop = value + itsHeight;
	}
	public void setTop(float value) {
		itsTop = value;
		itsBottom = value - itsHeight;
	}
	public void setWidth(float value) {
		itsWidth = value;
		itsRight = itsLeft + value;
	}
	public void setHeight(float value) {
		itsHeight = value;
		itsTop = itsBottom + value;
	}
	
	public Vector2f getCenter() {
		return new Vector2f((itsRight + itsLeft) / 2, (itsBottom + itsTop) / 2);
	}
	public void setCenter(Vector2f value) {
		setLeft(value.getX() - (itsWidth / 2));
		setBottom(value.getY() - (itsHeight / 2));
	}
	
}