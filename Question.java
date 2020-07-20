/**
 * @author fwang
 * Class file for "Question" object that organizes information required for each question asked.
 * File handles all 4 question types
 */

public class Question {
	
	private int num1;
	private int num2;
	private int answer;
	private int qType; //Used to determine which math operation character to use when generation the "quest" string below
	private String quest; //Question printed for User to read
	private int count; //Used to keep track of number of types question is asked during game
	
	//Default constructor
	public Question() {
		this.num1 = 0;
		this.num2 = 0;
		this.answer = 0;
		this.qType = 0;
		this.quest = "No question";
		this.count = 0;
	}
		
	public Question(int n1, int n2, int answer, int qTyp) {
		this.num1 = n1;
		this.num2 = n2;
		this.answer = answer;
		this.qType = qTyp;
		this.setQuestion(this.qType);
		this.count = 0;
	}
	
	//Series of getter and setter methods for various private variables
	public int getCount() {
		return this.count;
	}
	
	public void setCount(int val) {
		this.count = val;
	}
	
	public String getQuest() {
		return this.quest;
	}
	
	public int getAns() {
		return this.answer;
	}
	
	public void setNum1(int num) {
		this.num1 = num;
	}
	
	public void setNum2(int num) {
		this.num2 = num;
	}
		
	//Method creates "quest" string
	public void setQuestion(int qT) {
		switch (qT) {
		case 0:
			this.quest = this.num1 + " + " + this.num2 + " = __ ? ";
			break;
		case 1:
			this.quest = this.num1 + " - " + this.num2 + " = __ ? ";
			break;
		case 2:
			this.quest = this.num1 + " x " + this.num2 + " = __ ? ";
			break;
		case 3:
			this.quest = this.num1 + " / " + this.num2 + " = __ ? ";
			break;
		}
	}
	
	//Method determines if inputed answer is correct or not
	public boolean checkQ(int ans) {
		if (ans == this.answer) {
			return true;
		} else {
			return false;
		}
	}
}
