package mygame;

import com.jme3.math.FastMath;

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
	
}