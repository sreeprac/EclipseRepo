package com.programs.string;

public class ReverseAString {

	
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("reverse");
		
			System.out.println(sb.reverse());
			String reverse = "abc";
			char arr[] = reverse.toCharArray();
			
			for(int i = reverse.length()-1;i>=0;i--)
			{
				System.out.print(arr[i]);
				
			}
	}

}
