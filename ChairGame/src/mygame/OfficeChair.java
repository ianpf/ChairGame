package mygame;

/**
 * @author Ian Fisher
 */
public class OfficeChair extends GameActor {

    private double angle;
    private int health = 100;
    
    public OfficeChair(double x, double y, double z, int health, float angle)
    {
        this.health = health;
        this.angle = angle;
    }
    
    public void takeDamage(int damage)
    {
        health -= damage;
    }
    
    // Get the health of the player
    void update(float tpf)
    {
    
    }

    int getHealth() 
    {
        return this.health;
    }
}