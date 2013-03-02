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
    
    private AudioRenderer audioRenderer;
    private AssetManager assetManager;
    private InputManager inputManager;
    private ViewPort guiViewPort;

    public GameMenuHUD(AudioRenderer ar, AssetManager as, InputManager in, ViewPort gvp) {
        audioRenderer = ar;
        assetManager = as;
        inputManager = in;
        guiViewPort = gvp;
    }

    public void bind(Nifty nifty, Screen screen) {
        this.nifty = nifty;
    }

    public void startLevel(){
        Main.startLevel();
        nifty.exit();
    }
    
    public void gameCredits(){
        //GameCredits creds = new GameCredits(audioRenderer, assetManager, audioRenderer, guiViewPort);
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
