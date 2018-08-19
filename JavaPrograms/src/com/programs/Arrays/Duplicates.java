package com.programs.Arrays;

import java.util.HashSet;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] str= {"sri","hai","sri"};
		int [] arr = {1,2,3,4,5,6,3};
		HashSet<String> hashset = new HashSet<String>();

		HashSet<Integer> hashset1 = new HashSet<Integer>();
		
		for(String s :str)
		{
			if(!hashset.add(s))
			{
				System.out.println(s);
			}
		}
		
		for(int i : arr)
		{
			if(!hashset1.add(i))
			{
				System.out.println(i);
			}
		}
	
	
	}

}
