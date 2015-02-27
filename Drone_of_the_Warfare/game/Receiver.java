import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Receiver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Receiver 
{
    GreenfootImage img = new GreenfootImage("we-can-help.png");
    
   public void playMenu(){
       Greenfoot.setWorld(new MyWorld());
    }
    
    public void helpMenu(){
        //Greenfoot.setImages(img);
        Greenfoot.setWorld(new HelpMenu());
    }
}
