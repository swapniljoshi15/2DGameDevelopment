import greenfoot.Actor;


public class EnemyMissile extends Actor{

	private boolean missileDirectionLock = false;
	protected int healthDistructionCount = 10;
	
	public EnemyMissile() {
		// TODO Auto-generated constructor stub
		/*int angle = (int)MyWorld.levelStrategy.getAngle(getX(), getY());
		turn(angle);*/
	}
	
	public void act() {
		// Add your action code here.
		if(!missileDirectionLock){
			int angle = (int)MyWorld.levelStrategy.getAngle(getX(), getY());
			turn(angle);
			missileDirectionLock = true;
		}else{
			move(MyWorld.levelStrategy.getSpeed());
			if (getY() == 0 || getX() == 0) {
				getWorld().removeObject(this);
			}
		}
	}

	public int getHealthDistructionCount() {
		return healthDistructionCount;
	}
	
	
	
}
