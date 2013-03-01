/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chair.input;

import com.jme3.input.Joystick;

/**
 *
 * @author ptigwe
 */
public abstract class InputController 
{
    protected Joystick joystick;
    protected double leftXAxis;
    protected double leftYAxis;
    protected double rightXAxis;
    protected double rightYAxis;
    
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
    
    public void setLeftXAxis(double x)
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
    
    public void setLeftYAxis(double y)
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
    
    public void setRightXAxis(double x)
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
    
    public void setRightYAxis(double y)
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
    public abstract double getLeftAxisDirection();
    public abstract double getLeftAxisPower();
    public abstract double getRightAxisDirection();
    public abstract double getRightAxisPower();
}
