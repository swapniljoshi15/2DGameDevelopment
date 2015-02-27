import greenfoot.export.mygame.MyGameClient;


public class LevelOneStrtegy implements LevelStrategy{

	private int nextlevelScoreActivation = 100;
	private LevelStrategy nextLevelStrategy;
	
	public LevelOneStrtegy() {
		// TODO Auto-generated constructor stub
		nextLevelStrategy = new LevelTwoStrategy();
	}
	
	public LevelStrategy getNextLevelStrategy() {
		return nextLevelStrategy;
	}

	public double getAngle(int x2, int y2) {
		
		return GameUtility.getRandomAngleInRange(40, 60) + 180;
	}

	public int getSpeed() {
		// TODO Auto-generated method stub
		return 5;
	}

	public int getRandomFactor(){
		return 500;
	}

	public int getNextlevelScoreActivation() {
		return nextlevelScoreActivation;
	}

	public String getBackgroundImage() {
		// TODO Auto-generated method stub
		return "level1.png";
	}

	public int getCounterToRelaseMissile() {
		// TODO Auto-generated method stub
		return 80;
	}

	public int getStartCounterForLaunch() {
		// TODO Auto-generated method stub
		return 60;
	}

	
}
