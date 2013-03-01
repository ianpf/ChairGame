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
    public KeyboardInputListener(InputManager inputManager)
    {
        super(inputManager);
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
