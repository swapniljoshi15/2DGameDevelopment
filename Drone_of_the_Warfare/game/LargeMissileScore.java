import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LargeMissileScore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LargeMissileScore extends MissileScores
{

	@Override
	public void update(String missileType) {
		// TODO Auto-generated method stub
		if("large".equalsIgnoreCase(missileType)){
			MyWorld.myWorld.showText(Integer.toString(FighterPlane.fighterPlane.largeMissileCount), 560, 20);
		}
	}
    /**
     * Act - do whatever the LargeMissileScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
       
}
