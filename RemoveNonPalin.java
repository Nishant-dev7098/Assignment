package com.training.practice;
import java.util.*;
public class RemoveNonPalin {
	public static boolean palin(String str) {
		int start=0;
		int end=str.length()-1;
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		String[] arr= {"abc","aba","abcba"};
		
		for(int i=0;i<arr.length;i++) {
			if(palin(arr[i]))
				al.add(arr[i]);
		}
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}

	}

}
