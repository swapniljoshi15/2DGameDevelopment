
public interface MissileCounterSubjectInterface {

	public void addObserver(MissileScores missileScores);
	public void removeObserver(MissileScores missileScores);
	public void notifyObservers(String missileType);
	
}
