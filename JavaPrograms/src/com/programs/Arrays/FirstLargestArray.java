package com.programs.Arrays;

public class FirstLargestArray {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int largest = arr[0];
        for(int i = 1;i<arr.length-1;i++)
        {
        	for(int j =i+1;j<arr.length;j++)
        	{
        		if(arr[j]>largest)
        		{
        			largest=arr[j];
        		}
        	}
        }
        System.out.println(largest);
	}

}
