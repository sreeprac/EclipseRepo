package com.programs.string;

public class DuplicateCharaters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputstring = "hello";
		char ch [] = inputstring.toCharArray();
		for(int i = 0;i<ch.length-1;i++)
		{
			for(int j =i+1;j<ch.length;j++)
			{
			  if(ch[i]==ch[j])
			  {
				  System.out.println(ch[i]);
			  }
			}
			
		}
		
		
		
	}

}
