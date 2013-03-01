/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

/**
 *
 * @author Louis
 */
import com.jme3.niftygui.NiftyJmeDisplay;
import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;
import mygame.Main;

public class GameMenuHUD extends Main implements ScreenController {

    public void bind(Nifty nifty, Screen screen) {
        this.nifty = nifty;
    }

    public void onStartScreen() {
        Main.l = new Level(rootNode, assetManager, inputManager);
    }

    public void onEndScreen() {
    }

    public void quit() {
        nifty.exit();
        gameState = 1;
        simpleInitApp();
    }
}
