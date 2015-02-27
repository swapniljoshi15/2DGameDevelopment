import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpMenu extends World
{

    /**
     * Constructor for objects of class HelpMenu.
     * 
     */
    public HelpMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 500, 1); 
    }
    
     
     @Override
    public void act() {
      if (Greenfoot.mouseClicked(this))  
        {  Greenfoot.setWorld(new MenuWorld());
           
           //setImage(img);
        }  
    }
    
}
