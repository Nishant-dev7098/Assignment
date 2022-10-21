package com.yash.exception1;
import java.util.*;
public class Student {
	private int rollNo;
	private String name;
	private String address;
	StudentResult stdrst;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public StudentResult getStdrst() {
		return stdrst;
	}
	public void setStdrst(StudentResult stdrst) {
		this.stdrst = stdrst;
	}
	
	public static void main(String[] args) {
		Student[] s=new Student[2];
		int count=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++) {
			s[i]=new Student();
			System.out.println("Enter roll number");
			s[i].setRollNo(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter name");
			s[i].setName(sc.nextLine());
			System.out.println("Enter address");
			s[i].setAddress(sc.nextLine());
			System.out.println("Enter subect and marks");
			s[i].stdrst=new StudentResult(sc.nextLine(),sc.nextInt());
			if(s[i].stdrst.getMarks()<40) {
				count++;
			}
		}
		sc.close();
		if(count>=1) {
			try {
				throw new ResultException();
			}
			catch(ResultException Re){
				System.out.println("Student failed");
			}
		}
	}
	
}
