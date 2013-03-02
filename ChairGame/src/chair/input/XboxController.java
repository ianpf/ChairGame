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
    
    public static final int DIR_UP = 0;
    public static final int DIR_DOWN = 1;
    public static final int DIR_LEFT = 2;
    public static final int DIR_RIGHT = 3;
    public static final int START = 4;
    public static final int BACK = 5;
    public static final int LSBUTTON = 6;
    public static final int RSBUTTON = 7;
    public static final int LEFT_BUMPER = 8;
    public static final int RIGHT_BUMPER = 9;
    public static final int XBOX_BUTTON = 10;
    public static final int A_BUTTON = 11;
    public static final int B_BUTTON = 12;
    public static final int X_BUTTON = 13;
    public static final int Y_BUTTON = 14;
    
    private boolean isDirUp;
    private boolean isDirDown;
    private boolean isDirLeft;
    private boolean isDirRight;
    private boolean isStart;
    private boolean isBack;
    private boolean isLSButton;
    private boolean isRSButton;
    private boolean isLeftBumper;
    private boolean isRightBumper;
    private boolean isXBoxButton;
    private boolean isA_Button;
    private boolean isB_Button;
    private boolean isX_Button;
    private boolean isY_Button;
    
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
        
        String os = System.getProperty("os.name").toLowerCase();
        if(os.indexOf("win") >= 0)
        {
            dir = new Vector3f(-leftYAxis, 0, leftXAxis);
        }
        else
        {
            dir = new Vector3f(-leftXAxis, 0, -leftYAxis);
        }
        
        return dir;
    }
    
    @Override
    public float getLeftAxisDirection() 
    {
        String os = System.getProperty("os.name").toLowerCase();
        
        //System.out.println("LX: " + leftXAxis + " LY: " + leftYAxis);
        Vector2f dir;
        if(os.indexOf("win") >= 0)
        {
            dir = new Vector2f(-leftYAxis, leftXAxis);
        }
        else
        {
            dir = new Vector2f(leftXAxis, -leftYAxis);
        }
        float length = Math.min(1, dir.length());
        dir.normalizeLocal();
            
        return dir.getAngle();
    }

    @Override
    public float getLeftAxisPower() 
    {
        String os = System.getProperty("os.name").toLowerCase();
        
        //System.out.println("LX: " + leftXAxis + " LY: " + leftYAxis);
        Vector2f dir;
        if(os.indexOf("win") >= 0)
        {
            dir = new Vector2f(-leftYAxis, leftXAxis);
        }
        else
        {
            dir = new Vector2f(leftXAxis, -leftYAxis);
        }
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
    
    public boolean isDirUp()
    {
        boolean res = isDirUp;
        
        isDirUp = false;
        
        return res;
    }
    
    public void setDirUp()
    {
        isDirUp = true;
    }
    
    public boolean isDirDown()
    {
        boolean res = isDirDown;
        
        isDirDown = false;
        
        return res;
    }
    
    public void setDirDown()
    {
        isDirDown = true;
    }
    
    public boolean isDirLeft()
    {
        boolean res = isDirLeft;
        
        isDirLeft = false;
        
        return res;
    }
    
    public void setDirLeft()
    {
        isDirLeft = true;
    }
    
    public boolean isDirRight()
    {
        boolean res = isDirRight;
        
        isDirRight = false;
        
        return res;
    }
    
    public void setDirRight()
    {
        isDirRight = true;
    }
    
    public boolean isStart()
    {
        boolean res = isStart;
        
        isStart = false;
        
        return res;
    }
    
    public void setStart()
    {
        isStart = true;
    }
    
    public boolean isBack()
    {
        boolean res = isBack;
        
        isBack = false;
        
        return res;
    }
    
    public void setBack()
    {
        isBack = true;
    }
    
    public boolean isLSButton()
    {
        boolean res = isLSButton;
        
        isLSButton = false;
        
        return res;
    }
    
    public void setLSButton()
    {
        isLSButton = true;
    }
    
    public boolean isRSButton()
    {
        boolean res = isRSButton;
        
        isRSButton = false;
        
        return res;
    }
    
    public void setRSButton()
    {
        isRSButton = true;
    }
    
    public boolean isLeftBumper()
    {
        boolean res = isLeftBumper;
        
        isLeftBumper = false;
        
        return res;
    }
    
    public void setLeftBumper()
    {
        isLeftBumper = true;
    }
    
    public boolean isRightBumper()
    {
        boolean res = isRightBumper;
        
        isRightBumper = false;
        
        return res;
    }
    
    public void setRightBumper()
    {
        isRightBumper = true;
    }
    
    public boolean isXBoxButton()
    {
        boolean res = isXBoxButton;
        
        isXBoxButton = false;
        
        return res;
    }
    
    public void setXBoxButton()
    {
        isXBoxButton = true;
    }
    
    public boolean isA_Button()
    {
        boolean res = isA_Button;
        
        isA_Button = false;
        
        return res;
    }
    
    public void setA_Button()
    {
        isA_Button = true;
    }
    
    public boolean isB_Button()
    {
        boolean res = isB_Button;
        
        isB_Button = false;
        
        return res;
    }
    
    public void setB_Button()
    {
        isB_Button = true;
    }
    
    public boolean isX_Button()
    {
        boolean res = isX_Button;
        
        isX_Button = false;
        
        return res;
    }
    
    public void setX_Button()
    {
        isX_Button = true;
    }
    
    public boolean isY_Button()
    {
        boolean res = isY_Button;
        
        isY_Button = false;
        
        return res;
    }
    
    public void setY_Button()
    {
        isY_Button = true;
    }
}
