/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chair.input;

import com.jme3.input.InputManager;
import com.jme3.input.Joystick;
import com.jme3.input.RawInputListener;
import com.jme3.input.event.JoyAxisEvent;
import com.jme3.input.event.JoyButtonEvent;
import com.jme3.input.event.KeyInputEvent;
import com.jme3.input.event.MouseButtonEvent;
import com.jme3.input.event.MouseMotionEvent;
import com.jme3.input.event.TouchEvent;

/**
 *
 * @author ptigwe
 */
public class XboxInputListener extends InputListener
{
    private InputController[] controllers;
    
    public XboxInputListener(InputManager inputManager)
    {
        super(inputManager);
        Joystick joysticks[] = inputManager.getJoysticks();
        if (joysticks == null)
            System.exit(4);
        
        controllers = new InputController[joysticks.length];
        
        for(int i = 0; i < joysticks.length; ++i)
        {
            controllers[i] = new XboxController(joysticks[i]);
        }
    }
    
    public InputController[] getInputControllers()
    {
        return controllers;
    }

    public void onJoyAxisEvent(JoyAxisEvent evt) 
    {
        float value = evt.getValue();
        
        InputController ic = controllers[0];
        
        for(InputController c : controllers)
        {
            if(c.getControllerID() == evt.getJoyIndex())
            {
                ic = c;
                break;
            }
        }
        
        switch(evt.getAxisIndex())
        {
            case XboxController.LEFT_STICK_X:
                ic.setLeftXAxis(value);
                break;
            case XboxController.LEFT_STICK_Y:
                ic.setLeftYAxis(value);
                break;
            case XboxController.RIGHT_STICK_X:
                ic.setRightXAxis(value);
                break;
            case XboxController.RIGHT_STICK_Y:
                ic.setRightYAxis(value);
                break;
            case XboxController.LEFT_TRIGGER:
                break;
            case XboxController.RIGHT_TRIGGER:
                break;
            default:
        }
    }

    public void onJoyButtonEvent(JoyButtonEvent evt) 
    {
        InputController ic = controllers[0];
        
        for(InputController c : controllers)
        {
            if(c.getControllerID() == evt.getJoyIndex())
            {
                ic = c;
                break;
            }
        }
        
        switch(evt.getButtonIndex())
        {
            case XboxController.DIR_UP:
                break;
            case XboxController.DIR_DOWN:
                break;
            case XboxController.DIR_LEFT:
                break;
            case XboxController.DIR_RIGHT:
                break;
            case XboxController.START:
                break;
            case XboxController.BACK:
                break;
            case XboxController.LSBUTTON:
                break;
            case XboxController.RSBUTTON:
                break;
            case XboxController.LEFT_BUMPER:
                break;
            case XboxController.RIGHT_BUMPER:
                break;
            case XboxController.XBOX_BUTTON:
                break;
            case XboxController.A_BUTTON:
                break;
            case XboxController.B_BUTTON:
                break;
            case XboxController.X_BUTTON:
                break;
            case XboxController.Y_BUTTON:
                break;
            default:
        }
    }

}
