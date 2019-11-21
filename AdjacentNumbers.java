/*Dashawn smith
 * 
 */
import java.util.Scanner;

public class AdjacentNumbers 
{

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int numbers;
		int pastNumbers = 0;
		
		
		System.out.print(" enter some numbers:");
		pastNumbers = in.nextInt();
		while(in.hasNextInt())
		{
		
		numbers = in.nextInt();
	
		if(numbers  == pastNumbers)
		{
			System.out.print(numbers + " ");
			pastNumbers= numbers  ;
		}		
		}
	}
}
