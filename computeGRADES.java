/*DiMitri Smith
 * February 24,2017
 * compute grades
 * 
 * Pseudocode
 * 
 * initialize all variables( firstName, LastName, score,totalScore)
 * prompt user for student records
 * read first name,(next())
 *  read last(next())
 * repeat until first name is End
 *  read score
 *  read until score is -1
 *  calculate total score by adding score 
 *  read score
 *  display firstname, lastname, and totalScore
 *  
 *  
 */
import java.util.Scanner;
public class computeGRADES
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String fName= "", lName = "";
		int grades = 0, totalgrades = 0;
			
		System.out.println("Enter student records: ");
				fName = in.next();
				lName = in.next();
				
		
		while(!fName.equals("END"))
		{
			grades= in.nextInt();
			while(grades != -1)
			{
				
				grades= in.nextInt();
				totalgrades += grades;
			}
			System.out.printf("First name " + fName);
				System.out.printf(lName);
				System.out.printf(" total Score : " + totalgrades);
				System.out.println();
		}	
				
	}
		
}
