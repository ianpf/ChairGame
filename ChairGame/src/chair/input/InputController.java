/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chair.input;

import com.jme3.input.Joystick;
import com.jme3.math.Vector3f;

/**
 *
 * @author ptigwe
 */
public abstract class InputController 
{
    protected Joystick joystick;
    protected float leftXAxis;
    protected float leftYAxis;
    protected float rightXAxis;
    protected float rightYAxis;
    
    public InputController(Joystick joystick)
    {
        setJoystick(joystick);
    }
    
    private void setJoystick(Joystick joystick)
    {
        this.joystick = joystick;
    }
    
    public Joystick getJoystick()
    {
        return this.joystick;
    }
    
    public abstract Vector3f getLeftAxisVector();
    public void setLeftXAxis(float x)
    {
        if(x < InputListener.INPUT_THRESHOLD && x > -InputListener.INPUT_THRESHOLD)
        {
            if(leftYAxis < InputListener.INPUT_THRESHOLD && x > -InputListener.INPUT_THRESHOLD) 
            {
                x = 0;
            }
        }
        
        leftXAxis = x;
    }
    
    public void setLeftYAxis(float y)
    {
        if(y < InputListener.INPUT_THRESHOLD && y > -InputListener.INPUT_THRESHOLD)
        {
            if(leftXAxis < InputListener.INPUT_THRESHOLD && leftXAxis > -InputListener.INPUT_THRESHOLD)
            {
                y = 0;
            }
        }
        
        leftYAxis = y;
    }
    
    public void setRightXAxis(float x)
    {
        if(x < InputListener.INPUT_THRESHOLD && x > -InputListener.INPUT_THRESHOLD)
        {
            if(rightYAxis < InputListener.INPUT_THRESHOLD && rightYAxis > -InputListener.INPUT_THRESHOLD)
            {
                x = 0;
            }
        }
        rightXAxis = x;
    }
    
    public void setRightYAxis(float y)
    {
        if(y < InputListener.INPUT_THRESHOLD && y > -InputListener.INPUT_THRESHOLD)
        {
            if(rightYAxis < InputListener.INPUT_THRESHOLD && rightXAxis > -InputListener.INPUT_THRESHOLD)
            {
                y = 0;
            }
        }
        rightYAxis = y;
    }
    
    public abstract int getControllerID();
    public abstract float getLeftAxisDirection();
    public abstract float getLeftAxisPower();
    public abstract float getRightAxisDirection();
    public abstract float getRightAxisPower();
}
