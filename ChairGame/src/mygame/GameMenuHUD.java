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
    private AudioRenderer audioRenderer;
    private AssetManager assetManager;
    private InputManager inputManager; 
    private ViewPort guiViewPort;
    
    public GameMenuHUD (AudioRenderer ar, AssetManager am, InputManager im, ViewPort gvp){
        audioRenderer = ar;
        assetManager = am;
        inputManager = im;
        guiViewPort = gvp;
    }
    
    Nifty nifty;

    public void bind(Nifty nifty, Screen screen) {
        this.nifty = nifty;
    }

    public void startLevel(){
        
        Main.startLevel();
        nifty.exit();
    }
    
    public void gameCredits(){
        nifty.exit();
        
    }
    
    public void onStartScreen() {
        
    }

    public void onEndScreen() {
    }

    public void quit() {
        nifty.exit();

        Main.gameState = 1;
        //Main.simpleInitApp();
    }
}
