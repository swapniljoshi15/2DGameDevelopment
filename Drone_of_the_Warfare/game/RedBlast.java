import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedBlast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//composite in decoratoe
public class RedBlast extends Blast
{
    /**
     * Act - do whatever the RedBlast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
	public RedBlast() {
		// TODO Auto-generated constructor stub
	}
	
	public RedBlast(Component component) {
		// TODO Auto-generated constructor stub
		decoratorComponent = component;
	}
	
    public void act() 
    {
    	super.act();
    }

	public void createBlast(int x, int y) {
    	decoratorComponent.createBlast(x, y);
    	//MyWorld.myWorld.removeObject(this);
    	MyWorld.myWorld.addObject(this, x, y);
	}    
}
