import java.util.Scanner;
public class FindCharacters 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		// Initialize all variables
		String word = "";
		// prompt user
		System.out.print(" enter a word: ");
		word = in.next();
		
		// calculate the permutation
		for(int n = 0 ; n < word.length(); n++)
		{
			String first , middle, last;
			// use random to pick a position
			int  i = (int) (Math.random() * word.length()-1 );
			int j = (int) (Math.random() * (word.length()- i -1)+i+ 1);
			
				first = word.substring(0,i);
				middle = word.substring(i+1, j);
				last = word.substring(j+1);
				
				word = first + word.charAt(j) + middle + word.charAt(i)+ last;
				
				
		}
		System.out.println("permuted word " + word);
	}

}
