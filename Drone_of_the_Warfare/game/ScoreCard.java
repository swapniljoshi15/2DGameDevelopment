import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreCard extends World
{

    /**
     * Constructor for objects of class ScoreCard.
     * 
     */
    public ScoreCard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 500, 1); 
        
        showFinalScore();
    }
    
    public void showFinalScore(){
    
        
     showText("Your Score :", 240, 250);
     showText(Integer.toString(MyWorld.counter.getValue()),320,250);
     // showText(" Game Over ", 240, 300);
     //System.out.println(" Your Score " + MyWorld.counter.getValue());
    }
    
    
    public void act(){
    
      
    }
   
}
