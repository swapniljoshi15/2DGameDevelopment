import greenfoot.Greenfoot;


public class LevelTwoStrategy implements LevelStrategy{

	private int nextlevelScoreActivation = 200;
	
	public double getAngle(int x2, int y2) {
		// TODO Auto-generated method stub
		return GameUtility.getAngle(x2, y2, FighterPlane.planex, FighterPlane.planey) + 3;
	}

	public int getSpeed() {
		// TODO Auto-generated method stub
		return 10;
	}

	public int getRandomFactor() {
		// TODO Auto-generated method stub
		return 505;
	}

	public int getNextlevelScoreActivation() {
		return nextlevelScoreActivation;
	}

	public LevelStrategy getNextLevelStrategy() {
		// TODO Auto-generated method stub
		//Greenfoot.stop();
		Greenfoot.setWorld(new ScoreCard());
		return null;
	}
	
	public String getBackgroundImage() {
		// TODO Auto-generated method stub
		return "level2.png";
	}

	public int getCounterToRelaseMissile() {
		// TODO Auto-generated method stub
		return 70;
	}

	public int getStartCounterForLaunch() {
		// TODO Auto-generated method stub
		return 40;
	}

}
