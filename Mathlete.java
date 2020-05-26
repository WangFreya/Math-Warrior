import java.util.Scanner;
import java.util.Random;
import javax.swing.JFrame;

//Method below has issues, random num gen not reliable. Change implementation to 2d array

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
		
		Random rand = new Random();
		
		while (villain.getHP() > 0 && hero.getHP() > 0) {
			
			int rand1 = rand.nextInt(12) + 2; 
			int rand2 = rand.nextInt(12) + 2;
			int rand3 = rand.nextInt(4) + 1;
			
			//Question newQ = new Question(hero.rando(12, 2), hero.rando(12, 2), hero.rando(4, 2));
			Question newQ = new Question(rand1, rand2, rand3);
			
			System.out.println(newQ.getQuest());
			System.out.println(newQ.getAns());
			//Debug - print null bc no string to print - issue with not having consistent rand variable to use
			//Debug - issue with num - num = 0 questions, doesn't register 0 as answer - not accounting for with num1 and num2 are same and subtracting in Question class
			
			int in = input.nextInt();
			
			if (newQ.checkQ(in)) {
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
}

