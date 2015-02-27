
public class TankFactoryInterface {

	public static EnemyTank getTank(String type){
		
		if(type.equalsIgnoreCase("red")){
			return new RedTank();
		}else if(type.equalsIgnoreCase("orange")){
			return new OrangeTank();
		}else if(type.equalsIgnoreCase("yellow")){
			return new YelloTank();
		}else{
			return new RandomTank();
		}
		
	}
	
}
