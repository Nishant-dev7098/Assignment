package com.yash.exception1;

public class StudentResult {
	private String subject;
	private int marks;
	public StudentResult(String subject,int marks) {
		this.subject=subject;
		this.marks=marks;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
