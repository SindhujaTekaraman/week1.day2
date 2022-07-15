package week1.day2.assignments;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		//Build a logic to find the given string is palindrome or not
		/* Pseudo Code
		 * a) Declare A String value as "madam"
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */

		String str = "madam";
		String revStr = "";

		char[] chr = str.toCharArray();
		int length = chr.length;

		for(int i=length-1; i>=0; i--)
		{
			revStr = revStr + chr[i];
		}  

		if(str.equalsIgnoreCase(revStr))
		{
			System.out.println("Given String "+ str +" ïs a palindrome.");
		}
		else
		{   
			System.out.println("Given String "+ str +" ïs not a palindrome.");
		}
	}
}

