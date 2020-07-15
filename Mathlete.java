import java.util.Scanner;
import java.util.Random;
//import javax.swing.JFrame;

/**Todo
 * Each game creates a 2d array - fill the array with question objects
 * randomly pick spaces for questions. If space is empty in array, pick a new object from a different box 
 * **/

public class mathlete {
		
	public static void main(String args[]) {
		
		System.out.println("Welcome to Math Fighter! \nIn this game, you will be presented "
				+ "with a series of math problems.\nEvery correct answer is an attack on your "
				+ "enemy's hit points. \nEvery wrong answer is an attack on your hitpoints. \nGet"
				+ " more questions correct than your enemy to win!");
		
		Scanner input = new Scanner(System.in);
		
		Player villain = new Player();
		Player hero = new Player();
		
		villain.setHP(100);
		hero.setHP(100);
		
		int rand1, rand2, rand3;
		
		Bank all = new Bank();
		
		while (villain.getHP() > 0 && hero.getHP() > 0) {
			
			rand1 = rando(11, 1); 
			rand2 = rando(11, 1);
			rand3 = rando(3, 1);
			
			Question problem = askQuest(all.getAllQuest(), rand1, rand2, rand3);
			System.out.println(problem.getQuest());
			
			int in = input.nextInt();
			
			if (problem.checkQ(in)) {
				villain.setHP(villain.getHP() - 10);
				System.out.println("Correct");
				
			} else {
				hero.setHP(hero.getHP() - 10);
				System.out.println("Incorrect");
			}
				
		}
		
		if (villain.getHP() == 0) {
			System.out.println("You win!");
		} else if (hero.getHP() == 0) {
			System.out.println("You lose!");
		}
		
		input.close();		
	}
	
	public static int rando(int upper, int check) {
		Random rand = new Random();
		int rand1 = rand.nextInt(upper) + check; 
		return rand1;
	}
	
	//recursion! - base and recursive case
	public static Question askQuest(Question[][][] set, int r1, int r2, int r3) {
		Question problem = set[r1][r2][r3];
		if (problem != null) {
			set[r1][r2][r3] = null;
			return problem;
		} else {
			r1 = rando(11, 1); 
			r2 = rando(11, 1);
			r3 = rando(3, 1);
			return askQuest(set, r1, r2, r3);
		}
	}
	
}

