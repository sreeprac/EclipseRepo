package com.programs;

public class ReversePyramid {

	public static void main(String[] args) {
		int row_Count = 1;
		int no_of_rows = 5;
		
		for(int i =1;i<=no_of_rows;i++)
		{
		    for(int k =1;k<=i;k++)
		    {
		    	System.out.print(" ");
		    }
			
			for(int j=5;j>=row_Count;j--)
			{
			System.out.print("* ");	
			}
			System.out.println("");
			row_Count++;
		}
		
	}

}
