












import java.util.Scanner;

/**
 * 
 * @author Gene
 *
 */
public class StudentDemo 
{ 
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		
		Student stu1 = new Student("Sam");
		int score;
		int i;
		
		System.out.println("Enter scores terminated by -1");
		score = in.nextInt();
		while ( score > 0)
		{
			stu1.addQuiz(score);
			score = in.nextInt();
			
		}
		
		stu1.setName("Sammy");
		System.out.printf(" Average for %s is %.1f", stu1.getName(), stu1.getAverage());
		
	}
	
}
