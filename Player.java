/**
 * @author fwang
 * Class file for "Player" object
 */

public class Player {
	
	private int hitPoints;
	
	//Default constructor
	public Player() {
		this.hitPoints = 0;
	}
	
	public Player(int hp) {
		this.hitPoints = hp;
		
	}
	
	//Getter and setter methods for Player hitpoints
	public int getHP() {
		return hitPoints;
	}
	
	public void setHP(int hP) {
		this.hitPoints = hP;
	}
	
}
