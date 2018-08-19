package com.programs.string;

public class NumberOfWords {

	public static void NumberOfWordsCount(String string)
	{
		int count = string.trim().split(" ").length;
		System.out.println("no of words = "+count);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfWordsCount("hai hello");
		NumberOfWordsCount("hai   hello");
		String text = "hai   hello";
		
		int count = 1;
		for(int i=0;i<text.length();i++)
		{
			if(text.charAt(i)==' ' && text.charAt(i+1)!=' ')
			{
				count++;
			}
		}
		System.out.println("no of words "+count);
	}

}
