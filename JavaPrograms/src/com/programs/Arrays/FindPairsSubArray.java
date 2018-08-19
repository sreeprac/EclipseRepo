package com.programs.Arrays;

import java.util.HashSet;

public class FindPairsSubArray
{
	
	public static void main(String[] args)
	{
		 String[] inputArray1 = {"ONE", "TWO", "THREE"};
		  
	        String[] inputArray2 = {"THREE", "FOUR", "FIVE"};
	  
	        HashSet<String> set = new HashSet<String>();
	  
	        for(int i =0;i<inputArray1.length;i++)
	        {
	        	for(int j =0;j<inputArray2.length;j++)
	        	{
	        		if(inputArray1[i]==inputArray2[j])
	        		{
	        		set.add(inputArray2[j]);
	        		}
	        	}
	        }
	        System.out.println(set);
		
		
	}
}