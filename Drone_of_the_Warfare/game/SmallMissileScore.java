import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmallMissileScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SmallMissileScore extends MissileScores
{

	@Override
	public void update(String missileType) {
		// TODO Auto-generated method stub
		if("small".equalsIgnoreCase(missileType)){
			MyWorld.myWorld.showText(Integer.toString(FighterPlane.fighterPlane.smallMissileCount), 410, 20);
		}
		
	}
    /**
     * Act - do whatever the SmallMissileScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
}
