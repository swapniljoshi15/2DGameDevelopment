import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MediumMissileScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MediumMissileScore extends MissileScores
{

	@Override
	public void update(String missileType) {
		// TODO Auto-generated method stub
		if("medium".equalsIgnoreCase(missileType)){
			MyWorld.myWorld.showText(Integer.toString(FighterPlane.fighterPlane.mediumMissileCount), 480, 20);
		}
	}
    /**
     * Act - do whatever the MediumMissileScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
}
