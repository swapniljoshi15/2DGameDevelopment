import java.util.ArrayList;
import java.util.List;

import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FighterPlane here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class FighterPlane extends Actor implements MissileCounterSubjectInterface {

	/**
	 * Act - do whatever the FighterPlane wants to do. This method is called
	 * whenever the 'Act' or 'Run' button gets pressed in the environment.
	 */
	static FighterPlane fighterPlane = new FighterPlane();
	static List<MissileCounterInterface> missileScores = new ArrayList<MissileCounterInterface>();
	
	private boolean aDown = false;
	private boolean sDown = false;
	private boolean dDown = false;

	// Missile counter
	int largeMissileCount = 10;
	int mediumMissileCount = 20;
	int smallMissileCount = 50;

	// coordinates of plane
	static int planex = 0;
	static int planey = 0;

	// plane health
	Counter planeHealthCounter = MyWorld.getPlaneHealthCounter();
	protected Component missileDecorator;

	private FighterPlane() {
		missileDecorator = new RedBlast(new ConcreteBlast());
	}

	public void act() {

		planex = getX();
		planey = getY();

		// plane health counter, plane blast, plane remove
		if (this.getWorld() == null)
			Greenfoot.stop();

		if (this.getOneIntersectingObject(EnemyMissile.class) != null)
		{
			Object missile = this.getOneIntersectingObject(EnemyMissile.class);
			int health = 0;
			if(missile instanceof EnemyMissile){
				health = ((EnemyMissile)missile).getHealthDistructionCount();
				getWorld().removeObject(this.getOneIntersectingObject(EnemyMissile.class));
				missileDecorator.createBlast(planex, planey);
				if (MyWorld.planeHealthCounter.getValue() <= 0) {
				   
				     Greenfoot.setWorld(new ScoreCard());
					//Greenfoot.stop();
				}else{
					int scoreUpdate = MyWorld.planeHealthCounter.getValue() - health;
					if(scoreUpdate >= 0 ){
						MyWorld.planeHealthCounter.addScore(-health);
					}else{
						MyWorld.planeHealthCounter.setValue(0);
						//System.out.println("score rached to 0");
						
						Greenfoot.setWorld(new ScoreCard());
						//Greenfoot.stop();
					}
				}
			}
		}

		//

		if (Greenfoot.isKeyDown("up")) {
			setLocation(getX(), getY() - 10);
		}
		if (Greenfoot.isKeyDown("down")) {
			setLocation(getX(), getY() + 10);
		}
		if (Greenfoot.isKeyDown("left")) {
			move(-10);
		}
		if (Greenfoot.isKeyDown("right")) {
			move(10);
		}
		if (!aDown && Greenfoot.isKeyDown("a")) {
			// create bomb object
			aDown = true;
			if (largeMissileCount > 0) {
				getWorld().addObject(new LargeMissile(), getX(), getY());
				largeMissileCount--;
				/*getWorld().showText(Integer.toString(largeMissileCount), 560,
						20);*/
				notifyObservers("large");
			}
		}
		if (aDown && !Greenfoot.isKeyDown("a")) {
			// create bomb object
			aDown = false;
		}
		if (!sDown && Greenfoot.isKeyDown("s")) {
			// create bomb object
			sDown = true;
			if (mediumMissileCount > 0) {
				getWorld().addObject(new MediumMissile(), getX(), getY());
				mediumMissileCount--;
				/*getWorld().showText(Integer.toString(mediumMissileCount), 480,
						20);*/
				notifyObservers("medium");
			}
		}
		if (sDown && !Greenfoot.isKeyDown("s")) {
			// create bomb object
			sDown = false;
		}
		if (!dDown && Greenfoot.isKeyDown("d")) {
			// create bomb object
			dDown = true;
			if (smallMissileCount > 0) {
				getWorld().addObject(new SmallMissile(), getX(), getY());
				smallMissileCount--;
				/*getWorld().showText(Integer.toString(smallMissileCount), 410,
						20);*/
				notifyObservers("small");
			}
		}
		if (dDown && !Greenfoot.isKeyDown("d")) {
			// create bomb object
			dDown = false;
		}

		if (getY() >= 450) {
			getWorld().addObject(new RedBlast(), getX(), getY());
			getWorld().removeObject(this);
			Greenfoot.setWorld(new ScoreCard());
			//Greenfoot.stop();
		}
	}

	public void addObserver(MissileScores missileScores) {
		// TODO Auto-generated method stub
		this.missileScores.add(missileScores);
	}

	public void removeObserver(MissileScores missileScores) {
		// TODO Auto-generated method stub
		this.missileScores.remove(missileScores);
	}

	public void notifyObservers(String missileType) {
		// TODO Auto-generated method stub
		for(MissileCounterInterface ms : missileScores){
			ms.update(missileType);
		}
	}

	
}
