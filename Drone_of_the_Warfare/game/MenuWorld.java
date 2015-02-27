import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuWorld extends World
{

    /**
     * Constructor for objects of class MenuWorld.
     * 
     */
    public MenuWorld()
    {    
        
        super(650, 500, 1); 
        prepare();
    }
    
    
     private void prepare()  
    {  
           
        Receiver playRcv = new Receiver();
        Receiver helpRcv = new Receiver();
        
        PlayCommand pc=new PlayCommand();  // creating commands
        HelpCommand hc=new HelpCommand();
        
        pc.setReceiver(playRcv);                  // assigning receiver to the command
        hc.setReceiver(helpRcv); 
        
        ButtonPlay bp = new ButtonPlay();      
        ButtonHelp bh = new ButtonHelp();
        
        bp.setCommand(pc);
        bh.setCommand(hc);
        
        addObject(bp, 150, 251);
        addObject(bh, 370, 251);
        
        Greenfoot.playSound("start.mp3");
        
    }  
    
     public void act()  
    {  
       
    }  
    
}
