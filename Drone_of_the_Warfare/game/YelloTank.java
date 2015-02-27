import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YelloTank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YelloTank extends EnemyTank
{
    /**
     * Act - do whatever the YelloTank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
	public YelloTank() {
		// TODO Auto-generated constructor stub
		score = 15;
		enemyMissileFactory = new YellowMissileFactory();
	}
	
    public void act() 
    {
        // Add your action code here.
    	super.act();
    }    
}
