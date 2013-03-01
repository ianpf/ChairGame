/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chair.input;

import com.jme3.input.InputManager;
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
public abstract class InputListener implements RawInputListener
{
    public static final double INPUT_THRESHOLD = 0.25;
    public InputListener(InputManager inputManager)
    {
        inputManager.addRawInputListener(this);
    }

    public void beginInput() {}

    public void endInput() {}

    public void onJoyAxisEvent(JoyAxisEvent evt) {}

    public void onJoyButtonEvent(JoyButtonEvent evt) {}

    public void onMouseMotionEvent(MouseMotionEvent evt) {}

    public void onMouseButtonEvent(MouseButtonEvent evt) {}

    public void onKeyEvent(KeyInputEvent evt) {}

    public void onTouchEvent(TouchEvent evt) {}
    
}
