import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OrangeBlast here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrangeBlast extends Blast
{
    /**
     * Act - do whatever the OrangeBlast wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
	public OrangeBlast() {
		// TODO Auto-generated constructor stub
	}
	
	public OrangeBlast(Component component) {
		super(component);
	}
	
    public void act() 
    {
        // Add your action code here.
    	super.act();
    }    
    
    public void createBlast(int x, int y)  {
    	decoratorComponent.createBlast(x, y);
    	//MyWorld.myWorld.removeObject(this);
    	MyWorld.myWorld.addObject(this, x, y);
	}  
    
}

