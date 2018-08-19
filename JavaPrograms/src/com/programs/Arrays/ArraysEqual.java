package com.programs.Arrays;

public class ArraysEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr = {1,4,5,6,7};
			int[] arr1 = {1,4,5,6,7};
			
			boolean equalornot =true;
			
			if(arr.length!=arr1.length)
			{
				equalornot = false;
			}
			else
			{
				for(int i = 0;i<arr.length;i++)
				{
					if(!(arr[i]==arr1[i]))
					{
						equalornot = false;
					}
				}
			}
			if(equalornot)
			System.out.println("given two arrays are equal");
			else
			{
				System.out.println("given two arrays are not equal");
			}
	}

}
