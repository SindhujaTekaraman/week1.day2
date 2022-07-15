package week1.day2.assignments;

public class ChangeOddIndexToUpperCase 
{
	public static void main(String[] args) 
	{
	   /* 
	    * Pseudo Code
	    * Declare String Input as Follow
	    * String test = "changeme";
	    * a) Convert the String to character array
	    * b) Traverse through each character (using loop)
	    * c) find the odd index within the loop (use mod operator)
	    * d) within the loop, change the character to uppercase, if the index is odd else don't change
	    */
		
		String str = "changeme";
		char[] chr = str.toCharArray();
		int length = chr.length;
		
		System.out.println("Odd index are: ");
		for(int i = 0; i<length; i++)
		{
			if(i%2!=0)
			{
				chr[i] = Character.toUpperCase(chr[i]);
				System.out.println("chr["+i+"] = "+chr[i]);
			}
		}
	}
}
