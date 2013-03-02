/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

/**
 *
 * @author Louis
 */
import com.jme3.asset.AssetManager;
import com.jme3.audio.AudioRenderer;
import com.jme3.input.InputManager;
import com.jme3.niftygui.NiftyJmeDisplay;
import com.jme3.renderer.ViewPort;
import de.lessvoid.nifty.Nifty;
import de.lessvoid.nifty.screen.Screen;
import de.lessvoid.nifty.screen.ScreenController;
import mygame.Main;

public class GameMenuHUD implements ScreenController 
{   
    Nifty nifty;

    public void bind(Nifty nifty, Screen screen) {
        this.nifty = nifty;
    }

    
    
    public void startLevel(){
        Main.startLevel();
        nifty.exit();
        Main.gameState = 1;
        Main.changeAudio();
    }
    
    public void gameCredits(){
        Main.loadCredits();
    }
    
    public void onStartScreen() {
        
    }

    public void onEndScreen() {
    }

    public void quit() {
        nifty.exit();
        System.exit(0);

        Main.gameState = 1;
        //Main.simpleInitApp();
    }
}
