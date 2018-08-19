package com.programs.Arrays;

public class FindPairs {

	
	public static void findpairs(int arr [],int sum)
	{
		for(int i =0;i<arr.length-1;i++)
		{
			for(int j =i+1;j<arr.length;j++)
			{
			    if(arr[i]+arr[j]==sum)
			    {
			    	System.out.println(arr[i]+"     "+arr[j]);
			    	
			    	
			    }
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findpairs(new int [] {1,2,3,4,5,6},10);
	}

}
