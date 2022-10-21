package com.training.practice;

public class VowelCon {
	public String vowCon(String str) {
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
		if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||
				str.charAt(i)=='o'||str.charAt(i)=='u') {
			sb.insert(0,str.charAt(i));
			
		}
		else
			sb.append(str.charAt(i));
			}
		return sb.toString();
	}
	public static void main(String[] args) {
		String str="abcdefghiou";
		VowelCon vc=new VowelCon();
		System.out.println(vc.vowCon(str));
		
	}
}
