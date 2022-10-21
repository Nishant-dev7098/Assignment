package com.training.practice;
import java.util.*;
public class Pythagoras {
	public void pythagoras(float[] arr) {
		HashSet<Float> hashSet=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			hashSet.add(arr[i]);
		}
		for(int i=0;i<arr.length-1;i++) {
			float a=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				float b=arr[j];
			if(hashSet.contains((float)Math.sqrt((a*a)+(b*b)))) {
				System.out.println(a+"*"+a+"+"+b+"*"+b+"="+(float)Math.sqrt(a*a+b*b)+"*"+(float)Math.sqrt(a*a+b*b));
			}
			}
		}
	}
	public static void main(String[] args) {
		Pythagoras p=new Pythagoras();
		float[] arr= {1f,2f,3f,4f,5f};
		p.pythagoras(arr);
	}

}
