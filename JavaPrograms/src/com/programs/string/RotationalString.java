package com.programs.string;

public class RotationalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			String s1 = "abcde";
			String s2 = "cdeab";
			if(s1.length()!=s2.length())
			{
				System.out.println("s1 and s2 are not rotational strings");
			}
			else
			{
				String s3 = s1+s1;
				
				if(s3.contains(s2))
				{
					System.out.println("both are rotational strings");
				}
			}
	}

}
