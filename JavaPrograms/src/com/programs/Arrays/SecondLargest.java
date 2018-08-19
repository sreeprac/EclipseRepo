package com.programs.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int [] arr ={1,2,11,24,3,4,5,6,7,9};
   
   int firstlargest = 0;
   int secondlargest = 0;
  
   if(arr[0]>arr[1])
  {
   firstlargest = arr[0];
   secondlargest = arr[1];
  }
   else
   {

	   firstlargest = arr[1];
	   secondlargest = arr[0];
   }
   
   for(int i = 2;i<arr.length-1;i++)
   {
	    if(arr[i]>firstlargest)
	    {
	    	secondlargest = firstlargest;
	    	firstlargest = arr[i];
	    }
	    else if(arr[i]>secondlargest && arr[i]<firstlargest)
	    {
	    	secondlargest = arr[i];
	    }
	   
   }
   System.out.println(firstlargest + "--first");
   System.out.println(secondlargest + "--second");
	}

}
