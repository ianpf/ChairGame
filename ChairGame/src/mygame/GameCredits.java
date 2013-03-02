/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.jme3.asset.AssetManager;
import com.jme3.audio.AudioRenderer;
import com.jme3.effect.ParticleEmitter;
import com.jme3.effect.ParticleMesh;
import com.jme3.input.FlyByCamera;
import com.jme3.input.InputManager;
import com.jme3.material.Material;
import com.jme3.niftygui.NiftyJmeDisplay;
import com.jme3.renderer.ViewPort;
import com.jme3.scene.Node;
import de.lessvoid.nifty.Nifty;

/**
 *
 * @author Louis
 */
public class GameCredits {

    private AudioRenderer audioRenderer;
    private AssetManager assetManager;
    private InputManager inputManager; 
    private ViewPort guiViewPort;
    public static GameCredits creds;
    
    public GameCredits (AudioRenderer ar, AssetManager am, InputManager im, ViewPort gvp){
        audioRenderer = ar;
        assetManager = am;
        inputManager = im;
        guiViewPort = gvp;
    }
    
    public Nifty nifty;
    public void displayCredits(){
        
        NiftyJmeDisplay niftyDisplay = new NiftyJmeDisplay(assetManager, inputManager, audioRenderer, guiViewPort);
        nifty = niftyDisplay.getNifty();
        nifty.fromXml("Interface/XML/mainmenu.xml", "start");
        // attach the nifty display to the gui view port as a processor
        guiViewPort.addProcessor(niftyDisplay);
        // disable the fly cam


    }
    
    
}
