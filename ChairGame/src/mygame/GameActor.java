/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

/**
 *
 * @author Ian
 */
public abstract class GameActor extends MoveableGameObject {

    public abstract void takeDamage(int damage);
    public GameActor(CircleF circle){
        super(circle);
    }
    public void update(float tpf)
    {
        super.update(tpf);
    }
}
