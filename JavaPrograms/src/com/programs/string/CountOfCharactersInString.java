package com.programs.string;

import java.util.HashMap;
import java.util.HashSet;

public class CountOfCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString = new String("hello hello");
		String[] stringarray = inputString.trim().replace(" ", "").split("");
		
		HashMap<String,Integer> hashmap = new HashMap<String,Integer> ();
		for(String s : stringarray)
		{
			if(hashmap.containsKey(s))
			{
				hashmap.put(s,hashmap.get(s)+1);
			}
			else
			{
				hashmap.put(s, 1);
			}
		}
		System.out.println(hashmap);
		
		System.out.println("============duplicate characters==================");
		
		HashSet<String> hashset = new HashSet<String>( hashmap.keySet());
		
		for(String str  : hashset)
		{
			if(hashmap.get(str)>1)
			{
				System.out.print(str+" ");
			}
		}

	}

}
