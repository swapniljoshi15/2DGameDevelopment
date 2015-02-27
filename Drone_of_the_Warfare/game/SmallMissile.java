import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmallBomb here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class SmallMissile extends FighterPlaneBomb {
	/**
	 * Act - do whatever the SmallBomb wants to do. This method is called
	 * whenever the 'Act' or 'Run' button gets pressed in the environment.
	 */

	public SmallMissile() {
		damageAreaRadius = 50;
		// small missile decorator
		missileDecorator = new RedBlast(new ConcreteBlast());
	}

	public void act() {
		// Add your action code here.
		super.act();
	}

}
