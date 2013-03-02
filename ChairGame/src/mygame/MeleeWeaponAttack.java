/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import com.jme3.math.Vector2f;
import com.jme3.math.Vector3f;
import com.jme3.math.Quaternion;

/**
 *
 * @author Alex
 */
public class MeleeWeaponAttack extends WeaponAttack{
    
    private int damage;
    private RectF damageArea;
    
    public MeleeWeaponAttack(Weapon weapon) {
        super(weapon);
        damage = 10;
        damageArea = new RectF(-0.5f, 0.5f, 1, 1);
    }
    
    public void update(float tpf) {
        
    }
    public void use() {
        RectF rect = new RectF(damageArea.getLeft(), damageArea.getBottom(), damageArea.getWidth(), damageArea.getHeight());
        float angle = getWeapon().getOwner().getAngle();
        //rotate rect by angle
        Vector2f center = rect.getCenter();
        Quaternion rot = new Quaternion().fromAngleAxis(angle, new Vector3f(0,1,0));
        Vector3f center3 = new Vector3f(center.getX(), 0, center.getY());
        center3 = rot.mult(center3);
        center.setX(center3.getX());
        center.setY(center3.getZ());
        rect.setCenter(center);
        // create damage rect at rect
        getWeapon().getOwner().getLevel().damageAllInRect(getWeapon().getOwner(), rect, damage);
    }
    
}
