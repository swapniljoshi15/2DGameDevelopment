import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blast here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Blast extends Actor implements Component {
	Component decoratorComponent;

	/**
	 * Act - do whatever the Blast wants to do. This method is called whenever
	 * the 'Act' or 'Run' button gets pressed in the environment.
	 */
	public Blast() {

	}

	public Blast(Component component) {
		decoratorComponent = component;
	}

	public void act() {
		// Add your action code here.
		move(-5);
		if (getX() == 0) {
			getWorld().removeObject(this);
		}
	}

	public void createBlast(int x, int y) {
		getWorld().addObject(this, x, y);
	}
}
