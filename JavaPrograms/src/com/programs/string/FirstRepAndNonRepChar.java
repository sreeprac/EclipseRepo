package com.programs.string;

import java.util.HashMap;

public class FirstRepAndNonRepChar {

	public static void main(String[] args) 
	{

		String inputstring = "javaconceptofday";
		char[] strArray = inputstring.toCharArray();
		HashMap<Character,Integer> charCountMap = new HashMap<Character,Integer>();
		for(char s : strArray)
		{
			if(charCountMap.containsKey(s))
			{
				charCountMap.put(s, charCountMap.get(s)+1);
				
			}
			else
			{
				charCountMap.put(s, 1);
			}
		}
		//checking for first non-repeated character
        
        for (char c : strArray)
        {
            if (charCountMap.get(c) == 1)
            {
                System.out.println("First Non-Repeated Character In '"+inputstring+"' is '"+c+"'");
                 
                break;
            }
        }
         
        //checking for first repeated character
         
        for (char c : strArray)
        {
            if (charCountMap.get(c) > 1)
            {
                System.out.println("First Repeated Character In '"+inputstring+"' is '"+c+"'");
                 
                break;
            }
        }
		
	}

}
