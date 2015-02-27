
public interface LevelStrategy {

	public  double getAngle(int x2, int y2);
	public int getSpeed();
	public int getRandomFactor();
	public int getNextlevelScoreActivation();
	public LevelStrategy getNextLevelStrategy();
	public String getBackgroundImage();
	public int getCounterToRelaseMissile();
	public int getStartCounterForLaunch();
}
