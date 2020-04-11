package siwithcollection;

import java.util.List;

public class Question {
	int id ;
	String que;
	List<String> answer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQue() {
		return que;
	}
	public void setQue(String que) {
		this.que = que;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
}
