
public interface Subject {

	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObserver(int damageX1, int damageX2);//using push notification
	
}
