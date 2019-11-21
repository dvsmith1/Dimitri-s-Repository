/*Dimitri smith
 *  march 4, 2017
 *  bartime
 *  
 *  pseudocode
 *  initialize all variables(MAXPOPULATION, currentpopulation, incomingppl)
 *  while incoming people is less than the bar's maximum population
 *  	prompt user for group size
 *  	if currentpopulation + incoming people is less than max bar population
 *  	display welcome 
 *  	add incoming people to currentpopulation
 *  		otherwise 
 *  		display message group exceeds capacity
 *  	display message showing the current amount of people inside the bar.
 *  display message bar is full
 * 
 */
import java.util.Scanner;
public class DiMitriSmith_Barentrance
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		final int MAXPOPULATION = 100;
		int currentpopulation = 0, incomingpeople;
		do 
		{
		    System.out.print("Size of group entering: ");
		    incomingpeople = in.nextInt();
		    	if (currentpopulation + incomingpeople <= MAXPOPULATION) 
		    	{
		    		System.out.println("Welcome");
		    		currentpopulation += incomingpeople;
		    	}
		    	else 
		    		{
		    		System.out.println("Group exceeds bar capacity.");
		    		}
		    		System.out.println("Current amount of people " + currentpopulation + " in the oyster bar");
		} while (currentpopulation < MAXPOPULATION);
		
		System.out.println("Oyster bar is full.");
	    }
}

