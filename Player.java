import java.util.Random;
import java.util.*;


public class Player {
	
	private int hitPoints;
	
	public Player() {
		this.hitPoints = 0;
	}
	
	/*public void fillQuestionBank(Question[][] qB) {
		//Addition
			
		//Subtraction
		//Multiplication
		//Division
	}*/
	
	public Player(int hp) {
		this.hitPoints = hp;
		
	}
	
	public int getHP() {
		return hitPoints;
	}
	
	public void setHP(int hP) {
		this.hitPoints = hP;
	}
	
	/*public int rando(int upper, int check) {
		Random rand = new Random();
		int rand1 = rand.nextInt(upper) + check; 
		return rand1;
	}*/
	
}
