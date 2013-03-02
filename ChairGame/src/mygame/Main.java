package mygame;


import chair.input.XboxInputListener;
import com.jme3.app.SimpleApplication;
import com.jme3.niftygui.NiftyJmeDisplay;
import com.jme3.renderer.RenderManager;
import de.lessvoid.nifty.Nifty;

/**
 * test
 *
 * @author normenhansen
 */
public class Main extends SimpleApplication
{
    XboxInputListener il;
    public static Level l;
    static boolean startLevel = false;
    
    public static void main(String[] args) {
        Main app = new Main();
        app.setPauseOnLostFocus(false);
        app.start();
    }
    
    public static void startLevel(){
        startLevel = true;
    }
    
    
    
    public Nifty nifty;
    public static int gameState = 0;
    public void loadMainMenu() {
        NiftyJmeDisplay niftyDisplay = new NiftyJmeDisplay(assetManager, inputManager, audioRenderer, guiViewPort);
        nifty = niftyDisplay.getNifty();
        nifty.fromXml("Interface/XML/mainmenu.xml", "start");
        // attach the nifty display to the gui view port as a processor
        guiViewPort.addProcessor(niftyDisplay);
        // disable the fly cam
        flyCam.setEnabled(false);
    }

    @Override
    public void simpleInitApp() {

        setDisplayStatView(false);
        setDisplayFps(false);
        
        loadMainMenu();
   
    }
    
    
    

    @Override
    public void simpleUpdate(float tpf)
    {
        if(startLevel){
            l = new Level(rootNode, assetManager, inputManager);
            startLevel = false;
        }
        if(l != null){
            l.update(tpf);
        }

        //InputController controller = il.getInputControllers()[0];
        //controller.getLeftAxisDirection();
        //System.out.println("LS Angle = " + controller.getLeftAxisDirection() + " LS Power =" + controller.getLeftAxisPower());
        //System.out.println("RS Angle = " + controller.getRightAxisDirection() + " RS Power =" + controller.getRightAxisPower());
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }

}
