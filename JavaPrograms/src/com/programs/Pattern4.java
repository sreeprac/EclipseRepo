package com.programs;

public class Pattern4 {
/*5 4 3 2 1 
5 4 3 2 
5 4 3 
5 4 
5
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  for(int i =1;i<=5;i++)
		  {
			  for(int j=5;j>=i;j--)
			  {
				  System.out.print(j+" ");
			  }
			  System.out.println("");
		  }
	}

}
