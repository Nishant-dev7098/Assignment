package com.training.practice;

import java.util.HashMap;

public class DupNumbers {

	public static void main(String[] args) {
		int[] arr= {1,1,1,3,4,5,3,2,4,5,6,2};
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else
			{
				int a=map.get(arr[i])+1;
				map.put(arr[i], a);
			}
		}
		map.forEach((key,value)->System.out.println(key+"->"+value));
	}

}
