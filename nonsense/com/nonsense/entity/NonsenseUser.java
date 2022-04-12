package com.nonsense.entity;

import java.time.LocalDateTime;

public class NonsenseUser {

	private String id;
	private String name;
	private int score;
	private LocalDateTime regDate; 
	private String grade;
	
	public NonsenseUser(String id, String name, int score, LocalDateTime regDate) {
		this.id = id;
		this.name = name;
		this.score = score;
		this.regDate = regDate;
		this.grade = getGrade();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public LocalDateTime getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDateTime regDate) {
		this.regDate = regDate;
	}
	
	public String getGrade() {
		if(score >= 5) grade = "고수";
		else if(score >= 4) grade = "중수";
		else grade = "초보";
		
		return grade;
	}
	
}
