import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LargeBomb here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class LargeMissile extends FighterPlaneBomb {
	/**
	 * Act - do whatever the LargeBomb wants to do. This method is called
	 * whenever the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public LargeMissile() {
		// TODO Auto-generated constructor stub
		damageAreaRadius = 150;
		// small missile decorator
		missileDecorator = new RedBlast(new OrangeBlast(new YellowBlast(new ConcreteBlast())));
	}

	public void act() {
		// Add your action code here.
		super.act();
	}

}
