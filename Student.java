








/**
 * 
 * @author John Doe
 * 
 * This class does blah
 * 
 */
public class Student
{
	private String name;
	private int total;
	private int numQuizzes;
	
	/**
	 * 
	 * @param stuName =Student name
	 * 
	 */
	public Student(String stuName)
	{
		name = stuName;
		total = 0;
		numQuizzes = 0;
	}
	
	/**
	 * 
	 * @return the name
	 */
	public String getName()
	{//accessor method
		return name;
	}
	
	public void setName(String n)
	{// mutator method
		name = n;
	}
	
	/**
	 *  Adds score to a total
	 * @param score The score to added
	 */
	public void addQuiz(int score)
	{
		total = total + score;
		numQuizzes++;
	}
	
	/**
	 * Calculates the average
	 * @return the average
	 */
	public double getAverage()
	{
		double ave;
		if (numQuizzes > 0)
			ave = (double)total / numQuizzes;
		else
			ave = 0;
		
		return ave;
	}
}
