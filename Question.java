
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
		
	public Question(int n1, int n2, int answer, int qType) {
		this.num1 = n1;
		this.num2 = n2;
		this.answer = answer;
		this.setQuestion(qType);
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
	
	/*public int getDivAns(int n1, int n2) {
		int ans = 0;
		int num1 = n1;
		int num2 = n2;
		
		int remainder = num1 % num2;
		if (remainder == 0) {
			ans = num1 / num2;
		} else {
			int fact = 2;
			int mult = fact * num2;
			while (mult < num1) {
				fact += 1;
				mult = fact * num2;
			}
			setNum1(mult);
			setNum2(num2);
			ans = fact;
		}
		return ans;
	}*/
	
	/*public void setAnswer(int qT) {
		switch (qT) {
		case 1:
			this.answer = this.num1 + this.num2;
			break;
		case 2:
			if (this.num1 == this.num2) {
				this.answer = 0;
			} else {
				this.answer = this.num1 - this.num2;
			}
			break;
		case 3:
			this.answer = this.num1 * this.num2;
			break;
		case 4:
			this.answer = getDivAns(this.num1, this.num2);
			break;
		}
	}*/
	
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
