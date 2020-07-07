//import java.util.Random;
//import java.util.*;


public class Player {
	
	private int hitPoints;
	
	public Player() {
		this.hitPoints = 0;
	}
	
	public Player(int hp) {
		this.hitPoints = hp;
		
	}
	
	public int getHP() {
		return hitPoints;
	}
	
	public void setHP(int hP) {
		this.hitPoints = hP;
	}
	
}
