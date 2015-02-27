import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FighterPlaneBomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FighterPlaneBomb extends Actor
{
    /**
     * Act - do whatever the FighterPlaneBomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
	// small missile decorator
	protected Component missileDecorator;

	protected int damageAreaRadius = 20;
	
    public void act() 
    {
        // Add your action code here.
    	super.act();
    	setLocation(getX(), getY()+10); 
    	//once missile reach particular y axis notify subject to remove vechicle in range
    	if(getY() >= 440){
    		MyWorld.myWorld.notifyObserver(getX()-damageAreaRadius,getX()+damageAreaRadius);
    		missileDecorator.createBlast(getX(), getY());
    		//remove bomb from world
    		getWorld().removeObject(this);
    	}
    }

	
}
