import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YellowBlast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YellowBlast extends Blast 
{
    /**
     * Act - do whatever the YellowBlast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
	public YellowBlast() {
		// TODO Auto-generated constructor stub
	}

	public YellowBlast(Component component) {
		// TODO Auto-generated constructor stub
		decoratorComponent = component;
	}
	
    public void act() 
    {
    	super.act();
    }    
    
    public void createBlast(int x, int y) {
    	decoratorComponent.createBlast(x, y);
    	MyWorld.myWorld.addObject(this, x, y);
		//MyWorld.myWorld.removeObject(this);
	}  
    
}
