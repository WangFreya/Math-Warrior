import java.util.Scanner;
import java.util.Random;

/**
 * @author fwang
 * Project designed as a game to help students practice basic math skills. 
 * Game produces either addition, subtraction, multiplication, or division questions.
 * User inputs answer. Incorrect answers cause player to lose HP 
 * Get 10 questions wrong and lose the game. Get 10 questions correct and win. 
 *  
 * **/

public class mathlete {
		
	//Main function that contains game while loop + user instructions
	public static void main(String args[]) {
		
		//Instructions
		System.out.println("Welcome to Math Fighter! \nIn this game, you will be presented "
				+ "with a series of math problems.\nEvery correct answer is an attack on your "
				+ "enemy's hit points. \nEvery wrong answer is an attack on your hitpoints. \nGet"
				+ " more questions correct than your enemy to win!");
		
		Scanner input = new Scanner(System.in);
		
		//Game "Characters" 
		Player villain = new Player();
		Player hero = new Player(); //User is "hero"
		
		villain.setHP(100);
		hero.setHP(100);
		
		int rand1, rand2, rand3;
		
		//Object contains all possible questions
		Bank all = new Bank();
		
		while (villain.getHP() > 0 && hero.getHP() > 0) {
			
			//Generates random values
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
		
		//Termination conditions of game
		if (villain.getHP() == 0) {
			System.out.println("You win!");
		} else if (hero.getHP() == 0) {
			System.out.println("You lose!");
		}
		
		input.close();		
	}
	
	//Method generates random numbers based on passed in bound and check values
	public static int rando(int upper, int check) {
		Random rand = new Random();
		int rand1 = rand.nextInt(upper) + check; 
		return rand1;
	}
	
	//Method uses recursion to ensure that no repeat questions are asked
	public static Question askQuest(Question[][][] set, int r1, int r2, int r3) {
		Question ret;
		Question problem = set[r1][r2][r3];
		if (problem.getCount() != 0 || problem.getQuest() == "No question") { //Determines if question has been asked already or not or if Question object has no question attached to it
			ret = askQuest(set, rando(11, 1), rando(11, 1), rando(11, 1));
		} else { //Increment problem count by 1
			int val = problem.getCount();
			val++;
			problem.setCount(val);
			ret = problem;
		}
		return ret;
		
	}
	
}

