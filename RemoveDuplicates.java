package week1.day2.assignments;

import java.util.Arrays;

public class RemoveDuplicates 
{
	public static void main(String[] args) 
	{
		/* Pseudo code 
		 * a) Use the declared String text as input
		    String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 * g) Displaying the String without duplicate words	
		 */

		String str1 = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] str2 = str1.split(" ");
		int length = str2.length;

		for(int i=0; i<length; i++)
		{
			for (int j=0; j<length; j++)
			{
				if (str2[i].contains(str2[j]))
				{
					count++;
				}
				if(count>1)
				{
					str1 = str1.replace(str2[i],"");
				}
			} 
			count = 0;
		}
		System.out.println(str1);
	}
}
