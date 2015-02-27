import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MediumBomb here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediumMissile extends FighterPlaneBomb {
	/**
	 * Act - do whatever the MediumBomb wants to do. This method is called
	 * whenever the 'Act' or 'Run' button gets pressed in the environment.
	 */
	
	public MediumMissile() {
		damageAreaRadius = 100;
		// small missile decorator
		missileDecorator = new RedBlast(new OrangeBlast(new ConcreteBlast()));
	}
	
	public void act() {
		// Add your action code here.
		super.act();
	}


}
