/* Fibonacci Program was completed last Saturday. 
 * Prime Number Program was not completed at that time.
 * So have included this Program along with Day 2 Assignment package.
 */

package week1.day2.assignments;

public class IsPrime 
{
	public static void main(String[] args) 
	{
    	int num = 11;
		boolean isPrime = true;

		for(int i= 2; i<num; i++)
		{
			if(num%2 == 0)
			{
				System.out.println("Given number is not Prime");
				isPrime = false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("Given number is Prime");
		}
	}
}
