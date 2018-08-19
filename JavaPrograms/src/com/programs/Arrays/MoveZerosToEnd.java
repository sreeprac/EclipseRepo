package com.programs.Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int [] array = {1,0,6,7,0,8,0};
   int counter = 0;
    for(int i  =0;i<array.length;i++)
    {
    	if(array[i]!=0)
    	{
    		array[counter]=array[i];
    		counter++;
    	}
    }
    while(counter < array.length)
    {
    	array[counter]=0;
    	counter++;
    }
   
   
  System.out.println(Arrays.toString(array));
	}

}
