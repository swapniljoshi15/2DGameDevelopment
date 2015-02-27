import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlayCommand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayCommand implements CommandInterface
{
    
     Receiver rcv;
    
    public void setReceiver(Receiver rcv){
    this.rcv=rcv;
    }
   
   
    public void execute(){
    rcv.playMenu();
    }
    
   
}
