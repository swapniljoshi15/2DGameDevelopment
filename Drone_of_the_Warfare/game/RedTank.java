import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedTank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedTank extends EnemyTank
{
    /**
     * Act - do whatever the RedTank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
	public RedTank() {
		// TODO Auto-generated constructor stub
		score = 20;
		enemyMissileFactory = new RedMissileFactory();
	}
	
    public void act() 
    {
       super.act();
    }    
}
