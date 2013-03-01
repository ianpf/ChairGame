/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chair.input;

import com.jme3.input.Joystick;
import com.jme3.input.JoystickAxis;
import com.jme3.input.controls.AnalogListener;
import com.jme3.input.controls.JoyAxisTrigger;
import com.jme3.math.FastMath;
import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;

/**
 *
 * @author ptigwe
 */
public class XboxController extends InputController
{
    public static final int LEFT_STICK_X = 0;
    public static final int LEFT_STICK_Y = 1;
    public static final int RIGHT_STICK_X = 2;
    public static final int RIGHT_STICK_Y = 3;
    public static final int LEFT_TRIGGER = 4;
    public static final int RIGHT_TRIGGER = 5;
    
    private Joystick joystick;
    
    public XboxController(Joystick joystick)
    {
        super(joystick);
    }
    
    public int getControllerID()
    {
        return this.getJoystick().getJoyId();
    }
    
    public Vector3f getLeftAxisVector()
    {
        Vector3f dir;
        dir = new Vector3f(leftXAxis, 0, -leftYAxis);
        
        return dir;
    }
    
    @Override
    public float getLeftAxisDirection() 
    {
        //System.out.println("LX: " + leftXAxis + " LY: " + leftYAxis);
        Vector2f dir;
        dir = new Vector2f(leftXAxis, -leftYAxis);
        float length = Math.min(1, dir.length());
        dir.normalizeLocal();
            
        return dir.getAngle();
    }

    @Override
    public float getLeftAxisPower() 
    {
        Vector2f dir = new Vector2f(leftXAxis, -leftYAxis);
        float length = java.lang.Math.min(1, dir.length());
        
        return Math.min(1, dir.length());
    }

    @Override
    public float getRightAxisDirection() 
    {
        //System.out.println("RX: " + rightXAxis + " RY: " + rightYAxis);
        Vector2f dir;
        dir = new Vector2f(rightXAxis, rightYAxis);
        dir.normalizeLocal();
            
        return dir.getAngle();
    }

    @Override
    public float getRightAxisPower() 
    {
        Vector2f dir;
        dir = new Vector2f(rightXAxis, rightYAxis);
        
        return Math.min(1, dir.length());
    }
}
