import greenfoot.Greenfoot;

public class RandomMissileFactory extends EnemyMissileFactory {

	@Override
	public EnemyMissile getMissile() {
		// TODO Auto-generated method stub
		String[] missile = { "red", "yellow", "green" };
		EnemyMissile enemyMissile;
		switch (Greenfoot.getRandomNumber(2)) {
		case 0:
			enemyMissile = new RedMissile();
			break;
		case 1:
			enemyMissile = new YellowMissile();
			break;
		case 2:
			enemyMissile = new GreenMissile();
			break;
		default:
			enemyMissile = new GreenMissile();
		}
		return enemyMissile;
	}
}
