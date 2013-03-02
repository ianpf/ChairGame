/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.jme3.asset.AssetManager;
import com.jme3.audio.AudioNode;
import com.jme3.audio.AudioRenderer;
import com.jme3.audio.Environment;
import com.jme3.scene.Node;
import java.util.Random;

/**
 *
 * @author Darren
 */
public class Soundtrack {
    
    // AssetManager, rootNode and audioRenderer passed from Main.java
    // AssetManager allows references to the files in /Sounds/.
    // Node stores the rootNode so that audioNodes can be attached.
    // AudioRenderer is stored so that environments can be set.
    private AssetManager assetManager;
    private Node rootNode;
    private AudioRenderer audioRenderer;
    
    // AudioNodes to store each sound file imported
    private AudioNode menu_music;
    
    private AudioNode ingame_music_1;
    private AudioNode ingame_music_2;
    private AudioNode ingame_music_3;
    private AudioNode ingame_music_4;
    private AudioNode ingame_music_5;
    
    public AudioNode currentSong; // keeps track of song playing
    
    private AudioNode bloodSplatt;
    private AudioNode extinguisherSpray;
    private AudioNode coffeeMugSmash;
    private AudioNode stapleGunSound;
    private AudioNode droppingPinsSound;
    private AudioNode paperPlaneSound;
    private AudioNode rulerSwipeSound;
    private AudioNode rolledUpPaperSwipe;
    private AudioNode rubberBandSound;
    private AudioNode keyboardSlapSound;

    // Custom environment created to give equalizer effect of an 'office'
    private Environment officeEnvironment;
    
    // Generates a random number (used to choose random song)
    Random randomGenerator;
    
    // Constructor sets up assetManager, rootNode and audioRender with values
    // passed from Main.java and initialises the 'officeEnvironment' equalizer.
    public Soundtrack(AssetManager manager, Node root, AudioRenderer renderer) {
        
        assetManager = manager;
        rootNode = root;
        audioRenderer = renderer;
        officeEnvironment = new Environment(new float[]{ 26, 1.86f, 0.690f, -1000, -400, -600, 0.98f, 0.45f, 0.18f, 300, 0.017f, 0f, 0f, 0f, 300, 0.015f, 0f, 0f, 0f, 0.095f, 0.140f, 0.250f, 0f, -5f, 7176.9f, 211.2f, 0f, 0x20});
        randomGenerator = new Random();
    }
    
    public void initAudio() {
        
        // sets the environment of the audioRender with the 'officeEnvironment'
        // equalizer created in the constructor.
        audioRenderer.setEnvironment(new Environment(officeEnvironment));
    
        // initialise all songs with files from the directory.
        // the 'true' parameter denotes that audio will be streamed,
        // 'false' parameter denotes that audio will be pre-buffered.
        menu_music = new AudioNode(assetManager, "Sounds/Music/EightiesAction.ogg", false);
        ingame_music_1 = new AudioNode(assetManager, "Sounds/Music/KickShock.ogg", true);
        ingame_music_2 = new AudioNode(assetManager, "Sounds/Music/Clubbin8bit.ogg", true);
        ingame_music_3 = new AudioNode(assetManager, "Sounds/Music/KommanderKullTheme.ogg", true);
        ingame_music_4 = new AudioNode(assetManager, "Sounds/Music/NihiliticiaTheme.ogg", true);
        ingame_music_5 = new AudioNode(assetManager, "Sounds/Music/VectorsFunAndStuff.ogg", true);
        bloodSplatt = new AudioNode(assetManager, "Sounds/Effects/bloodSplatt.ogg", false);
        extinguisherSpray = new AudioNode(assetManager, "Sounds/Effects/extinguisherSpray.ogg", false);
        coffeeMugSmash = new AudioNode(assetManager, "Sounds/Effects/coffeeMugSmash.ogg", false);
        stapleGunSound = new AudioNode(assetManager, "Sounds/Effects/stapleGun.ogg", false);
        droppingPinsSound = new AudioNode(assetManager, "Sounds/Effects/droppingPins.ogg", false);
        paperPlaneSound = new AudioNode(assetManager, "Sounds/Effects/paperPlane.ogg", false);
        rulerSwipeSound = new AudioNode(assetManager, "Sounds/Effects/rulerWhip.ogg", false);
        rolledUpPaperSwipe = new AudioNode(assetManager, "Sounds/Effects/rolledUpPaperSwipe.ogg", false);
        rubberBandSound = new AudioNode(assetManager, "Sounds/Effects/rubberBand.ogg", false);
        keyboardSlapSound = new AudioNode(assetManager, "Sounds/Effects/keyboardSlap.ogg", false);

        // set volumes for all sounds
        menu_music.setVolume(3);
        ingame_music_1.setVolume(3);
        ingame_music_2.setVolume(3);
        ingame_music_3.setVolume(3);
        ingame_music_4.setVolume(3);
        ingame_music_5.setVolume(3);
        bloodSplatt.setVolume(3);
        extinguisherSpray.setVolume(3);
        coffeeMugSmash.setVolume(3);
        stapleGunSound.setVolume(3);
        droppingPinsSound.setVolume(3);
        paperPlaneSound.setVolume(3);
        rulerSwipeSound.setVolume(3);
        rolledUpPaperSwipe.setVolume(3);
        rubberBandSound.setVolume(3);
        keyboardSlapSound.setVolume(3);
        
        // set reverb to enabled to allow environment settings
        menu_music.setReverbEnabled(true);
        ingame_music_1.setReverbEnabled(true);
        ingame_music_2.setReverbEnabled(true);
        ingame_music_3.setReverbEnabled(true);
        ingame_music_4.setReverbEnabled(true);
        ingame_music_5.setReverbEnabled(true);
        bloodSplatt.setReverbEnabled(true);
        extinguisherSpray.setReverbEnabled(true);
        coffeeMugSmash.setReverbEnabled(true);
        stapleGunSound.setReverbEnabled(true);
        droppingPinsSound.setReverbEnabled(true);
        paperPlaneSound.setReverbEnabled(true);
        rulerSwipeSound.setReverbEnabled(true);
        rolledUpPaperSwipe.setReverbEnabled(true);
        rubberBandSound.setReverbEnabled(true);
        keyboardSlapSound.setReverbEnabled(true);

        // attach all sounds to the rootNode
        rootNode.attachChild(menu_music);
        rootNode.attachChild(ingame_music_1);
        rootNode.attachChild(ingame_music_2);
        rootNode.attachChild(ingame_music_3);
        rootNode.attachChild(ingame_music_4);
        rootNode.attachChild(ingame_music_5);
        rootNode.attachChild(bloodSplatt);
        rootNode.attachChild(extinguisherSpray);
        rootNode.attachChild(coffeeMugSmash);
        rootNode.attachChild(stapleGunSound);
        rootNode.attachChild(droppingPinsSound);
        rootNode.attachChild(paperPlaneSound);
        rootNode.attachChild(rulerSwipeSound);
        rootNode.attachChild(rolledUpPaperSwipe);
        rootNode.attachChild(rubberBandSound);
        rootNode.attachChild(keyboardSlapSound);
    }
    
    // called both on game startup and whenever a song finishes.
    // chooses a random song and plays it.
    // if gameState is 0 (main menu), plays main music,
    // otherwise game is in play and a new random song is played.
    public void playSong(int gameState) {
        
        System.out.println("----------play song called");
        
        if (gameState == 0) { // game is on main menu
            
            currentSong = menu_music;
            System.out.println("-----------playSongMenu: "+ gameState);
        } 
        else { // game is in play
            
            currentSong.stop();
            System.out.println("-----------playSong:InPlay "+ gameState);
            int randInt = randomGenerator.nextInt(5);

            switch (randInt) {
                case 0:
                    currentSong = ingame_music_1;
                    break;
                case 1:
                    currentSong = ingame_music_2;
                    break;
                case 2:
                    currentSong = ingame_music_3;
                    break;
                case 3:
                    currentSong = ingame_music_4;
                    break;
                case 4:
                    currentSong = ingame_music_5;
                    break;
                default:
                    break;
            }
        }
        currentSong.play(); 
    }
    
    // called in the main update loop.
    // if the current song has finished, plays a new song.
    public void playNewSong(int gameState) {
                
        if(currentSong.getStatus() == AudioNode.Status.Stopped) {
            playSong(gameState);
            System.out.println("stopped");
        }    
    }
    
    // method is called when user pauses the game.
    // if game in paused then music pauses, else if game if unpaused,
    // the music resumes.
    // if gameState is 1 (game in play), music is paused.
    public void pauseMusic(int gameState) {
        
        if (gameState == 1) {
            if (currentSong.getStatus() == AudioNode.Status.Playing) {
                currentSong.pause();
            } else if (currentSong.getStatus() == AudioNode.Status.Paused) {
                currentSong.play();
            }
        }
    }
    
    // called when a player is hit with a weapon
    public void playBloodSplatter() {
        bloodSplatt.playInstance();
    }
    
    // called when a player sprays the fire extinguisher
    public void playFireExtinguisherSpray() {
        extinguisherSpray.playInstance();
    }
    
    // called when a player it hit with a coffee mug
    public void playCoffeeMugSmash() {
        coffeeMugSmash.playInstance();
    }
    
    // called when a staple gun is fired
    public void playStapleGunSound() {
        stapleGunSound.playInstance();
    }
    
    // called when drawing pins are dropped on floor (floor trap)
    public void playDroppingPinsSound() {
        droppingPinsSound.playInstance();
    }
    
    // called when a player throws a paper plane
    public void playPaperPlaneSound() {
        paperPlaneSound.playInstance();
    }
    
    // called when a player melees with the ruler
    public void playRulerSwipeSound() {
        rulerSwipeSound.playInstance();
    }
    
    // called when a player melees with the ruler
    public void playRolledUpPaperSwipeSound() {
        rolledUpPaperSwipe.playInstance();
    }
    
    // called when a player shoots a rubber band
    public void playRubberBandSound() {
        rubberBandSound.playInstance();
    }
    
    // called when a player gets SLAPPED IN THE FACE WITH A KEYBOARD
    public void playkeyboardSlapSound() {
        keyboardSlapSound.playInstance();
    }
}