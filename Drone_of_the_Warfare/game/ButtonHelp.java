import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonHelp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonHelp extends Button implements ButtonInvoker
{
   CommandInterface command;
    
    public void click(){
        
        command.execute();
    }
    
    public void setCommand(CommandInterface command){
        
        this.command=command;
    }
    
    public void act(){
    
         if (Greenfoot.mouseClicked(this))  
        {  
           click();
        }  
    }
}
