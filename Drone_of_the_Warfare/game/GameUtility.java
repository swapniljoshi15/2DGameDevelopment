import greenfoot.Greenfoot;

import java.util.Random;


public class GameUtility {

	public static int getRandomNumber(int randomSeed){
		Random random = new Random();
		return random.nextInt(randomSeed);
	}
	
	public static String getRandomTank(){
		String[] color = {"red", "yellow", "orange", "random"};
		return color[Math.abs((getRandomNumber(color.length-1)+1)%color.length)];
	}
	
	public static void doNothing(int timeInMilliseconds){
		int counter = 0;
		while(counter < timeInMilliseconds){
			//do nothing
			counter++;
		}
		
	}
	
	public static int getRandomAngleInRange(int start, int end){
		return Greenfoot.getRandomNumber(end-start)+start;
	}
	
	public static int getAngle(int p1x, int p1y, int p2x, int p2y){
		double xd = p2x - p1x;
		double yd = p2y - p1y;
		return (int)Math.toDegrees(Math.atan2(yd, xd));
	}
	
}
