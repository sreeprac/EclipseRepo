package com.programs.string;

import java.util.HashMap;

public class DuplicatesWordsAndOcuuren {

	
	public  static void duplicateWords(String text)
	{
			
		
		String [] word = text.split(" ");
		
		
		HashMap<String,Integer> hashmap = new HashMap<String,Integer>();
		
		for(String s : word)
		{
			if(hashmap.containsKey(s))
			{
				hashmap.put(s, hashmap.get(s)+1);
			}
			else
			{
				hashmap.put(s, 1);
			}
		}
	
		System.out.println(hashmap);
		
		}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		duplicateWords("Bread butter and bread");
		 
        duplicateWords("Java is java again java");
 
        duplicateWords("Super Man Bat Man Spider Man");
				
	}
	}


