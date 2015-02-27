import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyTank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyTank extends Actor implements Observer
{
    /**
     * Act - do whatever the EnemyTank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
	protected int score = 0;
	protected EnemyMissileFactory enemyMissileFactory;
	private boolean rocketLaunch = false;
	private int counterForLaunch = MyWorld.levelStrategy.getStartCounterForLaunch();
	private int counterToRelaseMissile = MyWorld.levelStrategy.getCounterToRelaseMissile();
	
    public void act() 
    {
    	move(-MyWorld.levelStrategy.getSpeed());
    	if(!rocketLaunch && counterForLaunch > counterToRelaseMissile){
    		getWorld().addObject(enemyMissileFactory.getMissile(), getX(), getY()-20);
    		counterForLaunch = 0;
    		
    	}else{
    		counterForLaunch ++;
    	}
    	if(getX() == 0){
    		getWorld().removeObject(this);
    		MyWorld.myWorld.removeObserver(this);
    	}
    }
    
    public void update(int damageX1, int damageX2) {
		if(this.getWorld() != null && getX() >= damageX1 && getX() <= damageX2){
			//remove object from screne
			getWorld().removeObject(this);
			//increase score
			MyWorld.counter.addScore(score);
			//remove self from subject
			MyWorld.myWorld.removeObserver(this);
		}
	}    
    
}
