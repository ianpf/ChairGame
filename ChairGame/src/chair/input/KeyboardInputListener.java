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
        controllers = new InputController[1];
        controllers[0] = new KeyboardInput();
    }
    
    public void onKeyEvent(KeyInputEvent evt)
    {
        switch(evt.getKeyChar())
        {
            case 'W':
                break;
            case 'A':
                break;
            case 'S':
                break;
            case 'D':
                break;
            default:
        }
    }
}
