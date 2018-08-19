package com.programs;

public class Pyramid {

	
	public static void main(String [] args)
	{
		int row_Count = 1;
		int no_of_rows = 5;
		
		for(int i = no_of_rows;i>0;i--)
		{
			for(int k = 1;k<=i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j =1;j<=row_Count;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
			row_Count++;
		}
	}
}
