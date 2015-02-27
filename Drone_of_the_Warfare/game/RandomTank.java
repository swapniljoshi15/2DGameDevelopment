import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomTank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomTank extends EnemyTank
{
    /**
     * Act - do whatever the RandomTank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
	public RandomTank() {
		// TODO Auto-generated constructor stub
		score = 30;
		enemyMissileFactory = new RandomMissileFactory();
	}
	
    public void act() 
    {
        // Add your action code here.
    	super.act();
    }    
}
