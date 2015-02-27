import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World implements Subject
{

	
	static BigDecimal travelDistance = new BigDecimal(0);
	static private ConcurrentHashMap<Integer, Observer> enemyTanks = new ConcurrentHashMap <Integer, Observer>();
	static public Counter counter;//score object
	static public Counter planeHealthCounter;//planeHealthObject
	static public LevelStrategy levelStrategy = new LevelOneStrtegy();
	
	//missile score 
	//plane missile counter
    static public LargeMissileScore largeMissileScreen = new LargeMissileScore();
    static public MediumMissileScore mediumMissileScreen = new MediumMissileScore();
    static public SmallMissileScore smallMissileScreen = new SmallMissileScore();
    
    public static MyWorld myWorld = new MyWorld();
	
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(650, 500, 1); 
        prepare();
        myWorld = this;
        levelStrategy = new LevelOneStrtegy();
        setBackground(levelStrategy.getBackgroundImage());
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {

        FighterPlane fighterplane = FighterPlane.fighterPlane;
        
        fighterplane.addObserver(MyWorld.largeMissileScreen);
        fighterplane.addObserver(MyWorld.mediumMissileScreen);
        fighterplane.addObserver(MyWorld.smallMissileScreen);
        
        //addObject(fighterplane, 66, 73);
        addObject(fighterplane, 336, 251);
        //update coordiantes of fighter plane
        FighterPlane.planex = 336;
        FighterPlane.planey = 251;
        
        //RedTank redtank = new RedTank();
        //addObject(redtank, 549, 455);
        //score board object
        counter = new Counter();
        counter.setPrefix("Score: ");
        addObject(counter, 100, 30);
        //plane health 
        planeHealthCounter= new Counter();
        planeHealthCounter.setValue(100);
        planeHealthCounter.setPrefix("Health : ");
        addObject(planeHealthCounter, 200, 30);
        
        addObject(largeMissileScreen, 620, 30);
        addObject(mediumMissileScreen, 540, 30);
        addObject(smallMissileScreen, 470, 30);
        
        showText(Integer.toString(fighterplane.largeMissileCount), 560, 20);
        showText(Integer.toString(fighterplane.mediumMissileCount), 480, 20);
        showText(Integer.toString(fighterplane.smallMissileCount), 410, 20);
    }
 
    @Override
    public void act() {
    	// TODO Auto-generated method stub
    	super.act();
    	if(travelDistance.remainder(new BigDecimal(levelStrategy.getRandomFactor())).intValue() == 0){
    		EnemyTank enemyTank = TankFactoryInterface.getTank(GameUtility.getRandomTank());
    		addObject(enemyTank, 650, 455);
    		MyWorld.myWorld.addObserver(enemyTank);
    	}
    	if(counter.getValue() > levelStrategy.getNextlevelScoreActivation()){
    		levelStrategy = levelStrategy.getNextLevelStrategy();
    		if(levelStrategy!=null)
        	setBackground(levelStrategy.getBackgroundImage());
    	}
    	if(getBackground()!=null)
    	scrollBackground();
    }
    
    private void scrollBackground()  
    {  
        GreenfootImage bg = new GreenfootImage(getBackground());  
        getBackground().drawImage(bg, -levelStrategy.getSpeed(), 0);  
        getBackground().drawImage(bg, getWidth()-11, 0);  
        travelDistance = travelDistance.add(new BigDecimal(levelStrategy.getSpeed()));
    }

	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		enemyTanks.put(observer.hashCode(), observer);
	}

	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		enemyTanks.remove(observer.hashCode());
	}

	public void notifyObserver(int damageX1, int damageX2) {
		// TODO Auto-generated method stub
		Iterator<Entry<Integer, Observer>> entry = enemyTanks.entrySet().iterator();
		while(entry.hasNext()){
			entry.next().getValue().update(damageX1, damageX2);
		}
	} 
	
	public static Counter getPlaneHealthCounter()
	{
	   return planeHealthCounter;
   }
}
