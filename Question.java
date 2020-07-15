
public class Question {
	
	private int num1;
	private int num2;
	private int answer;
	private int qType;
	private String quest;
	
	public Question() {
		this.num1 = 0;
		this.num2 = 0;
		this.answer = 0;
		this.qType = 0;
		this.quest = "No question";
	}
		
	public Question(int n1, int n2, int answer, int qTyp) {
		this.num1 = n1;
		this.num2 = n2;
		this.answer = answer;
		this.qType = qTyp;
		this.setQuestion(this.qType);
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
		
	public void setQuestion(int qT) {
		switch (qT) {
		case 1:
			this.quest = this.num1 + " + " + this.num2 + " = __ ? ";
			break;
		case 2:
			this.quest = this.num1 + " - " + this.num1 + " = __ ? ";
			break;
		case 3:
			this.quest = this.num1 + " x " + this.num2 + " = __ ? ";
			break;
		case 4:
			this.quest = this.num1 + " / " + this.num2 + " = __ ? ";
			break;
		}
	}
	
	public boolean checkQ(int ans) {
		if (ans == this.answer) {
			return true;
		} else {
			return false;
		}
	}
}
