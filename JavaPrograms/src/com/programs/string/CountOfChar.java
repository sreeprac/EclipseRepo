package com.programs.string;

public class CountOfChar {

	
	public static void numberOfCharecters(String string,String ch)
	{
		String result = string.replace(ch, "");
		
System.out.println("The occurences of character :"+( string.length() - result.length()));
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberOfCharecters("hello lllo","o");
	}

}
