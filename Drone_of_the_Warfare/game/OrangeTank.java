import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OrangeTank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrangeTank extends EnemyTank
{
    /**
     * Act - do whatever the OrangeTank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
	public OrangeTank() {
		// TODO Auto-generated constructor stub
		score = 10;
		enemyMissileFactory = new GreenMissileFactory();
	}
	
    public void act() 
    {
        // Add your action code here.
    	super.act();
    }    
}
