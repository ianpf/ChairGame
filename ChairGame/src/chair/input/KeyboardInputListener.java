/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chair.input;

import com.jme3.input.InputManager;
import com.jme3.input.event.KeyInputEvent;

/**
 *
 * @author ptigwe
 */
public class KeyboardInputListener extends InputListener
{
    InputController controllers[];
    public KeyboardInputListener(InputManager inputManager)
    {
        super(inputManager);
        inputManager.addRawInputListener(this);
        
        controllers = new InputController[1];
        controllers[0] = new KeyboardInput();
    }
    
    public InputController[] getInputControllers()
    {
        return controllers;
    }
    
    @Override
    public void onKeyEvent(KeyInputEvent evt)
    {
        System.out.println(evt.getKeyChar());
        switch(evt.getKeyChar())
        {
            case 'W':
            case 'w':
                controllers[0].setLeftYAxis(1);
                break;
            case 'A':
            case 'a':
                controllers[0].setLeftXAxis(-1);
                break;
            case 'S':
            case 's':
                controllers[0].setLeftYAxis(-1);
                break;
            case 'D':
            case 'd':
                controllers[0].setLeftXAxis(1);
                break;
            default:
        }
    }
}
